import static java.lang.Math.PI;

public class Square extends Shape {
    double side;
    @Override
    public double area() {
        double sSquare;
        sSquare = Math.pow(side, 2);
        return sSquare;
    }

}
