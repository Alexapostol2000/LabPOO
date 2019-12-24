import java.util.Collection;
import java.util.LinkedHashSet;

public class Extend extends LinkedHashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if (integer % 2 == 1) {
            return false;
        } else {
            return super.add(integer);
        }
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean ok = true;
        for (Integer aux : c) {
            ok &= add(aux);
        }
        return ok;
    }
}
