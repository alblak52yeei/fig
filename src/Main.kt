fun main() {
    println("=== Тестирование функциональности фигур ===")
    
    // Создание фигур
    val rect = Rect(10, 10, 20, 30)
    val circle = Circle(50, 50, 15)
    val square = Square(100, 100, 25)
    
    println("Исходные параметры:")
    println("Прямоугольник: x=${rect.x}, y=${rect.y}, width=${rect.width}, height=${rect.height}, area=${rect.area()}")
    println("Круг: x=${circle.x}, y=${circle.y}, radius=${circle.radius}, area=${circle.area()}")
    println("Квадрат: x=${square.x}, y=${square.y}, size=${square.size}, area=${square.area()}")
    
    // Тестирование перемещения
    println("\n=== Тестирование перемещения ===")
    rect.move(5, 10)
    circle.move(-10, 5)
    square.move(15, -5)
    
    println("После перемещения:")
    println("Прямоугольник: x=${rect.x}, y=${rect.y}")
    println("Круг: x=${circle.x}, y=${circle.y}")
    println("Квадрат: x=${square.x}, y=${square.y}")
    
    // Тестирование масштабирования
    println("\n=== Тестирование масштабирования ===")
    println("До масштабирования - Прямоугольник: width=${rect.width}, height=${rect.height}")
    rect.resize(150) // увеличение на 50%
    circle.resize(75) // уменьшение на 25%
    square.resize(200) // увеличение в 2 раза
    
    println("После масштабирования:")
    println("Прямоугольник: width=${rect.width}, height=${rect.height}, area=${rect.area()}")
    println("Круг: radius=${circle.radius}, area=${circle.area()}")
    println("Квадрат: size=${square.size}, area=${square.area()}")
    
    // Тестирование поворота
    println("\n=== Тестирование поворота ===")
    println("До поворота - Прямоугольник: x=${rect.x}, y=${rect.y}, width=${rect.width}, height=${rect.height}")
    rect.rotate(RotateDirection.Clockwise, 50, 50)
    println("После поворота - Прямоугольник: x=${rect.x}, y=${rect.y}, width=${rect.width}, height=${rect.height}")
    
    // Тестирование с коллекциями
    println("\n=== Тестирование с коллекциями ===")
    val movableFigures: Array<Movable> = arrayOf(rect, circle, square)
    val transformingFigures: Array<Transforming> = arrayOf(rect, circle, square)
    
    println("Перемещение всех фигур на (2, 2):")
    movableFigures.forEach { it.move(2, 2) }
    movableFigures.forEachIndexed { index, figure ->
        when (figure) {
            is Rect -> println("Фигура $index (Rect): x=${figure.x}, y=${figure.y}")
            is Circle -> println("Фигура $index (Circle): x=${figure.x}, y=${figure.y}")
            is Square -> println("Фигура $index (Square): x=${figure.x}, y=${figure.y}")
        }
    }
}