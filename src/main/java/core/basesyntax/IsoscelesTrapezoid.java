package core.basesyntax;

class IsoscelesTrapezoid extends AbstractFigure {
    private double longerBase;
    private double shorterBase;
    private double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height, String color) {
        super(color);
        this.longerBase = Math.max(baseA, baseB);
        this.shorterBase = Math.min(baseA, baseB);
        this.height = height;
    }

    @Override
    public double getArea() {
        return (longerBase + shorterBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.2f sq. units, bases:"
                        + " %.1f & %.1f units, height: %.1f units, color: %s%n",
                getArea(), longerBase, shorterBase, height, getColor());
    }
}
