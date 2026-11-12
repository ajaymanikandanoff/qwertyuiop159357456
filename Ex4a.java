// Ex : 4a - Demonstrate Method Overloading (Compile-Time Polymorphism)

class Area {
    // Overloaded method 1: Calculate area of a Square (1 integer parameter)
    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square (side = " + side + ") : " + area);
    }

    // Overloaded method 2: Calculate area of a Rectangle (2 integer parameters)
    void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle (length = " + length + ", breadth = " + breadth + ") : " + area);
    }

    // Overloaded method 3: Calculate area of a Circle (1 double parameter)
    void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle (radius = " + radius + ") : " + String.format("%.2f", area));
    }
}

public class Ex4a {
    public static void main(String[] args) {
        // Create an object of Area class
        Area obj = new Area();

        System.out.println("----- Method Overloading Demonstration -----");
        // Invoking overloaded methods with different argument lists
        obj.calculateArea(5);        // Calls square method
        obj.calculateArea(10, 4);    // Calls rectangle method
        obj.calculateArea(3.5);      // Calls circle method
    }
}
