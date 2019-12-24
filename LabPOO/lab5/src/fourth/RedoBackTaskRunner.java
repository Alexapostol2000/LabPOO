package fourth;

import first.Task;
import second.Container;
import third.ContainerFactory;
import third.Strategy;

public class RedoBackTaskRunner extends AbstractTaskRunner {
    private Container reversed;

    public RedoBackTaskRunner(Strategy strategy) {
        super(strategy);
        reversed = ContainerFactory.getInstance().createContainer(strategy);
    }

    public void afterExecution(Task task) {
        reversed.push(task);

    }

    public void reDo() {
        while (!reversed.isEmpty()) {
            reversed.pop().execute();
        }
    }


}
