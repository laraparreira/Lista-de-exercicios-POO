import java.util.Locale;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo;
        int quant_compra;
        double valor_total, valor_produto;

        System.out.println("=======================");
        System.out.println("   Problema lanchonete    ");
        System.out.println("=======================");

        System.out.print("Código do produto comprado (1, 2 ou 3): ");
        codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        quant_compra = sc.nextInt();

        if (codigo == 1){
            valor_produto = 5.00;
            valor_total = quant_compra * valor_produto;
            System.out.printf("Valor a pagar é: R$ %.2f", valor_total);
        }else if (codigo == 2){
            valor_produto = 10.00;
            valor_total = quant_compra * valor_produto;
            System.out.printf("Valor a pagar: R$ %.2f", valor_total);
        }else if (codigo ==3){
            valor_produto = 15.00;
            valor_total = quant_compra * valor_produto;
            System.out.printf("Valor a pagar: R$ %.2f", valor_total);
        }else {
            System.out.println("Código inválido.");
        }
        sc.close();
    }
    
}
