//Exercicio 10- Problema "duração"
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite a duração em segundos: ");
        int segundos = entrada.nextInt();

        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;

        System.out.println();
        System.out.println("=============================================");
        System.out.printf("%s : %s : %s ", horas, minutos, segundos);

        entrada.close();
        
    }
    
}
