package exception.assignment;

import java.util.Scanner;

public class NUmber {
    int		a;
    int		b;
    double  result;
    NUmber(int x, int y){
        this.a=x;
        this.b=y;
    }
    public void sum(){
        result=a+b;
        System.out.println("sum : "+result);
    }
    public void sub(){
        result=a-b;
        System.out.println("Difference : "+result);
    }
    public void mul(){
        result=a*b;
        System.out.println("Product : "+result);
    }
    public void div(){
        try {
            result = a / b;
            System.out.println("Division : " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Invalid Denominator");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the two Number ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        NUmber n = new NUmber(x,y);
        System.out.println("Enter the Choice");
        System.out.println("1 : Addiction \n2 : Subtraction \n3 : Multiplication \n4 : Division");
        int choice = s.nextInt();
        switch (choice){
            case 1 : n.sum();

            break;
            case 2 : n.sub();
            break;
            case 3 : n.mul();
            break;
            case 4 : n.div();
            break;
        }
    }
}
