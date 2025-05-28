// RectangleArea.java
class RectangleArea {
    double length;
    double breadth;

    // Constructor
    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    // Display method
    public void displayArea() {
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}

public class RectangleAreaMain {
    public static void main(String[] args) {
        // Rectangle for area
        RectangleArea areaRect = new RectangleArea(10, 5);
        areaRect.displayArea();
    }
}