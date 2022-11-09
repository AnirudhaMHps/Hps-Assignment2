import java.util.LinkedList;
class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id : " + id +
                "\nname : " + name;
    }
}

public class CustomLinkedList{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<Employee>();
        ll.add(new Employee(101,"chethan"));
        ll.add(new Employee(101, "chandhan"));
        ll.add(new Employee(103,"prem"));
        for (Object emp : ll){
            System.out.println(emp);
        }

    }
}
