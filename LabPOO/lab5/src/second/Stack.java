package second;

import first.Task;

public class Stack extends AbstractContainer {

    public Task pop() {
        if (get().isEmpty()) {
            return null;
        }
        Task t1  ;
        t1 = get().get(get().size() - 1);
        get().remove(get().size() - 1);
        return t1;
    }

}
