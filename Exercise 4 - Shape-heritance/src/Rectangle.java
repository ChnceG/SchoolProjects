public class Rectangle extends Shapes{
    private double height;
    private double width;
    private double area;

    public Rectangle(String shapeName, String colour, double height, double width) {
        super(shapeName, colour);
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return area = (width*height);
    }
}
