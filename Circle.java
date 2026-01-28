package panoi2;

public class Circle {
    private double radius;

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    // Area = πr²
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Circumference = 2πr
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}