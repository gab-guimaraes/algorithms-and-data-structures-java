package org.johnwick182.recursion;

public class NFatorial {

    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(fatorialwithoutRec(5));
    }

    public static int fatorial(int n) {
        if (n > 0) {
            return fatorial(n - 1) * n;
        } else {
            return 1;
        }
    }

    public static int fatorialwithoutRec(int n) {
        int total = n;
        for (int i = n - 1; i > 0; i--) {
            total = total * i;
        }
        return total;
    }
}
