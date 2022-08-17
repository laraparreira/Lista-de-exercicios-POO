//Exercicio 1 - Problema "Terreno"
import java.util.Scanner;

public class Ex001 { 

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        float laragura = entrada.nextFloat();

        System.out.print("Digite o comprimento do terreno: ");
        float comprimento = entrada.nextFloat();

        System.out.print("Digite o valor do metor quadrado: ");
        float valor = entrada.nextFloat();

        float area =  laragura * comprimento;
        float preco = area * valor;
        System.out.println();
        System.out.printf("Área do terreno = %.2f", area);
        System.out.println();
        System.out.printf("Preço do terreno R$ %.2f", preco);

        entrada.close();


    }
    
}
