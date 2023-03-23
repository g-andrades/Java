import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double preco;

        System.out.println("informe um número: ");
        numero = entrada.nextInt();

        System.out.println("informe um preço: ");
        preco = entrada.nextDouble();

        if (numero > 0) {
            System.out.println("o número informado é maior que 0");

        }else {
            System.out.println(("O número é maior que 0."));
        }
        if (preco > 10.0){
            System.out.println("preco normal");
        }else{
            System.out.println("o preço está na promoção");
        }
    }
}