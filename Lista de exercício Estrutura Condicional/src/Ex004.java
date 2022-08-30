import java.util.Locale;
import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("Problema operadora");
        System.out.println("=======================");

        System.out.print("Digite a quantidade de minutos:");
        int minutos = sc.nextInt();

        if (minutos <= 100){
            System.out.println("Valor a pagar: R$ 50.00");
        }else if (minutos > 100){
            float novo_valor = ((minutos - 100)* 2)+50;
            System.out.printf("Valor a pagar: R$ %.2f", novo_valor);
        }
        sc.close();
    }
}
