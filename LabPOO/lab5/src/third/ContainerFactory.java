package third;

import second.Container;
import second.Queue;
import second.Stack;

public class ContainerFactory implements IFactory {
    private static final ContainerFactory INSTANCE = new ContainerFactory();

    private ContainerFactory() {
    }

    public static ContainerFactory getInstance() {
        return INSTANCE;
    }

    public Container createContainer(Strategy strategy) {
        if (strategy == Strategy.FIFO){
            return new Queue();
        }
        if (strategy == Strategy.LIFO) {
            return new Stack();
        }

        return null;
    }
}