package com.example.laboratorio_05.data

import com.example.laboratorio_05.model.Category
import com.example.laboratorio_05.model.Product

object ProductRepository {

    val categories = listOf(
        Category(
            id = 1,
            name = "Laptops",
            description = "Equipos potentes para estudio, trabajo y gaming"
        ),
        Category(
            id = 2,
            name = "Periféricos",
            description = "Accesorios para mejorar tu experiencia"
        ),
        Category(
            id = 3,
            name = "Audio",
            description = "Sonido de alta calidad para todo uso"
        ),
        Category(
            id = 4,
            name = "Monitores",
            description = "Pantallas para productividad, diseño y videojuegos"
        ),
        Category(
            id = 5,
            name = "Componentes",
            description = "Partes internas para mejorar tu computadora"
        ),
        Category(
            id = 6,
            name = "Smartphones",
            description = "Celulares modernos para comunicación, estudio y entretenimiento"
        ),
        Category(
            id = 7,
            name = "Accesorios",
            description = "Complementos útiles para tu setup diario"
        )
    )

    val products = listOf(
        Product(
            id = 1,
            name = "Laptop Gamer",
            description = "RTX 4070 + Ryzen 9",
            longDescription = "Laptop gamer de alto rendimiento ideal para videojuegos, diseño, edición de video y tareas exigentes. Cuenta con procesador Ryzen 9, tarjeta gráfica RTX 4070, pantalla de alta tasa de refresco y sistema de refrigeración avanzado.",
            price = 2500.0,
            category = "Laptops",
            imageUrl = "https://images.unsplash.com/photo-1603302576837-37561b2e2302"
        ),
        Product(
            id = 2,
            name = "Laptop Ultrabook",
            description = "Ligera, rápida y elegante",
            longDescription = "Laptop ultraligera ideal para estudiantes y profesionales. Cuenta con batería de larga duración, diseño delgado, almacenamiento SSD y pantalla Full HD.",
            price = 1350.0,
            category = "Laptops",
            imageUrl = "https://images.unsplash.com/photo-1496181133206-80ce9b88a853"
        ),
        Product(
            id = 3,
            name = "Laptop Business Pro",
            description = "Intel i7 + 16GB RAM",
            longDescription = "Laptop empresarial enfocada en productividad. Perfecta para oficina, programación, reuniones virtuales y trabajo multitarea.",
            price = 1600.0,
            category = "Laptops",
            imageUrl = "https://images.unsplash.com/photo-1516321318423-f06f85e504b3"
        ),
        Product(
            id = 4,
            name = "Laptop Student",
            description = "Ideal para clases y tareas",
            longDescription = "Equipo económico y funcional para estudiantes. Permite navegar, usar herramientas de oficina, hacer videollamadas y realizar trabajos académicos.",
            price = 780.0,
            category = "Laptops",
            imageUrl = "https://images.unsplash.com/photo-1484788984921-03950022c9ef"
        ),
        Product(
            id = 5,
            name = "MacBook Style Air",
            description = "Diseño premium y gran batería",
            longDescription = "Laptop de diseño minimalista con gran autonomía, pantalla de alta calidad y excelente rendimiento para productividad, diseño ligero y estudio.",
            price = 1800.0,
            category = "Laptops",
            imageUrl = "https://images.unsplash.com/photo-1517336714731-489689fd1ca8"
        ),

        Product(
            id = 6,
            name = "Mechanical Keyboard",
            description = "RGB Switch Blue",
            longDescription = "Teclado mecánico con iluminación RGB, switches Blue de respuesta táctil y diseño compacto. Ideal para programar, jugar y escribir con mayor precisión.",
            price = 120.0,
            category = "Periféricos",
            imageUrl = "https://images.unsplash.com/photo-1587829741301-dc798b83add3"
        ),
        Product(
            id = 7,
            name = "Gaming Mouse",
            description = "16000 DPI",
            longDescription = "Mouse gamer ergonómico con sensor de alta precisión de hasta 16000 DPI, botones configurables y diseño ligero para sesiones largas de juego.",
            price = 75.0,
            category = "Periféricos",
            imageUrl = "https://images.unsplash.com/photo-1527814050087-3793815479db"
        ),
        Product(
            id = 8,
            name = "Mouse Vertical",
            description = "Diseño ergonómico",
            longDescription = "Mouse vertical diseñado para reducir la tensión en la muñeca. Ideal para largas jornadas de estudio, oficina o programación.",
            price = 48.0,
            category = "Periféricos",
            imageUrl = "https://images.unsplash.com/photo-1615663245857-ac93bb7c39e7"
        ),
        Product(
            id = 9,
            name = "Mousepad XL RGB",
            description = "Base amplia con luces RGB",
            longDescription = "Mousepad extendido para teclado y mouse. Cuenta con bordes reforzados, superficie suave y sistema de iluminación RGB.",
            price = 35.0,
            category = "Periféricos",
            imageUrl = "https://images.unsplash.com/photo-1615663245857-ac93bb7c39e7"
        ),
        Product(
            id = 10,
            name = "Webcam Full HD",
            description = "1080p para videollamadas",
            longDescription = "Cámara web Full HD ideal para clases virtuales, reuniones, streaming y grabaciones. Incluye micrófono integrado y fácil instalación.",
            price = 65.0,
            category = "Periféricos",
            imageUrl = "https://images.unsplash.com/photo-1587825140708-dfaf72ae4b04"
        ),

        Product(
            id = 11,
            name = "Headset Pro",
            description = "Sonido envolvente 7.1",
            longDescription = "Audífonos gamer con sonido envolvente 7.1, micrófono con cancelación de ruido y almohadillas cómodas para largas sesiones de uso.",
            price = 95.0,
            category = "Audio",
            imageUrl = "https://images.unsplash.com/photo-1505740420928-5e560c06d30e"
        ),
        Product(
            id = 12,
            name = "Audífonos Bluetooth",
            description = "Inalámbricos con cancelación",
            longDescription = "Audífonos inalámbricos con cancelación de ruido, batería de larga duración y sonido balanceado para música, clases o llamadas.",
            price = 110.0,
            category = "Audio",
            imageUrl = "https://images.unsplash.com/photo-1484704849700-f032a568e944"
        ),
        Product(
            id = 13,
            name = "Parlante Bluetooth",
            description = "Portátil y resistente",
            longDescription = "Parlante portátil con conexión Bluetooth, sonido potente y diseño resistente para interiores y exteriores.",
            price = 70.0,
            category = "Audio",
            imageUrl = "https://images.unsplash.com/photo-1608043152269-423dbba4e7e1"
        ),
        Product(
            id = 14,
            name = "Micrófono Streaming",
            description = "Audio claro para grabar",
            longDescription = "Micrófono de escritorio ideal para streaming, podcasts, clases virtuales y grabación de contenido. Ofrece sonido claro y reducción de ruido.",
            price = 130.0,
            category = "Audio",
            imageUrl = "https://images.unsplash.com/photo-1590602847861-f357a9332bbc"
        ),
        Product(
            id = 15,
            name = "Barra de Sonido",
            description = "Audio potente para escritorio",
            longDescription = "Barra de sonido compacta para mejorar la experiencia multimedia en computadoras, televisores o consolas.",
            price = 90.0,
            category = "Audio",
            imageUrl = "https://images.unsplash.com/photo-1545454675-3531b543be5d"
        ),

        Product(
            id = 16,
            name = "Monitor UltraWide",
            description = "Pantalla 34 pulgadas",
            longDescription = "Monitor UltraWide de 34 pulgadas con excelente resolución, colores vivos y amplio espacio de trabajo. Perfecto para productividad, diseño y entretenimiento.",
            price = 430.0,
            category = "Monitores",
            imageUrl = "https://images.unsplash.com/photo-1527443224154-c4a3942d3acf"
        ),
        Product(
            id = 17,
            name = "Monitor Gamer 144Hz",
            description = "Alta fluidez en juegos",
            longDescription = "Monitor gamer con tasa de refresco de 144Hz y bajo tiempo de respuesta. Ideal para juegos competitivos y experiencia fluida.",
            price = 280.0,
            category = "Monitores",
            imageUrl = "https://images.unsplash.com/photo-1593640408182-31c70c8268f5"
        ),
        Product(
            id = 18,
            name = "Monitor 4K Diseño",
            description = "Alta resolución y color",
            longDescription = "Monitor 4K orientado a diseñadores, editores y usuarios que necesitan gran precisión visual y excelente calidad de imagen.",
            price = 520.0,
            category = "Monitores",
            imageUrl = "https://images.unsplash.com/photo-1527443224154-c4a3942d3acf"
        ),
        Product(
            id = 19,
            name = "Monitor Curvo",
            description = "Experiencia inmersiva",
            longDescription = "Pantalla curva ideal para videojuegos, películas y multitarea. Su diseño envolvente mejora la comodidad visual.",
            price = 360.0,
            category = "Monitores",
            imageUrl = "https://images.unsplash.com/photo-1593640495253-23196b27a87f"
        ),
        Product(
            id = 20,
            name = "Monitor Portátil",
            description = "Pantalla secundaria liviana",
            longDescription = "Monitor portátil ideal para estudiantes y profesionales que necesitan una segunda pantalla en cualquier lugar.",
            price = 210.0,
            category = "Monitores",
            imageUrl = "https://images.unsplash.com/photo-1547082299-de196ea013d6"
        ),

        Product(
            id = 21,
            name = "SSD NVMe 1TB",
            description = "Alta velocidad de lectura",
            longDescription = "Unidad SSD NVMe de 1TB para mejorar drásticamente la velocidad de arranque, carga de programas y transferencia de archivos.",
            price = 145.0,
            category = "Componentes",
            imageUrl = "https://images.unsplash.com/photo-1591488320449-011701bb6704"
        ),
        Product(
            id = 22,
            name = "Memoria RAM 16GB",
            description = "DDR4 para multitarea",
            longDescription = "Memoria RAM de 16GB ideal para mejorar el rendimiento en juegos, programación, edición y uso multitarea.",
            price = 85.0,
            category = "Componentes",
            imageUrl = "https://images.unsplash.com/photo-1562976540-1502c2145186"
        ),
        Product(
            id = 23,
            name = "Tarjeta Gráfica RTX",
            description = "Potencia para gaming",
            longDescription = "Tarjeta gráfica de alto rendimiento para videojuegos, diseño 3D, edición de video y aplicaciones de inteligencia artificial.",
            price = 720.0,
            category = "Componentes",
            imageUrl = "https://images.unsplash.com/photo-1591488320449-011701bb6704"
        ),
        Product(
            id = 24,
            name = "Fuente 750W",
            description = "Certificación 80 Plus",
            longDescription = "Fuente de poder de 750W con certificación de eficiencia energética. Ideal para equipos gamer y estaciones de trabajo.",
            price = 115.0,
            category = "Componentes",
            imageUrl = "https://images.unsplash.com/photo-1518770660439-4636190af475"
        ),
        Product(
            id = 25,
            name = "Case Gamer RGB",
            description = "Gabinete con ventilación",
            longDescription = "Case gamer con panel lateral transparente, iluminación RGB y buen flujo de aire para mantener los componentes refrigerados.",
            price = 105.0,
            category = "Componentes",
            imageUrl = "https://images.unsplash.com/photo-1587202372775-e229f172b9d7"
        ),

        Product(
            id = 26,
            name = "Smartphone Pro Max",
            description = "Pantalla OLED y gran cámara",
            longDescription = "Smartphone premium con pantalla OLED, cámara de alta resolución, carga rápida y excelente rendimiento para aplicaciones exigentes.",
            price = 980.0,
            category = "Smartphones",
            imageUrl = "https://images.unsplash.com/photo-1511707171634-5f897ff02aa9"
        ),
        Product(
            id = 27,
            name = "Smartphone Lite",
            description = "Buena batería y precio bajo",
            longDescription = "Celular económico con batería duradera, pantalla amplia y rendimiento suficiente para redes sociales, clases y uso diario.",
            price = 280.0,
            category = "Smartphones",
            imageUrl = "https://images.unsplash.com/photo-1598327105666-5b89351aff97"
        ),
        Product(
            id = 28,
            name = "Tablet Student",
            description = "Ideal para leer y tomar apuntes",
            longDescription = "Tablet ligera y práctica para estudiantes. Perfecta para leer PDFs, tomar notas, ver clases y navegar por internet.",
            price = 350.0,
            category = "Smartphones",
            imageUrl = "https://images.unsplash.com/photo-1544244015-0df4b3ffc6b0"
        ),

        Product(
            id = 29,
            name = "Hub USB-C",
            description = "Adaptador multipuerto",
            longDescription = "Hub USB-C con puertos HDMI, USB, lector de tarjetas y carga rápida. Ideal para laptops modernas con pocos puertos.",
            price = 45.0,
            category = "Accesorios",
            imageUrl = "https://images.unsplash.com/photo-1625842268584-8f3296236761"
        ),
        Product(
            id = 30,
            name = "Soporte para Laptop",
            description = "Mejora la postura",
            longDescription = "Soporte ajustable para laptop que ayuda a mejorar la postura y la ventilación del equipo durante largas jornadas de trabajo.",
            price = 38.0,
            category = "Accesorios",
            imageUrl = "https://images.unsplash.com/photo-1527864550417-7fd91fc51a46"
        )
    )

    fun getProductById(id: Int): Product? {
        return products.find { it.id == id }
    }
}