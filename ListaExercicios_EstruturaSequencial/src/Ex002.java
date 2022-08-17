//Exercicio 2 - Problema "retangulo"
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Base do retângulo: ");
        float base = entrada.nextFloat();
        System.out.print("Altura do retângulo: ");
        float altura = entrada.nextFloat();

        float area = altura * base;
        float perimetro = 2*(base + altura);
        double diagonal = Math.sqrt ((base*base)+ (altura*altura));
        
        System.out.printf("ÁREA  = %.4f", area);
        System.out.println();
        System.out.printf("PERÍMETRO = %.4f", perimetro);
        System.out.println();
        System.out.printf("DIAGONAL = %.4f", diagonal);

        entrada.close();

    }
    
}
