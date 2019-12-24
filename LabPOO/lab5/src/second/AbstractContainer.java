package second;

import first.Task;

import java.util.ArrayList;

abstract class AbstractContainer implements Container{
    private ArrayList<Task> list;

    AbstractContainer() {
        list = new ArrayList<>();
    }

    protected ArrayList<Task> get () {
        return list;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push (Task task) {
        get().add(task);
    }

    public int size() {
        return get().size();
    }

    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            push(container.pop());
        }
    }

}
