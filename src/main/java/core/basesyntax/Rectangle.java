package core.basesyntax;
class Rectangle implements Figure {
    private final double width;
    private final double height;
    private final String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.2f sq. units, width: %.1f units, height: %.1f units, color: %s%n",
                getArea(), width, height, getColor());
    }
}
