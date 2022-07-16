package org.johnwick182.sort;

/*

 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort...");
        int[] myList = { 10, 15, 2, 0, 3 };
        System.out.println("Unsorted list...");
        for (int i : myList) {
            System.out.print(i + ", ");
        }
        int[] myListSorted = bubbleSort(myList);
        System.out.println("\nSorted list..");
        for (int i : myList) {
            System.out.print(i + ", ");
        }
    }

    public static int[] bubbleSort(int[] list) {
        int i, j, temp = 0;
        for (i = 0; i < list.length -1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }


}
