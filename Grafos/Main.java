package Grafos;

import java.util.Scanner;

/**
 * Created by Paula Severo.
 */
public class Main {
    public static void main (String[] args) {
        Scanner t = new Scanner (System.in);
        Grafo grafo = new Grafo ();
        int op;

        do {
            System.out.println ("GRAFOS");
            System.out.println ("   1. Definir tamanho da matriz adjacente do grafo ");
            System.out.println ("   2. Adicionar valor");
            System.out.println ("   3. Remover valor ");
            System.out.println ("   99. Sair ");
            op = t.nextInt ();


            if (op == 1) {
                System.out.println ("Digite o tamanho da matriz do grafo");
                int tamanho = t.nextInt ();
                grafo.vertices (tamanho);
                System.out.println ("");
                grafo.imprimir ();

            }

            if (op == 2) {
                System.out.println ("Digite a coordenada X: ");
                int x = t.nextInt ();
                System.out.println ("Digite a coordenada Y: ");
                int y = t.nextInt ();
                System.out.println ("Digite o valor desejado: ");
                int valor = t.nextInt ();
                grafo.inserir (x, y, valor);
                System.out.println ("");
                grafo.imprimir ();

            }

            if (op == 3) {
                System.out.println ("Digite a coordenada X: ");
                int x = t.nextInt ();
                System.out.println ("Digite a coordenada Y: ");
                int y = t.nextInt ();
                grafo.remover (x, y);
                System.out.println ("");
                grafo.imprimir ();

            }

        } while (op != 99);
        System.out.println ("Desenvolvido por Paula Severo - 3i");
    }
}
