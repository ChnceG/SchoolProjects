public class Circle {
    private int radius;
    private String colour = "no colour";

    public Circle() {
        radius = 2;
        colour = "Green";
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    public Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public int getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }
    public String getArea(Circle circle) {
        double area = Math.PI*(getRadius()*getRadius());
        return "Area: " + area;
    }
    public String toString() {
        return "Radius: " + getRadius() + "\nColour: " + getColour();
    }
}
