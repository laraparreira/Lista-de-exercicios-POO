import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, novo_salario, aumento;

        System.out.println("=======================");
        System.out.println("   Problema aumento    ");
        System.out.println("=======================");

        System.out.print("Digite o salário da pessoa: ");
        salario = sc.nextDouble();

        if (salario <= 1000){
            novo_salario = salario + (salario * 0.2);
            aumento = salario * 0.2;
            System.out.printf("Novo salário = %.2f %n", novo_salario);
            System.out.printf("Aumento = R$ %.2f %n", aumento);
            System.out.println("Porcentagem = 20%");

        }else if (salario > 1000 && salario <= 3000){
            novo_salario = salario + (salario * 0.15);
            aumento = salario * 0.15;
            System.out.printf("Novo salário = %.2f %n", novo_salario);
            System.out.printf("Aumento = R$ %.2f %n", aumento);
            System.out.println("Porcentagem = 15%");

        }else if (salario > 3000 && salario <= 8000){
            novo_salario = salario + (salario * 0.1);
            aumento = salario * 0.1;
            System.out.printf("Novo salario = %.2f %n", novo_salario);
            System.out.printf("Aumento = R$ %.2f %n", aumento);
            System.out.println("Porcentaggem = 10%");

        }else if(salario > 8000){
            novo_salario = salario +(salario * 0.05);
            aumento = salario * 0.05;
            System.out.printf("Novo salário = %.2f %n", novo_salario);
            System.out.printf("Aumento = R$ %.2f %n", aumento);
            System.out.println("Porcentagem = 5%");
        }
        

        sc.close();

    }
    
}
