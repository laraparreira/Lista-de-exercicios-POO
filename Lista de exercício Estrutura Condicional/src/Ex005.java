import java.util.Locale;
import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("Problema troco verificado");
        System.out.println("=======================");

        System.out.print("Preço unitário do produto: ");
        float preco = sc.nextFloat();
        System.out.print("Quantidade comprada: ");
        int quant_compra = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        float dinheiro = sc.nextFloat();

        float troco = (dinheiro - (preco * quant_compra));
        float troco2 =  (preco * quant_compra) - dinheiro ;
        //System.out.printf("TROCO = "+ troco);
        if (troco < 0){
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f ", troco2, " REAIS");
        }else {
            System.out.printf("TROCO = "+ troco); 
        }
        sc.close();
    }
    
}
