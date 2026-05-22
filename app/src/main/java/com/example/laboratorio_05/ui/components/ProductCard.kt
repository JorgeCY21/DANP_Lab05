package com.example.laboratorio_05.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.laboratorio_05.model.Product

@Composable
fun ProductCard(
    product: Product,
    isFavorite: Boolean,
    modifier: Modifier = Modifier,
    onViewDetail: (Product) -> Unit,
    onFavoriteClick: (Product) -> Unit,
    onAddToCartClick: (Product) -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column {
            AsyncImage(
                model = product.imageUrl,
                contentDescription = product.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
            )

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = product.name,
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = product.description,
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Categoría: ${product.category}",
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "S/.${product.price}",
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(12.dp))

                AppButton(
                    text = "Ver detalle",
                    onClick = {
                        onViewDetail(product)
                    }
                )

                Spacer(modifier = Modifier.height(8.dp))

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
            }
        }
    }
}