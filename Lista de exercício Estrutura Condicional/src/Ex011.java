import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("   Problema aumento    ");
        System.out.println("=======================");

        System.out.println("Digite a salário da pessoa: ");
        float salario = sc.nextFloat();

        if (salario >= 1000){
            float novo_salario = (salario * (20/100));
            System.out.printf("Novo salário = %.2f", novo_salario);

        }else if (salario > 1000 && salario > 3000){
            float novo_salario2 = (salario * (15/100));
            System.out.printf("Novo salário = %.2f", novo_salario2);

        }
        

        sc.close();

    }
    
}
