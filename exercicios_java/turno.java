import java.util.Scanner;
public class turno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite 'm' se você estuda no turno Matutino, 'v' se você estuda no turno Vespertino," +
                "'n' se você estuda no turno noturno ");
        String turno = entrada.nextLine();

        if (turno.equals("m")){
            System.out.print("Bom dia!");}
        if (turno.equals("v")){
            System.out.print("Boa tarde!");}
        if (turno.equals("n")){
            System.out.print("Boa noite!");}
        else{
            System.out.print("Valor inválido");}
        }
    }

