# java-
Repositório das aulas de Orientação a Objetos
package br.com.aula01;
import java.util.Scanner;
public class contas {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = entrada.nextInt();

        int mult = numero1 * numero2;
        double soma = numero1 + numero2;
        double sub = numero1 - numero2;
        int div = numero1 / numero2;

        System.out.printf("A multiplicação dos valores é %d\n", mult);
        System.out.printf("A soma dos valores é %f\n", soma);
        System.out.printf("A subtração dos valores é %f\n", sub);
        System.out.printf("A divisão dos valores é %d\n", div);



    }

}
