public class Triangle extends Shapes{
    private double base;
    private double height;
    private double area;

    public Triangle(String shapeName, String colour, double base, double height) {
        super(shapeName, colour);
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return area = ((base*height)/2);
    }
}
