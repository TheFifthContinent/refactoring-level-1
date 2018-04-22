package com.thefifthcontinent.sort;

import junit.framework.TestCase;

import java.util.Arrays;

public class SortTest extends TestCase {

    public void testRipple() {

        int data[] = {14, 12, 19, 7, 4, 1};
        int sorted[] = {1, 4, 7, 12, 14, 19};

        Sort sorter = RippleSort.newInstance();
        sorter.sort(data);

        assertEquals(Arrays.toString(sorted), Arrays.toString(data));
    }
}
