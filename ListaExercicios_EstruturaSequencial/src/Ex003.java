//Exercicio 3 Problema "idades"
import java.util.Scanner;


public class Ex003 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome:");
        String nome1 = entrada.nextLine();
        System.out.print("Idade: ");
        float idade1 = entrada.nextInt();

        System.out.println("Dados da segunda pessoa: ");
        entrada.nextLine();
        System.out.print("Nome: ");
        String nome2 = entrada.nextLine();
        System.out.print("Idade: ");
        float idade2 = entrada.nextInt();

        float idadeMedia = ((idade1 + idade2)/2);

        System.out.printf("A idade média de %s e %s é de: %.1f anos.", nome1, nome2, idadeMedia);

        entrada.close();

        
    }

}
