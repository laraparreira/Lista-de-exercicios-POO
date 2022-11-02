import java.util.Locale;
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        float x,y,z;
        int p1 = 2, p2 = 3, p3 = 5;
        double media;

        System.out.print("Quantos casos você vai digitar? ");
        N = sc.nextInt();

        for (int cont = 1; cont <= N; cont ++){
            System.out.println("Digite tres numeros: ");
            x = sc.nextFloat();
            y = sc.nextFloat();
            z = sc.nextFloat();

            media = (x * p1 + y * p2 + z * p3)/(p1 + p2 + p3);

            System.out.printf("MEDIA = %.1f",media);

        }
        sc.close();
    }
}
