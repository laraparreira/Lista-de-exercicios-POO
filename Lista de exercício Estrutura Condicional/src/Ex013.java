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

        System.out.print("Valor de X: ");
        x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.printf("Q1");
        }else if (x < 0 && y > 0){
            System.out.printf("Q2");
        }else if (x < 0 && y < 0){
            System.out.printf("Q3");
        }else if(x > 0 && y < 0){
            System.out.printf("Q4");
        }else if(x == 0 && y == 0){
            System.out.printf("Origem");
        }else if (y == 0){
            System.out.printf("Eixo X");
        }else if(x == 0){
            System.out.printf("Eixo Y");
        }

        sc.close();
    }
}
