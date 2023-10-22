//Java Core lesson 2
package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(-1, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество чётных элементов массива " + Count.getArr(arr));
        System.out.println("Разница между мин. и макс. " + Difference.Difference(arr));
        System.out.println("Имеются ли два соседних элемента, с нулевым значением " + Zero.Zero(arr));
    }
}