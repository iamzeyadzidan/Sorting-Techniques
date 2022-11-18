package sorts;

import java.util.List;
import java.util.Random;

public class Partitioner<T extends Comparable<T>> {
    public int partition(List<T> array, int first, int last) {
        T pivot = array.get(last);
        int i = last - first - 1;
        for (int j = 0; j < last; j++) {
            if (array.get(j).compareTo(pivot) <= 0) {
                i++;
                new Swapper<T>().swap(array, i, j);
            }
        }
        new Swapper<T>().swap(array, i + 1, last);
        return i + 1;
    }

    public int randomPartition(List<T> array, int first, int last) {
        int pivot = new Random().nextInt(first, last);
        new Swapper<T>().swap(array, pivot, last);
        return partition(array, first, last);
    }
}
