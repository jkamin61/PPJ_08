package org.example.task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int randomArrayLength = random.nextInt(20);
        int[] array1 = new int[randomArrayLength];
        int[] array2 = new int[randomArrayLength];

        for (int i = 0; i < randomArrayLength; i++) {
            array1[i] = random.nextInt(100);
            array2[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int[] result = processArrays(array1, array2, -1);
        printArray(result);
    }

    public static int[] processArrays(int[] array1, int[] array2, int value) {
        if (value < 0) {
            // Sumowanie elementów na tych samych indeksach
            int minLength = Math.min(array1.length, array2.length);
            int[] result = new int[minLength];
            for (int i = 0; i < minLength; i++) {
                result[i] = array1[i] + array2[i];
            }
            return result;
        } else if (value > 0) {
            // Zwracanie elementów, które nie mają "pary" indeksowej
            ArrayList<Integer> resultList = new ArrayList<>();
            if (array1.length > array2.length) {
                for (int i = array2.length; i < array1.length; i++) {
                    resultList.add(array1[i]);
                }
            } else if (array2.length > array1.length) {
                for (int i = array1.length; i < array2.length; i++) {
                    resultList.add(array2[i]);
                }
            }
            int[] result = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                result[i] = resultList.get(i);
            }
            return result;
        } else {
            // Zwracanie null w każdym innym przypadku
            return null;
        }
    }

    public static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
        } else {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
