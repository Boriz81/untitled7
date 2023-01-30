import static java.lang.Math.PI;

public class Circle extends Shape{
    double radius;

    @Override
    public double area() {
        double sCircle;
        sCircle = PI * Math.pow(radius, 2);
        return sCircle;
    }
}
