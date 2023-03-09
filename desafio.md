# java-
Repositório das aulas de Orientação a Objetos
package br.com.aula01;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int i,n;


        System.out.print("N: ");
        n = ler.nextInt();


        System.out.println();


        System.out.println("+-------------+");
        for (i = 1; i <= 10; i++) {
            System.out.printf("| %d x %2d = %2d | \n", n, i, (n*i));


        }
        System.out.println("+-------------+");


    }




}

