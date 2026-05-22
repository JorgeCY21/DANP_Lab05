# Laboratorio 05 - UI Modular con Jetpack Compose

## Descripción

Este proyecto corresponde al Laboratorio 05 del curso Desarrollo Avanzado en Nuevas Plataformas. La aplicación desarrollada es una tienda modular creada con Jetpack Compose, aplicando componentes reutilizables, navegación entre pantallas, manejo de estado y personalización visual mediante temas.

La app permite visualizar productos, filtrar por búsqueda, revisar categorías, agregar productos a favoritos, añadir productos al carrito y consultar una pantalla de detalles con información ampliada.

## Tecnologías utilizadas

- Kotlin
- Jetpack Compose
- Material 3
- Navigation Compose
- Coil Compose

## Funcionalidades implementadas

### 1. Componente CategoryCard

Se creó un componente reutilizable llamado `CategoryCard`, encargado de mostrar las categorías de productos. Este componente reutiliza `Card`, `Modifier` y `AppButton`, manteniendo una estructura modular y consistente.

### 2. Cuarto tema visual

Se agregó un cuarto tema personalizado llamado `ORANGE`, modificando los colores principales, el fondo, la superficie y la tipografía de la aplicación.

### 3. Pantalla de Favoritos

Se implementó una pantalla donde se muestran los productos marcados como favoritos. El usuario puede agregar o quitar productos de esta sección.

### 4. Carrito de compras

Se agregó una pantalla de carrito que permite visualizar los productos añadidos y calcular el total de la compra.

### 5. SearchBar dinámico

Se incorporó una barra de búsqueda que filtra los productos en tiempo real según el nombre, descripción o categoría.

### 6. Pantalla de Detalles mejorada

La pantalla de detalles muestra información ampliada del producto, incluyendo imagen, nombre, categoría, precio, descripción corta y descripción extendida. También permite agregar el producto a favoritos o al carrito.

## Estructura principal del proyecto

```txt
com.example.laboratorio_05
│
├── data
│   └── ProductRepository.kt
│
├── model
│   ├── Product.kt
│   └── Category.kt
│
├── navigation
│   └── AppNavigation.kt
│
├── ui
│   ├── components
│   │   ├── AppButton.kt
│   │   ├── AppToolbar.kt
│   │   ├── ProductCard.kt
│   │   ├── CategoryCard.kt
│   │   ├── SearchBar.kt
│   │   ├── ThemeSelector.kt
│   │   └── CartProductItem.kt
│   │
│   ├── screens
│   │   ├── HomeScreen.kt
│   │   ├── DetailScreen.kt
│   │   ├── FavoritesScreen.kt
│   │   └── CartScreen.kt
│   │
│   └── theme
│       ├── Color.kt
│       ├── Theme.kt
│       └── Type.kt
│
└── MainActivity.kt
