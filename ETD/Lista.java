package ETD;

/**
 * Created by Paula on 11/11/2017.
 */
public class Lista {

    private Nodo primeiro = null;
    private Nodo ultimo = null;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarInicio(String valor) {
        Nodo novoNodo = new Nodo (valor);

        if (this.primeiro == null) {
            this.primeiro = novoNodo;
            this.ultimo = novoNodo;
        } else {
            this.primeiro.setAnt (novoNodo);
            novoNodo.setProx (this.primeiro);
            this.primeiro = novoNodo;
        }
        this.tamanho++;
    }

    public void adicionarFim(String valor) {
        Nodo novoNodo = new Nodo(valor);

        if (this.primeiro == null) {
            this.primeiro = novoNodo;
            this.ultimo = novoNodo;
        } else {
            novoNodo.setAnt(this.ultimo);
            this.ultimo.setProx(novoNodo);
            this.ultimo = novoNodo;
        }
        this.tamanho++;
    }

    public void remover() {
        this.ultimo = this.ultimo.getAnt ();
        this.ultimo = null;

    }

    public void print() {

        if (this.tamanho == 0) {
            System.out.println("| |");

        } else {
            System.out.print("| ");
            Nodo temp = this.primeiro;

            for (int i = 0; i < this.tamanho; i++) {

                System.out.print(temp.getNodo() + " ");
                temp = temp.getProx();
            }
            System.out.println("|");

        }
    }

}
