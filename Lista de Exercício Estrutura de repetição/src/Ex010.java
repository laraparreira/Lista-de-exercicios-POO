
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.println("=======================");

        for(int cont = 0; cont <= x; cont++){
            if (cont % 2 == 1){
                System.out.println(cont); 
            }
        }
        sc.close();
    }
}
