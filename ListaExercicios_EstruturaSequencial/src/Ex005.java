//Exercício 5 - Problema "Troco"
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        float preço = entrada.nextFloat();

        System.out.print("Quantidade de unidades compradas: ");
        int quant = entrada.nextInt();

        System.out.print("Dinheiro recebido pelo cliente: ");
        float dinheiro = entrada.nextFloat();

        float troco = ((preço * quant)- dinheiro);

        System.out.printf("TROCO = " + troco);

        entrada.close();


    }
    
}
