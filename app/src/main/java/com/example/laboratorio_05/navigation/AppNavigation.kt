package com.example.laboratorio_05.navigation

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.laboratorio_05.data.ProductRepository
import com.example.laboratorio_05.model.Product
import com.example.laboratorio_05.ui.screens.CartScreen
import com.example.laboratorio_05.ui.screens.DetailScreen
import com.example.laboratorio_05.ui.screens.FavoritesScreen
import com.example.laboratorio_05.ui.screens.HomeScreen
import com.example.laboratorio_05.ui.theme.AppThemeMode

@Composable
fun AppNavigation(
    currentTheme: AppThemeMode,
    onThemeChange: (AppThemeMode) -> Unit
) {
    val navController = rememberNavController()

    var favoriteProducts by remember {
        mutableStateOf<List<Product>>(emptyList())
    }

    var cartProducts by remember {
        mutableStateOf<List<Product>>(emptyList())
    }

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                navController = navController,
                currentTheme = currentTheme,
                favoriteProducts = favoriteProducts,
                cartProducts = cartProducts,
                onThemeChange = onThemeChange,
                onFavoriteClick = { product ->
                    favoriteProducts = if (favoriteProducts.any { it.id == product.id }) {
                        favoriteProducts.filter { it.id != product.id }
                    } else {
                        favoriteProducts + product
                    }
                },
                onAddToCartClick = { product ->
                    cartProducts = cartProducts + product
                }
            )
        }

        composable("detail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments
                ?.getString("productId")
                ?.toIntOrNull()

            val product = productId?.let {
                ProductRepository.getProductById(it)
            }

            DetailScreen(
                product = product,
                isFavorite = product?.let { selectedProduct ->
                    favoriteProducts.any { it.id == selectedProduct.id }
                } ?: false,
                onBackClick = {
                    navController.popBackStack()
                },
                onFavoriteClick = { selectedProduct ->
                    favoriteProducts = if (favoriteProducts.any { it.id == selectedProduct.id }) {
                        favoriteProducts.filter { it.id != selectedProduct.id }
                    } else {
                        favoriteProducts + selectedProduct
                    }
                },
                onAddToCartClick = { selectedProduct ->
                    cartProducts = cartProducts + selectedProduct
                }
            )
        }

        composable("favorites") {
            FavoritesScreen(
                navController = navController,
                favoriteProducts = favoriteProducts,
                onRemoveFavorite = { product ->
                    favoriteProducts = favoriteProducts.filter { it.id != product.id }
                },
                onAddToCartClick = { product ->
                    cartProducts = cartProducts + product
                }
            )
        }

        composable("cart") {
            CartScreen(
                cartProducts = cartProducts,
                onBackClick = {
                    navController.popBackStack()
                },
                onRemoveFromCart = { product ->
                    cartProducts = cartProducts.filterIndexed { index, item ->
                        item.id != product.id || index != cartProducts.indexOf(product)
                    }
                }
            )
        }
    }
}