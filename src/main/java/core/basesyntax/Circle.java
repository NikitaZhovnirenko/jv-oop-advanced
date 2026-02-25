package core.basesyntax;

class Circle implements Figure {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq. units,"
                        + " radius: %.1f units, color: %s%n",
                getArea(), radius, getColor());
    }
}
