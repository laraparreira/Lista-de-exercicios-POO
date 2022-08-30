import java.util.Locale;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("   Problema glicose    ");
        System.out.println("=======================");

        System.out.print("Digite a medida da glicose: ");
        float glicose = sc.nextFloat();

        if (glicose <= 100){
            System.out.println("Normal");
        }else if (glicose > 100 && glicose <= 140){
            System.out.println("Elevado");
        }else if(glicose > 140){
            System.out.println("Diabetes");
        }
        sc.close();
    }
    
}
