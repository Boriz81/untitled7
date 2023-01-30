public class Rectangle extends Shape {
    double width;
    double height;

    @Override
    public double area() {
        double sRectangle;
        sRectangle = width * height;
        return sRectangle;
    }
}
