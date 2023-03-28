package br.com.aula01;

import java.util.Scanner;

public class nomeSobrenome {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.next();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = entrada.next();

        System.out.print("o nome é " + nome + " "+ sobrenome);
    }

}