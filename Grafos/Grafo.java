package Grafos;

/**
 * Created by Paula Severo.
 */

public class Grafo {
    public static class Aresta {
        private int cx, cy, valor;

        public Aresta (int cx, int cy, int valor) {
            this.cx = cx;
            this.cy = cy;
            this.valor = valor;
        }

        public int cx () {
            return this.cx;
        }

        public int cy () {
            return this.cy;
        }

        public int valor () {
            return this.valor;
        }
    }

    private int valor[][];
    private int vertices;
    private int posicao[];

    public int vertices (int vertices) {
        this.valor = new int[vertices][vertices];
        this.posicao = new int[vertices];
        this.vertices = vertices;
        for (int i = 0; i < this.vertices; i++) {
            for (int j = 0; j < this.vertices; j++)
                this.valor[i][j] = 0;
            this.posicao[i] = -1;
        }
        return this.vertices;
    }

    public void inserir (int cx, int cy, int valor) {
        this.valor[cx][cy] = valor;
    }


    public Aresta remover (int cx, int cy) {
        if (this.valor[cx][cy] == 0)
            return null;
        else {
            Aresta aresta = new Aresta (cx, cy, this.valor[cx][cy]);
            this.valor[cx][cy] = 0;
            return aresta;
        }
    }

    public void imprimir () {
        System.out.print ("  ");
        for (int i = 0; i < this.vertices; i++)
            System.out.print (i + " ");
        System.out.println ();
        for (int i = 0; i < this.vertices; i++) {
            System.out.print (i + " ");
            for (int j = 0; j < this.vertices; j++)
                System.out.print (this.valor[i][j] + " ");
            System.out.println ();
        }
    }
}

