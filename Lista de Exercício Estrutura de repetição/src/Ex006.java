import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 4){
            System.out.println("Informe um codigo");
            System.out.println(" 1 => Álcool");
            System.out.println(" 2 => Gasolina");
            System.out.println(" 3 => Diesel");
            System.out.println(" 4 => Fim");
            codigo = sc.nextInt();
            System.out.println("===================");
            if (codigo <= 0 || codigo > 4){
                System.out.println("Codigo inválido! Digite outro codigo");
            }
           
            if (codigo == 1){
                alcool += 1;
            }if (codigo == 2){
                gasolina += 1;
            }if (codigo == 3){
                diesel += 1;
            }if (codigo == 4){
                System.out.println("Muito obrigado");
            }
            
        }
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel : " + diesel);




        sc.close();
    }
    
}
