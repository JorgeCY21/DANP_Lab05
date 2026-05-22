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
import com.example.laboratorio_05.model.Product
import com.example.laboratorio_05.ui.components.AppButton
import com.example.laboratorio_05.ui.components.AppToolbar
import com.example.laboratorio_05.ui.components.CartProductItem

@Composable
fun CartScreen(
    cartProducts: List<Product>,
    onBackClick: () -> Unit,
    onRemoveFromCart: (Product) -> Unit
) {
    val total = cartProducts.sumOf { it.price }

    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            AppToolbar(title = "Carrito")

            if (cartProducts.isEmpty()) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Tu carrito está vacío.",
                        style = MaterialTheme.typography.titleLarge
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    AppButton(
                        text = "Volver",
                        onClick = onBackClick
                    )
                }
            } else {
                LazyColumn(
                    modifier = Modifier.weight(1f)
                ) {
                    items(cartProducts) { product ->
                        CartProductItem(
                            product = product,
                            onRemoveClick = onRemoveFromCart
                        )
                    }
                }

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Total: $${"%.2f".format(total)}",
                        style = MaterialTheme.typography.titleLarge
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    AppButton(
                        text = "Finalizar compra",
                        onClick = {
                            // Aquí luego podrías agregar lógica de pago o confirmación.
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