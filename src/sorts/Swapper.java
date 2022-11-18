package sorts;

import java.util.List;

public class Swapper<T extends Comparable<T>> {
    public void swap(List<T> array, int first, int second) {
        T element = array.get(first);
        array.set(first, array.get(second));
        array.set(second, element);
    }
}
