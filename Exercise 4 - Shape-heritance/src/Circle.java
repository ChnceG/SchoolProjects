public class Circle extends Shapes{
    private double radius;
    private double area;

    public Circle(String shapeName, String colour, double radius) {
        super(shapeName, colour);
        this.radius = radius;
    }
    public double getArea() {
        return area = Math.PI*(radius*radius);
    }
}
