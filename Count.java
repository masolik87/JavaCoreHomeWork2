//Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3
// countEvens([2, 2, 0]) → 3
// countEvens([1, 3, 5]) → 0
package org.example;

public class Count {
    public static int getArr(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0)
                count++;
        return count;
    }
}