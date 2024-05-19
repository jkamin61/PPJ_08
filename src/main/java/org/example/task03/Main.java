package org.example.task03;

public class Main {
    public static void main(String[] args) {
        char[] exampleArr = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};

        countChars(exampleArr,'a');
    }

    public static int countChars(char[] array, char charToBeCounted) {
        int count = 0;
        for (char element :
                array) {
            if (element == charToBeCounted) {
                count++;
            }
        }
        System.out.println("Given char occurred "+count+" times in given array");
        return count;
    }
}
