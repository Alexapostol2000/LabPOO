package task1;

import java.util.ArrayList;

public class CandyBag {
    ArrayList<CandyBox> Box;

    CandyBag() {
        this.Box = new ArrayList<CandyBox>();
    }



    public String toString() {
        return "CandyBag{" +
                "Box=" + Box +
                '}';
    }
}
