package core.basesyntax;

class RightTriangle extends Figure {
    private double legA;
    private double legB;

    public RightTriangle(double legA, double legB, String color) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    protected String getFigureType() {
        return "right triangle";
    }

    @Override
    public double getArea() {
        return legA * legB / 2;
    }

    @Override
    protected String getSpecificProperties() {
        return String.format("leg a: %.1f units, leg b: %.1f units", legA, legB);
    }
}
