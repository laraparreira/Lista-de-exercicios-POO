import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println(" Problema temperatura ");
        System.out.println("=======================");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float  tempF, tempC;
        char temp = 'c'; 

        System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
        String temp2 = sc.next();
        if (temp == 'c' || temp == 'C'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            tempF = sc.nextFloat();
            tempC = ((5/9)*(tempF - 32));
            System.out.printf("Temperatura equivalente em Celsius: %.2f" + tempC );
        }

        sc.close();
    }
    
}
