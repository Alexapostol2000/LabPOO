package task1;
string
public class complex {

    private int r;
    private int i;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public complex(int re, int im) {
        setR(re);
        setI(im);
    }

    public complex() {
        this(0, 0);
    }

    public complex(complex c) {
        this.i = c.i;
        this.r = c.r;
    }

    public void addWithComplex(complex c) {
        this.i += c.i;
        this.r += c.r;
    }

    public void shownumber(complex c) {
        System.out.println(c.r + "+" + c.i + "i");
    }

}
