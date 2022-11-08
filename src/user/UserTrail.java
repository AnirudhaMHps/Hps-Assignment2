package user;

public class UserTrail {
        int val1;
        int val2;

    public UserTrail(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
        void booleanShow(){
            if(val1 < 0 || val2 < 0)
            {
                try{
                    throw new IllegalValueException();
                }catch(IllegalValueException ive)
                {
                    System.out.println("The value less than zero");
                }
            }
        }


        void display()
        {
            System.out.println("Number is "+val1+"\n Number is "+val2);
        }
        public static void main(String[] args) {

            UserTrail u = new UserTrail(-5,10);
            u.booleanShow();
            u.display();
        }
    }


