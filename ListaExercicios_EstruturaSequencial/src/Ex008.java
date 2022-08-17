//Exercício 8- Problema "consumo"
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Distância percorrida (km): ");
        float km = entrada.nextFloat();

        System.out.printf("Combustível gasto: ");
        float combustivel = entrada.nextFloat();

        float consumo = km/ combustivel;

        System.out.printf("Comsumo médio: %.3f", consumo);

        entrada.close();
    }
    
}
