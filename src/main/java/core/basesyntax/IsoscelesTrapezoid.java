package core.basesyntax;
class IsoscelesTrapezoid implements Figure {
    private final double longerBase;
    private final double shorterBase;
    private final double height;
    private final String color;

    public IsoscelesTrapezoid(double baseA, double baseB, double height, String color) {
        this.longerBase  = Math.max(baseA, baseB);
        this.shorterBase = Math.min(baseA, baseB);
        this.height      = height;
        this.color       = color;
    }

    @Override
    public double getArea() {
        return (longerBase + shorterBase) / 2.0 * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.2f sq. units,"
                        + " bases: %.1f & %.1f units, "
                        + "height: %.1f units, color: %s%n",
                getArea(), longerBase, shorterBase, height, getColor());
    }
}