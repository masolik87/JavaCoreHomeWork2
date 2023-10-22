//Написать функцию, возвращающую разницу между самым большим и самым маленьким
// элементами переданного не пустого массива.
package org.example;

public class Difference {
    public static int Difference (int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}
