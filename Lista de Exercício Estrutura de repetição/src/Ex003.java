import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while(senha != 2002){
        System.out.print("Digite a senha: ");
        senha = sc.nextInt();
        if (senha != 2002){
            System.out.println("Senha Inválida! Tente Novamente ");

        }
    }

        if (senha == 2002){
            System.out.println("Acesso permitido!");
        }

        sc.close();
    }
    
}
