import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeDupes {

    // Requires: The input list must not be null and must have at least one element.
    public static void removeDuplicates(List lst) {
        if (lst == null || lst.size() == 0)
            return;
        List copy = new ArrayList<>(lst);
        Iterator elements = copy.iterator();
        Object pre = elements.next();
        while (elements.hasNext()) {
            Object nex = elements.next();
            if (pre.equals(nex))
                lst.remove(nex);
            else
                pre = nex;
        }
    }
}