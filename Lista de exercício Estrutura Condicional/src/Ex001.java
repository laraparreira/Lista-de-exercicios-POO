import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("======================");
        System.out.println("1. Problema notas");
        System.out.println("======================");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();

        float soma_nota = nota1 + nota2;

        if (soma_nota >= 60){
            System.out.println("NOTA FINAL = " + soma_nota);
        }else if (soma_nota < 60){
            System.out.println("NOTA FINAL = " + soma_nota);
            System.out.println("REPROVADO");
        }
        sc.close();

    }
}