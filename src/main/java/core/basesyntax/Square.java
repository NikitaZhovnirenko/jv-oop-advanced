package core.basesyntax;

class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    protected String getFigureType() {
        return "square";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    protected String getSpecificProperties() {
        return String.format("side: %.1f units", side);
    }
}
