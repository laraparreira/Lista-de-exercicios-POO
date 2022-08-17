//Exercício 6- Problema "circulo"
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        float raio = entrada.nextFloat();

        double area = Math.PI * raio * raio;

        System.out.printf("ÁREA = %.3f", area);
        entrada.close();
    }
    
}
