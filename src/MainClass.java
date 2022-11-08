import esg.itp.shape.*;
public class MainClass {
    public static void main(String[] args) {
   Square s = new Square(10);
   Rectangle r = new Rectangle(10,20);
 s.calcArea();
 s.calcPeri();
 s.display();
 r.calcArea();
r.calcPeri();
r.display();
    }
}
