import java.util.Locale;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("=======================");
        System.out.println("   Problema multiplos    ");
        System.out.println("=======================");

        System.out.println("Digite dois números inteiros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("São múltiplos");
        }else  {
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }
    
}
