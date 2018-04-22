package com.thefifthcontinent.sort;

public class RippleSort extends Sort {

    public static RippleSort newInstance() {
        return new RippleSort();
    }

    final public void sort(final int[] toBeSorted) {

        boolean swapPerformed = false;

        do {

            for (int currentItem=0; currentItem<toBeSorted.length -2; currentItem++) {
                swapPerformed = swap(toBeSorted, currentItem);
            }

            if (!swapPerformed) {
                break;
            }

            for (int currentItem=toBeSorted.length -2; currentItem>-0; currentItem--) {
                swapPerformed = swap(toBeSorted, currentItem);
            }

        } while(swapPerformed);
    }

    private RippleSort() {}
}
