import java.util.Scanner;

public class Ex004 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        float x,y ;
        int cont = 1 ;

        while(cont != 0){
            System.out.println("Digite os valores das coordenadas X e Y: ");
            x = sc.nextFloat();
            y = sc.nextFloat();

            if (x > 0 && y > 0){
                System.out.println("Quadrante Q1");
            }else if (x < 0 && y > 0){
                System.out.println("Quadrante Q2");
            }else if (x < 0 && y < 0){
                System.out.println("Quadrante Q3");
            }else if (x > 0 && y < 0){
                System.out.println("Quadrante Q4");
            }else if (x == 0 || y == 0){
                cont = 0;
            }

        }
        sc.close();
    }
}
