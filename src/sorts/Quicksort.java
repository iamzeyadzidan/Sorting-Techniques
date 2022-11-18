package sorts;

import java.util.List;

public class Quicksort implements ISort{
    @Override
    public void sort(List array, int first, int last) {
        if (first >= last)
            return;
        int pivot = new Partitioner<>().partition(array, first, last);
        sort(array, first, pivot - 1);
        sort(array, pivot + 1, last);
    }
}
