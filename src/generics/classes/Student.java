package generics.classes;

public class Student<S,U,V> {

    private S s;
    private U u;
    private V v; // bunlar hepsi field

    // constructor
    public Student(S s, U u, V v) {
        this.s = s;
        this.u = u;
        this.v = v;
    }

    // getter setter
    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
