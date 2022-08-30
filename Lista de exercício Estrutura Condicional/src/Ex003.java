import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        int v1, v2, v3;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("Problema menor de tres");
        System.out.println("=======================");

        System.out.print("Primeiro valor: ");
        v1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        v2 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        v3 = sc.nextInt();

        if (v1 < v2 && v1 < v3){
            System.out.println("Menor = "+ v1);
        }else if (v2 < v1 && v2 < v3){
            System.out.println("Menor = "+ v2);
        }else if (v3 < v1 && v3 < v2){
            System.out.println("Menor = " +v3);
        }

        if (v1 == v2 || v1 == v3){
            System.out.println("Menor = "+v1);
        }else if (v2 == v1 || v2 == v3){
            System.out.println("Menor = "+v2);
        }else if  (v3 == v1 || v3 == v2){
            System.out.println("Menor = " +v3);
        } 

        sc.close();
    }
    
}
