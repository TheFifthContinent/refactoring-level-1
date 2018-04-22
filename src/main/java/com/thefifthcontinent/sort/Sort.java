package com.thefifthcontinent.sort;

public abstract class Sort {

    public abstract void sort(int[] toBeSorted);

    final boolean swap(final int[] toBeSorted, final int currentItem) {

        if (toBeSorted[currentItem] > toBeSorted[currentItem+1]) {
            int temp = toBeSorted[currentItem];
            toBeSorted[currentItem] = toBeSorted[currentItem+1];
            toBeSorted[currentItem+1] = temp;
            return true;
        }

        return false;
    }
}
