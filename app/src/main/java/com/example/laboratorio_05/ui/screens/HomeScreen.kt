package com.example.laboratorio_05.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.laboratorio_05.data.ProductRepository
import com.example.laboratorio_05.model.Product
import com.example.laboratorio_05.ui.components.*
import com.example.laboratorio_05.ui.theme.AppThemeMode

@Composable
fun HomeScreen(
    navController: NavController,
    currentTheme: AppThemeMode,
    favoriteProducts: List<Product>,
    cartProducts: List<Product>,
    onThemeChange: (AppThemeMode) -> Unit,
    onFavoriteClick: (Product) -> Unit,
    onAddToCartClick: (Product) -> Unit
) {
    var searchQuery by remember {
        mutableStateOf("")
    }

    var selectedCategory by remember {
        mutableStateOf<String?>(null)
    }

    val filteredProducts = ProductRepository.products.filter { product ->
        val matchesSearch = product.name.contains(searchQuery, ignoreCase = true) ||
                product.description.contains(searchQuery, ignoreCase = true) ||
                product.category.contains(searchQuery, ignoreCase = true)

        val matchesCategory = selectedCategory == null || product.category == selectedCategory

        matchesSearch && matchesCategory
    }

    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            AppToolbar(title = "Modular Store")

            Spacer(modifier = Modifier.height(8.dp))

            ThemeSelector(
                currentTheme = currentTheme,
                onThemeSelected = onThemeChange
            )

            Spacer(modifier = Modifier.height(12.dp))

            SearchBar(
                query = searchQuery,
                onQueryChange = {
                    searchQuery = it
                }
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                AppButton(
                    text = "Favoritos (${favoriteProducts.size})",
                    modifier = Modifier.weight(1f),
                    onClick = {
                        navController.navigate("favorites")
                    }
                )

                AppButton(
                    text = "Carrito (${cartProducts.size})",
                    modifier = Modifier.weight(1f),
                    onClick = {
                        navController.navigate("cart")
                    }
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                item {
                    Text(
                        text = "Categorías",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                    )
                }

                item {
                    AppButton(
                        text = "Mostrar todos los productos",
                        modifier = Modifier.padding(horizontal = 16.dp),
                        onClick = {
                            selectedCategory = null
                        }
                    )
                }

                items(ProductRepository.categories) { category ->
                    CategoryCard(
                        category = category,
                        onCategoryClick = {
                            selectedCategory = it.name
                        }
                    )
                }

                item {
                    Text(
                        text = if (selectedCategory == null) {
                            "Productos"
                        } else {
                            "Productos de $selectedCategory"
                        },
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                    )
                }

                if (filteredProducts.isEmpty()) {
                    item {
                        Text(
                            text = "No se encontraron productos.",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                } else {
                    items(filteredProducts) { product ->
                        ProductCard(
                            product = product,
                            isFavorite = favoriteProducts.any { it.id == product.id },
                            onViewDetail = {
                                navController.navigate("detail/${it.id}")
                            },
                            onFavoriteClick = onFavoriteClick,
                            onAddToCartClick = onAddToCartClick
                        )
                    }
                }
            }
        }
    }
}