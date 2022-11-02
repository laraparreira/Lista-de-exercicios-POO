import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,n;
        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();

        for (int cont = 1; cont <= N; cont ++){
            System.out.print("Digite um número: ");
            n = sc.nextInt();

            if (n % 2== 0 && n > 0){
                System.out.println("PAR POSITIVO");
            }else if (n % 2 == 0 && n < 0){
                System.out.println("PAR NEGATIVO");
            }else if (n % 2 == 1 && n > 0){
                System.out.println("ÍMPAR POSITIVO");
            }else if (n % 2 == -1 && n < 0){
                System.out.println("ÍMPAR NEGATIVO");
            }else{
                System.out.println("NULO");
            }
        }
        sc.close();
    }
}
