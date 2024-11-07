
public class Pilha<T extends Number> {

    private int max, topo;
    private T[] elementos;

    public Pilha(int max) {
        topo = -1;
        this.max = max;
        this.elementos = (T[]) new Object[max];
    }

    public void push(T e){
        if (topo < max-1){
            elementos[++topo] = e;
        } else { throw new IllegalArgumentException(); }
    }

    public T pop(){
        if (topo >= 0){
            return elementos[topo--];
        } else { return null; }
    }
}
