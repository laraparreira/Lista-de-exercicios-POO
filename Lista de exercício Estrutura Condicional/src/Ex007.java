import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    
    public static void main(String[] args) {
        float v1, v2, v3;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("     Problema dardo    ");
        System.out.println("=======================");

        System.out.println("Digite a três distâncias: ");
        v1 = sc.nextFloat();
        v2 = sc.nextFloat();
        v3 = sc.nextFloat();

        if (v1 > v2 && v1 > v3){
            System.out.println("Maior distância = "+ v1);
        }else if (v2 > v1 && v2 > v3){
            System.out.println("Maior distância = "+ v2);
        }else if (v3 > v1 && v3 > v2){ 
            System.out.println("Maior distância = " +v3);
        }

        if (v1 == v2 && v1 == v3){
            System.out.println("Maior distância = "+v1);
        }else if (v2 == v1 && v2 == v3){
            System.out.println("Maior distância = "+v2);
        }else if  (v3 == v1 && v3 == v2){
            System.out.println("Maior distância = " +v3);
        } 



        sc.close();
    }
}
