package panoi2;

/*
Name: Glennmark Dagnipa
Section:
Topic: Classes, Objects, Setters & Getters, Access Modifiers
Figures Implemented: Rectangle, Circle
*/

public class Rectangle {
    private double length;
    private double width;

    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Area = l × w
    public double getArea() {
        return length * width;
    }

    // Perimeter = 2(l + w)
    public double getPerimeter() {
        return 2 * (length + width);
    }
}