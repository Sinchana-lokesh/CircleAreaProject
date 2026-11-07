

public class Circle {

    public double calculateArea(double radius) {

        if (radius < 0) {
            throw new IllegalArgumentException(
                "Radius cannot be negative"
            );
        }

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Circle circle = new Circle();

        double radius = 5;

        System.out.println(
            "Area of Circle: " +
            circle.calculateArea(radius)
        );
    }
}

