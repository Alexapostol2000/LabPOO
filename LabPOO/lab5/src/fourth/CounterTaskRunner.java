package fourth;

import first.Task;
import third.Strategy;

public class CounterTaskRunner extends AbstractTaskRunner {
    private int count;
    public CounterTaskRunner(Strategy strategy){
        super(strategy);
        count = 0;
    }

    public int getCounter() {
        return ++count;
    }
    public void afterExecution(Task task) {

    }


}
