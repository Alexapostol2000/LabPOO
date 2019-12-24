package first;

import java.util.Random;

public class RandomOutTask implements Task{
    int random;
    public RandomOutTask() {
        Random random = new Random();
        this.random = random.nextInt(1000000000);
    }
    public void execute() {
        System.out.println(random);
    }
}
