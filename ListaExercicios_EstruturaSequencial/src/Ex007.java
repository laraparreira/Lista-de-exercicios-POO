//Exercício 7- Problema "pagamento"
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Valor por hora: ");
        float valorHora = entrada.nextFloat();

        System.out.print("Horas trabalhadas: ");
        float horaTrabalhada = entrada.nextFloat();

        float pagamento = valorHora * horaTrabalhada;
        System.out.printf("O pagamento para %s deve ser %.2f",nome,pagamento);

        entrada.close();
    }
    
}
