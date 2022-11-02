import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, x;
        int dentro = 0;
        int fora = 0;

        System.out.print("Quantos números você vai digitar? ");
        numero = sc.nextInt();

        for (int cont = 1; cont<= numero; cont++){
            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            if (x >= 10 && x <= 20){
                dentro += 1;
            }else {
                fora += 1;
            }
        }
        System.out.printf(dentro + "DENTRO");
        System.out.println();
        System.out.println(fora + "FORA");
        sc.close();
    }
}
