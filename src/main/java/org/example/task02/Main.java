package org.example.task02;

public class Main {
    public static void main(String[] args) {
        int wrt = 5;
        modifyValue(wrt);
        //Powodem występowanie w terminalu dwóch innych wartości jest to, że na początku wyświetlamy wartość przed
        // modyfikacją, a następnie drugim wywołaniem wykonujemy to już po modyfikacji, dlatego też widzimy wartość 25.
    }

    public static void modifyValue(int value) {
        System.out.println(value);
        value = value * 5;
        System.out.println(value);
    }
}
