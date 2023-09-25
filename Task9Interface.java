package GroupProject2;
/*Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code
 */

public class Task9Interface {
    public interface Shape {
        double area();

        double perimeter();
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Square implements Shape {

        private double side;


        public Square(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }

        @Override
        public double perimeter() {
            return side * 4;
        }
    }

        public static void main(String[] args) {
            Circle circle = new Circle(2);
            System.out.println("Circle Area: " + circle.area());
            System.out.println("Circle Perimeter: " + circle.perimeter());

            Square square = new Square(2);
            System.out.println("Square Area: " + square.area());
            System.out.println("Square Perimeter: " + square.perimeter());


        }

    }
