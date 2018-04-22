package com.thefifthcontinent;

import com.thefifthcontinent.sort.RippleSort;
import com.thefifthcontinent.sort.Sort;

public class Main {

    public static void main(String[] args) {

        int data[] = {14, 12, 19, 7, 4, 1};

        report("Before", data);

        final Sort sorter = RippleSort.newInstance();
        sorter.sort(data);

        report("After", data);

    }

    private static void report(final String when, final int[] data) {
        System.out.println(when + ": ");
        for (int item : data) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
