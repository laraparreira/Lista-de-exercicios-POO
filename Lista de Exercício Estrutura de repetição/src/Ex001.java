import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 1;


        while (x != y){
            System.out.println("Digite dois numeros: ");
            x = sc.nextInt();
            y = sc.nextInt();

            if (x > y){
                System.out.println("Decrescente!");
            }else {
                System.out.println("Crescente!");
            }
        }

        sc.close();

    }
}