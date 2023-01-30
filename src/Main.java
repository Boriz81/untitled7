import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();
        Triangle triangle = new Triangle();
        triangle.height = 23.4; triangle.base = 34.5;
        Circle circle = new Circle();
        circle.radius = 3.6;
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(square.area());
        System.out.println(rectangle.area());

        System.out.println(String.format("Число ПИ: %.5f", Math.PI));
        System.out.println(String.format("%.5f", circle.area()));


    }
}