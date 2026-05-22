package com.example.laboratorio_05.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.laboratorio_05.model.Product
import com.example.laboratorio_05.ui.components.AppButton
import com.example.laboratorio_05.ui.components.AppToolbar

@Composable
fun DetailScreen(
    product: Product?,
    isFavorite: Boolean,
    onBackClick: () -> Unit,
    onFavoriteClick: (Product) -> Unit,
    onAddToCartClick: (Product) -> Unit
) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            AppToolbar(title = "Detalle del producto")

            if (product == null) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Producto no encontrado.",
                        style = MaterialTheme.typography.titleLarge
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    AppButton(
                        text = "Volver",
                        onClick = onBackClick
                    )
                }
            } else {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .padding(bottom = 24.dp)
                ) {
                    AsyncImage(
                        model = product.imageUrl,
                        contentDescription = product.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(260.dp)
                    )

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = product.name,
                            style = MaterialTheme.typography.headlineMedium
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = product.description,
                            style = MaterialTheme.typography.titleMedium
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Categoría: ${product.category}",
                            style = MaterialTheme.typography.bodyLarge
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Precio: $${product.price}",
                            style = MaterialTheme.typography.titleLarge
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "Descripción completa",
                            style = MaterialTheme.typography.titleLarge
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = product.longDescription,
                            style = MaterialTheme.typography.bodyLarge
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        AppButton(
                            text = if (isFavorite) "Quitar de favoritos" else "Agregar a favoritos",
                            onClick = {
                                onFavoriteClick(product)
                            }
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        AppButton(
                            text = "Agregar al carrito",
                            onClick = {
                                onAddToCartClick(product)
                            }
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        AppButton(
                            text = "Volver",
                            onClick = onBackClick
                        )
                    }
                }
            }
        }
    }
}