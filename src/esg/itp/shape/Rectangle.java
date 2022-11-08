package esg.itp.shape;

public class Rectangle implements Polygon {
    float length;
    float breadth;
    float area = 0;
    float perimeter = 0;

   public Rectangle(float len, float bre) {
        this.length = len;
        this.breadth = bre;
    }

    @Override
    public void calcArea() {
        area = length * breadth;
    }

    @Override
    public void calcPeri() {
        perimeter = (2 * (length + breadth));
    }

    @Override
    public void display() {
        System.out.println("Area : " + area + "\n Perimeter : " + perimeter);
    }
}
