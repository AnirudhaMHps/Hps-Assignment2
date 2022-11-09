import com.highpeak.anirudha.*;

public class GreeterTest {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                Greeter g = new Greeter(args[i]);
                System.out.println(g.sayHello());
            }
                Advisor a = new Advisor();
                System.out.println(a.getAdvice());
            for (int i = args.length-1;i>=0 ;i--) {
                Greeter g = new Greeter(args[i]);
                System.out.println(g.sayGoodBye());
            }
            }

        }
    }

