package examples;

public class Hippo extends Animal {
    int size = 0;

    public Hippo(int aNewSize, String aName) {
        super(aName);
        this.size = aNewSize;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Hippo{}";
    }
}
