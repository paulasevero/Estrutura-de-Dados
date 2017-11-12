package ETD;

/**
 * Created by Paula on 11/11/2017.
 */
public class Nodo {
    private Nodo prox;
    private Nodo ant;
    private String nodo;

    public Nodo (String nodo) {
        this.nodo = nodo;
        this.prox = null;
        this.ant = null;
    }

    public Nodo getProx () {

        return this.prox;
    }

    public void setProx (Nodo prox) {
        this.prox = prox;
    }

    public Nodo getAnt () {
        return this.ant;
    }

    public void setAnt (Nodo ant) {
        this.ant = ant;
    }

    public String getNodo () {
        return this.nodo;
    }

    public void setNodo (String nodo) {
        this.nodo = nodo;
    }
}
