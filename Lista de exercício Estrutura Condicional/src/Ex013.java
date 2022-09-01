import java.util.Locale;
import java.util.Scanner;

public class Ex013 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println(" Problema Coordenadas  ");
        System.out.println("=======================");

        double x, y;

        System.out.println("Valor de X: ");
        x = sc.nextDouble();
        System.out.println("Valor de Y: ");

        sc.close();
    }
}
