package exception.assignment;

import java.util.Scanner;

class IllegalArgumentException extends Exception{
}
public class CalcAverage {
        int average;

        public double avgFirstN(int N)
        {
            if(N<0)
            {
                try{
                    throw new IllegalArgumentException();
                }
                catch(IllegalArgumentException iae){
                    System.out.println("Please Enter the Positive Number");

                }
            }
            else
            {
                int average=(N*(N+1))/2;

                System.out.println(" Average : "+average);
            }

            return N;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
System.out.println("Enter the number ");
int a = s.nextInt();

            CalcAverage c = new CalcAverage();
            c.avgFirstN(a);
        }
        }


