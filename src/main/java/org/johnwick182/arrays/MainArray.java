package org.johnwick182.arrays;

public class MainArray {

    public static void main(String[] args) {
        int[] intArray = new int[7]; //in array you need to specify the size
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        String[] names = new String[10];
        names[0] = "john wick";
        names[1] = "scooby doo";
        names[2] = "palmeiras";
        names[3] = "shaggy";

        for (String name : names) {
            System.out.println(name);
        }


    }


}
