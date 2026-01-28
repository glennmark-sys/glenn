package panoi2;

public class Main {
    public static void main(String[] args) {

        // Rectangle object
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setWidth(5);

        System.out.println("Figure: Rectangle");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println();

        // Circle object
        Circle cir = new Circle();
        cir.setRadius(7);

        System.out.println("Figure: Circle");
        System.out.println("Radius: " + cir.getRadius());
        System.out.println("Area: " + cir.getArea());
        System.out.println("Circumference: " + cir.getCircumference());
    }
}