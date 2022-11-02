import java.util.Locale;
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double divisao;
        System.out.print("Quantos casos você vai digitar? ");
        int N = sc.nextInt();

        for(int cont = 1; cont<= N; cont ++){
            System.out.print("Entre com o numerador: ");
            int numerador = sc.nextInt();
            System.out.print("Entre com o denominador: ");
            int denominador = sc.nextInt();

            if (denominador == 0){
                System.out.println("DIVISAO IMPOSSÍVEL");
            }else{
                divisao = (double)numerador/denominador;
                System.out.printf("DIVISÃO = %.2f%n" , divisao);
            }
        }
        sc.close();
    }
}
