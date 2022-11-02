import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int soma = 0;
        int y = 0;
        int cont = 0;

        while(x != 0){

            System.out.print("Digite um número inteiro: ");
            x = sc.nextInt();
            y = x;

            if (x % 2 == 0){
                soma += x ;
            }else {
                y = x + 1;
                soma =+ y;
            }
            while (cont < 5){
                y += 2;
                soma += y;
                cont ++;
            }
            if (x == 0){
                break;
            }
            System.out.printf("SOMA =" + soma);
            System.out.println();
            cont = 1;
            soma = 0;

        }
        sc.close();
    }
    
}
