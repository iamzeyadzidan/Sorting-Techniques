package sorts;

import java.util.List;

public interface ISort<T extends Comparable<T>> {
    public void sort(List<T> array, int first, int last);
}
