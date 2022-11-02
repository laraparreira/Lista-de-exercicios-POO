import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;

        System.out.println("Digite dois numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 < n2){
            for (int cont = n1; cont < n2; cont++){
                if (cont % 2 == 1 || cont % 2 == - 1){
                    soma += cont;
                }
            }
        }else {
            for (int cont = n2 + 1; cont < n2; cont ++){
                if (cont % 2 == 1 || cont % 2 == -1){
                    soma += cont;
                }
            }
        }
       System.out.println("Soma dos ímpares = " + soma);
        sc.close();
    }
}
