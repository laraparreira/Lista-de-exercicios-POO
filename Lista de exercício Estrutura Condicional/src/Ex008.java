import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println(" Problema temperatura ");
        System.out.println("=======================");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double  temperatura, temperaturaC, temperaturaF;
        char letra; 

        System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
        letra = sc.next().charAt(0);

        if (letra == 'F' || letra == 'f'){
            System.out.printf("Digite a temperatura em Fahrenheit: ");
            temperatura = sc.nextDouble();
            temperaturaC = (temperatura - 32) * 5/9;
            System.out.printf("Temperatura equivalente em Celsius: %.2f ", temperaturaC);
        }else if(letra == 'C' || letra == 'c'){
            System.out.printf("Digite a temperatura em Celsius:");
            temperatura = sc.nextDouble();
            temperaturaF = (temperatura * 1.8) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", temperaturaF);
        }
       

        sc.close();
    }
    
}
