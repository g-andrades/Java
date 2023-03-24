import java.util.Scanner;
public class preco_produto {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("digite o primeiro número: ");
        double produto1 = entrada.nextDouble();

        System.out.print("digite o segundo número: ");
        double produto2 = entrada.nextDouble();

        System.out.print("digite o terceiro número: ");
        double produto3 = entrada.nextDouble();

        if ((produto1 < produto2 ) && (produto1 < produto3)){
            System.out.printf("Compre o primeiro produto: %s", produto1);
        }
        if ((produto2 < produto1 ) && (produto2 < produto3)){
            System.out.printf("Compre o segundo produto: %s ", produto2);
        }
        if ((produto3 < produto1 ) && (produto3 < produto2)){
            System.out.printf("Compre o terceiro produto: %s ", produto3);
        }
    }
}
