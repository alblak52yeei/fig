class Square(var x: Int, var y: Int, var size: Int) : Figure(0), Movable, Transforming {
    override fun area(): Float {
        return (size * size).toFloat()
    }
    
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }
    
    override fun resize(zoom: Int) {
        size = (size * zoom / 100).coerceAtLeast(1)
    }
    
    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        // Для квадрата поворот не изменяет его форму, так как он симметричен
        // Оставляем пустую реализацию
    }
}