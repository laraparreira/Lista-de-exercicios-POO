import java.util.Locale;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.println(" Problema tempo de jogo ");
        System.out.println("========================");

        int hora_inicial, hora_final;

        System.out.print("Hora inicial: ");
        hora_inicial = sc.nextInt();
        System.out.print("Hora final: ");
        hora_final = sc.nextInt();

        if(hora_inicial > 12){
            int duracao = ((24 - hora_inicial) + hora_final);
            System.out.printf("O jogo dorou: " + duracao + " horas");
        }else if (hora_inicial < 12 && hora_inicial != 0){
            int duracao = ((0 - hora_inicial)+ hora_final);
            System.out.println("O jogo durou " + duracao + " horas");
        }else if (hora_inicial == 0 && hora_final !=0){
            int duracao = hora_inicial + hora_final;
            System.out.println("O jogo durou " + duracao + " horas");
        }else if (hora_inicial == 0 && hora_final == 0){
            System.out.println("O jogo durou 24 horas");
        }
        sc.close();
    }
    
}
