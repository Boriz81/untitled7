public class Triangle extends Shape {
    double height;
    double base;

    @Override
    public double area() {
        double sTriangle;
        sTriangle = base * height / 2;
        return sTriangle;
    }

}
