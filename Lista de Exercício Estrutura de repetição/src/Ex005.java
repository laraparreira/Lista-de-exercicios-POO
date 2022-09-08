import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float nota1 = 1;
        float nota2 = 11;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        

        if (nota1 < 0 || nota1 > 10){
            while (nota1 < 0 || nota1 > 10){
                System.out.print("Valor inválido! Tente novamente: ");
                nota1 = sc.nextFloat();
            }
        }
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();
        
        if (nota2 < 0 || nota2 > 10){
            while (nota2 < 0 || nota2 > 10){
                System.out.print("Valor inválido! Tente novamente:");
                nota2 = sc.nextFloat();
            }
        }
        float media = (nota1 + nota2)/2;
        System.out.printf("Média = %.2f", media);

        sc.close();
    }
}
