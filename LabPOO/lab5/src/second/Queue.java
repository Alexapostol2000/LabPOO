package second;

import first.Task;

public class Queue extends AbstractContainer {
    public Task pop() {
        if (get().isEmpty()) {
            return null;
        }
        Task t1;
        t1 = get().get(0);
        get().remove(0);
        return t1;
    }
}
