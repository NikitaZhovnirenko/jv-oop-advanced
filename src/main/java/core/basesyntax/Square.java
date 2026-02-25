package core.basesyntax;

class Square implements Figure {
    private final double side;
    private final String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.1f sq. units, side: %.1f units, color: %s%n",
                getArea(), side, getColor());
    }
}
