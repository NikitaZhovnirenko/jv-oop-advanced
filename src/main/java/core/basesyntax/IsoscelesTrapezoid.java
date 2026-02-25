package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height, String color) {
        super(color);
        this.baseA = Math.max(baseA, baseB);
        this.baseB = Math.min(baseA, baseB);
        this.height = height;
    }

    @Override
    protected String getFigureType() {
        return "isosceles trapezoid";
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / 2 * height;
    }

    @Override
    protected String getSpecificProperties() {
        return String.format("bases: %.1f & %.1f units, height: %.1f units",
                baseA, baseB, height);
    }
}
