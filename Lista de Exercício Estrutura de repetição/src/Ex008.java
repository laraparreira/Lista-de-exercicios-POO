import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a tabuada para qual valor? ");
        int n = sc.nextInt();
        
        for (int cont = 1; cont <= 10; cont++){
            int tabuada = n * cont;
            System.out.printf("%d x %d = %d %n", n, cont, tabuada);
        }
        sc.close();
    }
    
}
