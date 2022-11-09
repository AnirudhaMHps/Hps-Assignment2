import java.util.HashMap;

public class CustomHashMAp {
    public static void main(String[] args) {
        HashMap hm = new HashMap<Integer,String>();
        hm.put(1,"chethan");
        hm.put(2,"chandhan");
        hm.put(3,"guru");
        hm.put(4,"ajay");
        hm.put(5,"prem");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.get(2));
        System.out.println(hm.containsKey(3));
        System.out.println(hm.containsValue("ajay"));
        System.out.println(hm.remove(4));
        System.out.println(hm);
        System.out.println(hm.containsValue(4));
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());


    }
}
