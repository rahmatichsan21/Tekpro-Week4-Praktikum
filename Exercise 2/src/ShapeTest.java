public class ShapeTest {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape = new Shape();
        System.out.println("Shape color: " + shape.getColor());
        System.out.println("Shape filled: " + shape.isFilled());
        shape.setColor("red");
        shape.setFilled(false);
        System.out.println("Shape color: " + shape.getColor());
        System.out.println("Shape filled: " + shape.isFilled());
        System.out.println(shape.toString());

        // Test Circle class
        Circle circle = new Circle();
        System.out.println("Circle radius: " + circle.getRadius());
        circle.setRadius(2.5);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println(circle.toString());
        
        // Test Rectangle class
        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());
        rectangle.setWidth(3.0);
        rectangle.setLength(4.0);
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());
        
     // Test Square class
        Square square = new Square(5.0);
        System.out.println("Square side: " + square.getWidth());
        square.setWidth(6.0);
        System.out.println("Square side: " + square.getWidth());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println(square.toString());
    }
}
