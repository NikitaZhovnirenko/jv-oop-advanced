package core.basesyntax;

class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    protected String getFigureType() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    protected String getSpecificProperties() {
        return String.format("width: %.1f units, height: %.1f units", width, height);
    }
}
