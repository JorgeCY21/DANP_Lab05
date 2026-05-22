package com.example.laboratorio_05.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.laboratorio_05.model.Product
import com.example.laboratorio_05.ui.components.AppButton
import com.example.laboratorio_05.ui.components.AppToolbar
import com.example.laboratorio_05   .ui.components.ProductCard

@Composable
fun FavoritesScreen(
    navController: NavController,
    favoriteProducts: List<Product>,
    onRemoveFavorite: (Product) -> Unit,
    onAddToCartClick: (Product) -> Unit
) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            AppToolbar(title = "Favoritos")

            if (favoriteProducts.isEmpty()) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Aún no tienes productos favoritos.",
                        style = MaterialTheme.typography.titleLarge
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    AppButton(
                        text = "Volver al inicio",
                        onClick = {
                            navController.popBackStack()
                        }
                    )
                }
            } else {
                LazyColumn {
                    items(favoriteProducts) { product ->
                        ProductCard(
                            product = product,
                            isFavorite = true,
                            onViewDetail = {
                                navController.navigate("detail/${it.id}")
                            },
                            onFavoriteClick = {
                                onRemoveFavorite(it)
                            },
                            onAddToCartClick = onAddToCartClick
                        )
                    }

                    item {
                        Spacer(modifier = Modifier.height(8.dp))

                        AppButton(
                            text = "Volver",
                            modifier = Modifier.padding(16.dp),
                            onClick = {
                                navController.popBackStack()
                            }
                        )
                    }
                }
            }
        }
    }
}