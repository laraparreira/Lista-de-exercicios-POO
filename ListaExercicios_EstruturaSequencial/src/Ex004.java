//Exercicio 5 - Problema "troco"
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int X = entrada.nextInt();

        System.out.print("Digite o valor de Y: ");
        int Y = entrada.nextInt();

        int soma = (X + Y);

        System.out.printf("SOMA = " + soma);

        entrada.close();

    }
    
}
