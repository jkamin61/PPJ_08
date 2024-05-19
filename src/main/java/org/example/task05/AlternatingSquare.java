package org.example.task05;

public class AlternatingSquare {
    public static void main(String[] args) {
        printAlternatingSquare(5, 'x');  // Example usage
    }

    public static void printAlternatingSquare(int size, char startChar) {
        char firstChar = startChar;
        char secondChar = (startChar == 'x') ? 'o' : 'x';

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(firstChar);
                } else {
                    System.out.print(secondChar);
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
