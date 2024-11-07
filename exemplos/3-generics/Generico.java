
public class Generico {
    public <T extends Comparable<T>> T maior(T v[]) {
        T max = v[0];
        for (T e: v) {
            if (e.compareTo(max) > 0) max = e;
        }
        return max;
    }
}


