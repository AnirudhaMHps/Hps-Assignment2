package emp;

public class Emp {
    int empId;
    String name;
    String designation;
    double basic;
    double hra;
    public Emp(int empid, String name, String designation, double basic) {

        this.empId = empid;
        this.name= name;
        this.designation = designation;
        this.basic = basic;
    }
    public void printDET() {
        System.out.println("Id Of Employye :" + empId
                + "\n Name of Employee is :" + name
                + "\n Designation Of Employee is:" + designation
                + "\nSalary Of Employee :" + basic);

    }

    public void calculateHRA() {
        if (designation == "Manager") {
            if (basic < 500) {
                try {
                    throw new LowSalException();

                } catch (LowSalException e) {
                    System.out.println("Basic is lower than 500!");
                }
            } else {
                hra = basic * 0.1;
                System.out.println("HRA OF MANAGER : " + hra);
            }
        } else if (designation == "Officer") {
            if (basic < 500) {
                try {
                    throw new LowSalException();

                } catch (LowSalException e) {
                    System.out.println("Basic is lower than 500!");
                }
            } else {

                hra = basic * 0.12;
                System.out.println("HRA OF OFFICER : " + hra);
            }
        } else {
            if (basic < 500) {
                try {
                    throw new LowSalException();

                } catch (LowSalException e) {
                    System.out.println("Basic is lower than 500!");
                }
            } else {

                hra = basic * 0.05;
                System.out.println("HRA OF CLEARK : " + hra);
            }
        }
    }

    public static void main(String[] args) {
        Emp e1 = new Emp(1, "King", "Manager", 50000);
        Emp e2=new Emp(2,"Miller","officer",10000);
        Emp e3=new Emp(3,"John","cleark",300);
        Emp[] e = {e1,e2,e3};
        for (Emp emp : e){
            emp.printDET();
            emp.calculateHRA();
            System.out.println();
        }

    }
}














