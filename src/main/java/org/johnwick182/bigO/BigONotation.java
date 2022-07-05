package org.johnwick182.bigO;

/*
O(1)
O(N)
O(Nˆ2)

 */
public class BigONotation {
    public void exampleON(int[] numbers) { //example O(N)
        for (int i = 0; i < numbers.length; i++) { //O (N) will need to run each item in array
            System.out.println(numbers[i]);
        }
    }

    public int exampleO1(int[] numbers) { //O (1) access and return the first element of array.
        if (numbers != null)
            return numbers[0];
        return 0;
    }

    public boolean exampleONSquad(int[] numbers) { // O(N) * O(N) = O(N^2)
        for (int i = 0; i < numbers.length; i++) { // O(N)
            for (int j = 0; j < numbers.length; j ++) { // O(N)
                if (numbers[i] == numbers[j])
                    return true;
            }
        }
        return false;
    }

}
