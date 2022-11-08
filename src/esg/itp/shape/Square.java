package esg.itp.shape;

public class Square implements Polygon {
    float side;
    float area = 0;
    float perimeter = 0;

    public Square(float s) {
        this.side = s;
    }

    @Override
    public void calcArea() {
        area = side * side;
    }

    @Override
    public void calcPeri() {
        perimeter = 4 * side;
    }

    @Override
    public void display() {
        System.out.println("Area : " + area + "\n Perimeter : " + perimeter);
    }
}
