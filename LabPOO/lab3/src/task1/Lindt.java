package task1;

public class Lindt extends CandyBox {
    float length;
    float width;
    float height;

    Lindt() {
        length = 0;
        width = 0;
        height = 0;
    }

    Lindt(String f, String o, float l, float w, float h) {
        super(f, o);
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public float getVolume() {
        return (float) (length * width * height);
    }

    public String toString() {
        return super.toString() + " has volume:" + getVolume();
    }

    void printLindtDim() {
        System.out.printf("%.2f,%.2f,%.2f", length, width, height);
        System.out.println();

    }
    public String print(){
        return "lungime "+length+" latime "+width+" inaltime "+height;
    }
}
