import java.util.Scanner;
public class nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota da prova:  ");
        double nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.print("Aluno Aprovado");
        }
        if (nota < 7) {
            System.out.print("Aluno Reprovado");
        }
    }
}
