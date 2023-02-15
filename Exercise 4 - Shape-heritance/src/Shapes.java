public class Shapes {
    private String shapeName;
    private String colour;
    private double area;

    public Shapes(String shapeName, String colour) {
        this.shapeName = shapeName;
        this.colour = colour;
    }
    public double getArea() {
        return area;
    }
    public String getShapeName() {
        return shapeName;
    }
    public String getColour() {
        return colour;
    }
    @Override
    public String toString() {
        return "This is a " + getColour() + " " + getShapeName() + " with an area of " + getArea();
    }
}

