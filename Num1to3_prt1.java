import java.util.*;
import static java.lang.Math.*;

public class Num1to3_prt1 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Input number of ex, from 1 to 3");
        number = in.nextInt();
        if (number == 1) {
            double x, y, z;
            System.out.println("Input x");
            x = in.nextDouble();
            System.out.println("Input y");
            y = in.nextDouble();
            System.out.println("Input z");
            z = in.nextDouble();
            double a = ((sqrt(abs(x * x - 6))) - (sqrt(abs(y * y - 5))))
                    / (1 + ((x * x) / (pow(y, 3) + 1)) + ((y * y) / (pow(x, 3) + 1)));
            System.out.println("a= " + a);
            double b = pow(x, 3) * (pow(atan(z), 3) + E);
            System.out.println("b =" + b);
        }
        else if (number == 2) {
            int a,b,c;
            a = 2;  b = -1; c = 3;
            double f,x;
            System.out.println("Input x");
            x = in.nextDouble();
            f = pow((x+a),1/3)+(c*x*x)/(b+x);
            System.out.println("f(x) = " + f);
        }
        else if (number == 3) {
            double f,x;
            System.out.println("Input x");
            x = in.nextDouble();
            f = pow(cos(pow(sin(pow(cos(1/(x*x)),2)),2)),2)
                    -abs(pow(x,3)+pow(3,x));
            System.out.println("f(x) = " + f);
        }
        else {
            System.out.println("Input number from 1 to 3, u have mistaken");
        }
    }
}

