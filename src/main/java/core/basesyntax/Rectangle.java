package core.basesyntax;

class Rectangle extends AbstractFigure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.2f sq. units, width: %.1f units, height:"
                        + " %.1f units, color: %s%n",
                getArea(), width, height, getColor());
    }
}
