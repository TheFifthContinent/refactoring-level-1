package com.thefifthcontinent;

public class Main {

    public static void main(String[] args) {

        int d[] = {14, 12, 19, 7, 4, 1};
        boolean s;

        System.out.println("Before: ");
        for (int i=0; i<d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();

        do {

            s = false;

            for (int i=0; i<d.length -2; i++) {

                if (d[i] > d[i+1]) {
                    int temp = d[i];
                    d[i] = d[i+1];
                    d[i+1] = temp;
                    s = true;
                }

            }

            if (!s) {
                break;
            }

            s = false;

            for (int i=d.length -2; i>-0; i--) {

                if (d[i] > d[i+1]) {
                    int temp = d[i];
                    d[i] = d[i+1];
                    d[i+1] = temp;
                    s = true;
                }

            }

        } while(s);

        System.out.println("After: ");
        for (int i=0; i<d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();

    }
}
