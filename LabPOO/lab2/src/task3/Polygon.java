package task3;

//import task3.point;

public class Polygon {
    point[] vector;


    public Polygon(int n) {
        this.vector = new point[n];
    }

    public void poly(float[] v) {
        vector = new point[vector.length / 2];
        int i;
        int j = 0;
        for (i = 0; i < v.length; i = i + 2) {

            this.vector[j] = new point(v[i], v[i + 1]);
            vector[j].afisare();
            j++;

        }
    }


}
