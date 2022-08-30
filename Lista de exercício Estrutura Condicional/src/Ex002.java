import java.util.Locale;
import java.util.Scanner;
public class Ex002 {
    public static void main(String[] args) {
        float a, b, c;
        double x1, x2;
        double delta;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("Problema baskara");
        System.out.println("===================");

        System.out.print("Coeficiente a: ");
        a = sc.nextFloat();
        System.out.print("Coeficiente b: ");
        b = sc.nextFloat();
        System.out.print("Coeficiente c: ");
        c = sc.nextFloat();

        delta = Math.pow(b, 2) - 4*a*c;
        x1 = ((-b + Math.sqrt(delta))/(2*a));
        x2 = ((-b - Math.sqrt(delta))/(2*a));
        if (delta < 0){
            System.out.println("Esta equação não possui raízes reais");
        }else {

        System.out.printf("O valor do delta: %.4f ", delta);
        System.out.println();
        System.out.printf("O valor do X1 = %.4f ", x1);
        System.out.println();
        System.out.printf("O valor do X2 = %.4f", x2);}


        sc.close();
    }
    
}
