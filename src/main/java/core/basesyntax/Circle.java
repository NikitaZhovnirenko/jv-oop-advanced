package core.basesyntax;

class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    protected String getFigureType() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected String getSpecificProperties() {
        return String.format("radius: %.1f units", radius);
    }
}
