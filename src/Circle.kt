class Circle(var x: Int, var y: Int, var radius: Int) : Figure(0), Movable, Transforming {
    override fun area(): Float {
        return (Math.PI * radius * radius).toFloat()
    }
    
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }
    
    override fun resize(zoom: Int) {
        radius = (radius * zoom / 100).coerceAtLeast(1)
    }
    
    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        // Для круга поворот не имеет смысла, так как он симметричен
        // Оставляем пустую реализацию
    }
}