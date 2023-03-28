import java.util.Scanner;
public class menu_atalho {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("digite 1 para a cor AZUL, 2 para a cor VERMELHO e 3 para a cor VERDE: ");
        int codigo = entrada.nextInt();

        if (codigo == 1) {
            System.out.print("a cor selecionada é azul");
        }
        if (codigo == 2) {
            System.out.print("a cor selecionada é vermelho");
        }
        if (codigo == 3) {
            System.out.print("a cor selecionada é azul");
        }
        if (codigo > 3) {
            System.out.print("Codigo não encontrado.");
        }
    }
}
