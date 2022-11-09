import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<String>();
        al.add("John");
        al.add("king");
        al.add("chethan");
        al.add("manas");
        al.add("guru");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name to search");
        String name= s.next();
        if (al.contains(name)){
            System.out.println("The given name is present in the list");
        }
        else{
            System.out.println("The given name is not present in the list");
        }
    }
}
