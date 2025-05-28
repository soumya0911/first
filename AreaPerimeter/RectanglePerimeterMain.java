// RectanglePerimeter.java
class RectanglePerimeter {
    double length;
    double breadth;

    // Constructor
    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Display method
    public void displayPerimeter() {
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
}


// Main.java
public class RectanglePerimeterMain {
    public static void main(String[] args) {
    
        // Rectangle for perimeter
        RectanglePerimeter perimeterRect = new RectanglePerimeter(10, 5);
        perimeterRect.displayPerimeter();
    }
}