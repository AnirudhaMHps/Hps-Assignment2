import java.util.HashMap;
import java.util.Scanner;

public class Product {
    int productId;
    String productName;

    public static void main(String[] args) {
        HashMap hm = new HashMap<Integer, String>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Product Id and Name");
        for (int i = 0 ; i <10 ; i++){
            hm.put(s.nextInt(),s.next());
        }
        System.out.println("THe Product List is ");
        System.out.println(hm);
        System.out.println("Enter the Product id to search");
        int n = s.nextInt();
        if (hm.containsKey(n)){
            System.out.println("The product exist : "+hm.get(n));
        }
        else {
            System.out.println("The Product do not exist");
        }
        System.out.println("Enter the Product id to remove");
        int n1 = s.nextInt();
        hm.remove(n1);
        System.out.println("The item is removed ");
        System.out.println("The updated list is ");
        System.out.println(hm);
    }
}
