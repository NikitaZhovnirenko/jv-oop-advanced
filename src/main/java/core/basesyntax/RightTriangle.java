package core.basesyntax;

class RightTriangle implements Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle,"
                        + " area: %.1f sq. units,"
                        + " firstLeg: %.1f units, secondLeg:"
                        + " %.1f units, color: %s%n",
                getArea(), firstLeg, secondLeg, getColor());
    }
}
