package core.basesyntax;

public abstract class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public final void draw() {
        System.out.print("Figure: " + getFigureType() + ", ");
        System.out.printf("area: %.2f sq. units, ", getArea());
        System.out.print(getSpecificProperties());
        System.out.println(", color: " + color);
    }

    protected abstract String getFigureType();

    protected abstract double getArea();

    protected abstract String getSpecificProperties();
}

