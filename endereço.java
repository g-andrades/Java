package br.com.aula01;

import java.util.Scanner;

public class endereço {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome da rua: ");
        String rua = entrada.next();

        System.out.print("Digite o nome do bairro: ");
        String bairro = entrada.next();

        System.out.print("Digite o número da casa: ");
        String numero = entrada.next();

        System.out.print("o endereço é " + rua + " "+ bairro + " " + numero);
    }

}

