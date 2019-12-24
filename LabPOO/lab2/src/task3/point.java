package task3;

public class point {
    private float x, y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public point(float x, float y) {
        setX(x);
        setY(y);
    }

    public void changeCoords(float x, float y) {
        setX(x);
        setY(y);
    }

    public void afisare() {
        float x, y;
        x = getX();
        y = getY();
        System.out.println("(" + x + "," + y + ")");
    }

}
