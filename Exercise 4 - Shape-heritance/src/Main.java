public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", "Red", 3);
        Rectangle rectangle = new Rectangle("Rectangle", "Blue", 4, 6);
        Triangle triangle = new Triangle("Triangle", "Yellow", 3, 4);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

    }
}