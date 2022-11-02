import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int N, F = 1;
        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();

        for (int cont = N; cont >= 1; cont--){
            F*= cont;
        }
        System.out.println("FATORIAL = " + F);
        sc.close();
    }
}
