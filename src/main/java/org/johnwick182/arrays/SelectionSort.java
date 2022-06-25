package org.johnwick182.arrays;

public class SelectionSort {
    static int[] array = { 20, 35, -15, 7, 55, 1, -22 };

    public static void main(String[] args) {
        System.out.println("starting selection sort...");
        selectionSort();
        print();
    }

    public static void selectionSort() {
        for (int start = 0; start < array.length; start ++) {
            for (int index = start + 1; index < array.length; index ++) {
                System.out.println("comparando: " + array[index] + "," + array[start]);
                if (array[index] > array[start]) {
                    System.out.println("maior eh: " + array[index]);
                    int aux = array[start];
                    array[start] = array[index];
                    array[index] = aux;
                }
            }
        }
    }

    public static void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ", ");
        }
    }
}
