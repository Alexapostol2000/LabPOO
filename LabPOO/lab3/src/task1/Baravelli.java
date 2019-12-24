package task1;

public class Baravelli extends CandyBox {
    float radius;
    float height;

    Baravelli() {
        radius = 0;
        height = 0;
    }

    Baravelli(String f, String o, float r, float h) {
        super(f, o);
        this.radius = r;
        this.height = h;
    }

    public float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }

    public String toString() {
        return super.toString() + "has volume:" + getVolume();
    }

    void printBaravelliDim() {
        System.out.printf("%.2f,%.2f", radius, height);
        System.out.println();
    }
    public String print(){
        return " raza: "+radius+" inaltimea "+height;
    }
}
