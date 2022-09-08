import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int idade = 0;
        double soma_idades = 0;
        double media = 0;
        while (idade >= 0){
            System.out.println("Digite as idades: ");
            idade = sc.nextInt();
            if (idade > 0){
                soma_idades = soma_idades + idade;
                cont ++;
            } 
        
        }
        if (cont == 0 && idade < 0){
            System.out.println("Impossível calcular");
        } else {
            media = soma_idades / cont;
            System.out.printf("Media = %.2f", media);
        }

        sc.close();
    }
    
}
