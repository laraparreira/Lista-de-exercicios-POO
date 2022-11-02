import java.util.Locale;
import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        int quantCobaia = 0, totalCobaia = 0, totalCoelho = 0, totalRato = 0, totalSapo = 0;
        double coelho = 0, rato = 0, sapo = 0;
        char tipoCobaia;

        System.out.print("Quantos casos de teste serâo digitados? ");
        N = sc.nextInt();

        for(int cont = 1; cont <= N; cont ++){
            System.out.print("Quantidade de cobaias: ");
            quantCobaia = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            tipoCobaia = sc.next().charAt(0);

            totalCobaia = totalCobaia + quantCobaia;

            if(tipoCobaia == 'C'){
                totalCoelho += quantCobaia;
            }else if (tipoCobaia == 'R'){
                totalRato += quantCobaia;
            }else if (tipoCobaia == 'S'){
                totalSapo += quantCobaia;
            }
        }
        //calculo dos percentuais
        coelho = (double)((totalCoelho * 100) / totalCobaia);
        rato = (double)((totalRato * 100) / totalCobaia);
        sapo = (double)((totalSapo * 100) / totalCobaia);

        System.out.println("=======================================");
        System.out.println("RELATÓRIO FINAL: ");
        System.out.printf("Total: %d cobaias %n", totalCobaia);
        System.out.printf("Total de coelhos: %d%n", totalCoelho);
        System.out.printf("Total de ratos: %d%n", totalRato);
        System.out.printf("Total de sapos: %d%n", totalSapo);
        System.out.printf("Percentual de coelhos: %.2f%n", coelho);
        System.out.printf("Percentual de ratos: %.2f%n", rato);
        System.out.printf("Percentual de sapos: %.2f%n", sapo);
        sc.close();
    }
}
