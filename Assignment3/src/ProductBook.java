import java.util.HashMap;
import java.util.Scanner;

public class ProductBook {
    String name;
    int phoneNo;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap hm = new HashMap<String,Integer>();
        hm.put("chethan",1234);
        hm.put("chandhan",2345);
        hm.put("arun",1234);
 while(true){
        System.out.println("Enter the Choice");
        System.out.println("1. Add new phone book entry \n2. Search Phone Number \n3. Quit");
       int choice= s.nextInt();

    switch (choice) {
        case 1:
            System.out.println("Enter the name and phone number");
            hm.put(s.next(), s.nextInt());
            break;
        case 2:
            System.out.println("Enter the name ");
            String s1 = s.next();
            System.out.println(hm.get(s1));
            break;
        case 3:
            System.exit(0);
            break;
        default: System.out.println("Invalid input");
        break;
    }

}
    }
}
