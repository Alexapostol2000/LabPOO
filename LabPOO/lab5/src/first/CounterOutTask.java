package first;

public class CounterOutTask implements Task {
    static int k = 0;
    public void execute() {
        k++;
        System.out.println(k);
    }
}
