import java.util.*;
import static java.lang.Math.*;
public class WithVar_10_from1to4V1_1 {
    // methods
    public static double num1_searchingR() {
        Scanner in = new Scanner(System.in);
        double y,d;
        System.out.println("Input y & d");
        y = in.nextDouble();
        d = in.nextDouble();
        double R = (pow(sin(y),2)+0.3*d)/(exp(y)+log(d));
        return R;
    }
    public static double num1_searchingL() {
        Scanner in = new Scanner(System.in);
        double L,x,a,b;
        System.out.println("x,a,b");
        x = in.nextDouble();
        a = in.nextDouble();
        b = in.nextDouble();
        L = (sqrt(pow(3+x,6)+log(abs(x-sqrt(a*x*pow(b,3)))))
                +pow(atan(a-pow(x,5)),4))/(exp(exp(x+1))
                -sqrt(abs(pow(cos(abs(-x+5)),2))));
        return L;
    }
    public static double num2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Через сколько рыбак заметил потерю шляпы в часах?");
        double t = in.nextDouble();
        System.out.println("Как далеко была шляпа от моста в км?");
        double s = in.nextDouble();
        double v = s/(2*t);
        return v;
    }
    public static double num3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиусы оснований усеченного конуса");
        double r1 = in.nextDouble();
        double r2 = in.nextDouble();
        System.out.println("Введите высоту усеченного конуса");
        double h = in.nextDouble();
        double v = (PI*h*(pow(r1,2)+r1*r2+pow(r2,2)))/3;
        return v;
    }
    public static int num4(){
        double faren = 451;
        System.out.println(round(faren) + " градус по фарингейту");
        double cel,kel;
        cel = (faren - 32)*5/9;
        kel = (faren + 459.67) * 5/9;
        System.out.println(cel + " градус по цельсию");
        System.out.println(kel + " градус по кельвину");
        return (0);
    }
    public static double num5_ProjectionX(double x1, double x2, double y1, double y2, double x3, double y3) {
            double abx = x1 - x2;
            double aby = y1 - y2;
            double dacb = (x3 - x2) * abx + (y3 - y2) * aby;
            double dab = abx * abx + aby * aby;
            double t = dacb / dab;
            return x2 + aby * t;
    }
    public static double num5_ProjectionY(double x1, double x2, double y1, double y2, double x3, double y3) {
            double abx = x1 - x2;
            double aby = y1 - y2;
            double dacb = (x3 - x2) * abx + (y3 - y2) * aby;
            double dab = abx * abx + aby * aby;
            double t = dacb / dab;
            return y2 + abx * t;
    }
   //ending of methods
public static void main(String[] args) {
    System.out.println("Введите номер задачи от 1 до 5");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    if(num == 1) {
        System.out.println(num1_searchingR());
        System.out.println(num1_searchingL());
    }
    else if(num == 2){
        System.out.println(num2());
    }
    else if(num == 3){
        System.out.println(num3());
    }
    else if(num == 4){
        num4();
    }
    else if(num == 5){
        double x1, y1, x2, y2, x3, y3, y, x;
        System.out.println("Input x1, y1, x2, y2, x3, y3");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        x = num5_ProjectionX(x1, x2, y1, y2, x3, y3);
        y = num5_ProjectionY(x1, x2, y1, y2, x3, y3);
        System.out.println("Projection on X is: " + x);
        System.out.println("Projection on Y is: " +y);
    }
    else {
        System.out.println("Не корректные значения");
    }
    }
}
