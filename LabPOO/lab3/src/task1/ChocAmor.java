package task1;

public class ChocAmor extends CandyBox {
    float length;

    ChocAmor() {
        length = 0;
    }

    ChocAmor(String f, String o, float l) {
        super(f, o);
        this.length = l;

    }

    public float getVolume() {
        return (float) (length * length * length);
    }

    public String toString() {
        return super.toString() + " has volume:" + getVolume();
    }

    void printChocAmorDim() {
        System.out.printf("%.2f", length);
        System.out.println();
    }
public String Print(){
        return "lungime "+length;
}
}
