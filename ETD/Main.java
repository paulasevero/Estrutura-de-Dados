package ETD;

import java.util.Scanner;

/**
 * Created by Paula on 11/11/2017.
 */
public class Main {
    public static void main (String[] args) {
        Scanner t = new Scanner (System.in);
        String valor;
        int op;
        Lista lista = new Lista ();


        do {

            System.out.println ("   ");
            System.out.println ("Opções: ");
            System.out.println ("1 - Adicionar no Início");
            System.out.println ("2 - Adicionar no Fim");
            System.out.println ("3 - Remover por pilha");
            System.out.println ("4 - Imprimir Lista");
            System.out.println ("99 - Sair");

            op = t.nextInt ();

            if (op == 1) {
                System.out.println ("Digite o valor: ");
                valor = t.next ();
                lista.adicionarInicio (valor);
            }

            if (op == 2) {
                System.out.println ("Digite o valor: ");
                valor = t.next ();
                lista.adicionarFim (valor);
            }

            if (op == 3) {
                lista.remover ();

            }

            if (op == 4) {
                lista.print ();
            }

            if (op == 6) {
                System.out.println ("Finalizado");
                t.close ();

        }
    } while(op !=99);
}
}