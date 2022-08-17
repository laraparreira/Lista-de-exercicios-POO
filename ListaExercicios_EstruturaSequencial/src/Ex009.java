//Exercicio 9 - Problema "medidas"
import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite a medida A: ");
        float a = entrada.nextFloat();

        System.out.print("Digite a medida B: ");
        float b = entrada.nextFloat();

        System.out.print("Digite a medida C: ");
        float c = entrada.nextFloat();

        System.out.println();

        float areaQuadrado = a*a;
        float areaTriangulo = (a * b)/2;
        float areaTrapezio = ((a + b)* c)/2;

        System.out.printf("ÁREA DO QUADRADO = %.4f", areaQuadrado);
        System.out.println();
        System.out.printf("ÁREA DO TRIÂNGULO = %.4f", areaTriangulo);
        System.out.println();
        System.out.printf("ÁREA DO TRAPÉZIO = %.4f", areaTrapezio);

        entrada.close();

    }
    
}
