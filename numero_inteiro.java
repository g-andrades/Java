import java.util.Scanner;
public class numero_inteiro {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        if ((numero1 > numero2 ) && (numero1 > numero3)){
            System.out.println(numero1);
        }
        if ((numero2 > numero1 ) && (numero2 > numero3)){
            System.out.print(numero2);
        }
        if ((numero3 > numero1 ) && (numero3 > numero2)){
            System.out.print( numero3);
        }
    }
}