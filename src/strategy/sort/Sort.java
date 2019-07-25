package strategy.sort;

import strategy.sort.algorythm.BubbleSort;
import strategy.sort.algorythm.CountingSort;
import strategy.sort.algorythm.SortInterface;

public abstract class Sort {

    private SortInterface sortInterface;
    private int[] toSort;

    public Sort(int[] toSort) {
        if (haveNegative(toSort)) {
            sortInterface = new BubbleSort();
        } else {
            sortInterface = new CountingSort();
        }
        this.toSort = toSort;
    }

    public int[] sort() {

        return sortInterface.sortMe(this.toSort);
    }

    private boolean haveNegative(int[] toSort) {
        for (int i = 0; i < toSort.length; i++) {
            if (toSort[i] < 0) {
                return true;
            }
        }
        return false;
    }
}
