package fourth;

import first.Task;
import third.Strategy;

import java.util.Date;

public class PrintTimeTaskRunner extends AbstractTaskRunner{

    public PrintTimeTaskRunner(Strategy strategy) {
        super(strategy);
    }

    public void afterExecution(Task task) {
        System.out.println(new Date().toInstant());
    }

    @Override
    public void addTask(Task task) {
        super.addTask(task);
    }

    @Override
    public void executeAll() {
        super.executeAll();
    }
}
