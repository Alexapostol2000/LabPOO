package task1;

public class CandyBox {
    private String flavor;
    private String origin;


    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public CandyBox() {
        this("0", "0");
    }

    float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
    public String print(){
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';

    }
    public boolean equals(Object obj) {

        CandyBox c = (CandyBox) obj;

        if (!this.flavor.equals(c.flavor)) {
            return false;
        }
        if (this.origin != c.origin) {
            return false;
        }

        return true;
    }

}
