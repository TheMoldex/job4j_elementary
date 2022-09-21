package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("The array size is: " + ages.length);
        String[] surname = new String[100500];
        System.out.println("The array size is: " + surname.length);
        float[] prices = new float[40];
        System.out.println("The array size is: " + prices.length);
        String[] names = new String[4];
        names[0] = "Ruslan Saburov";
        names[1] = "Petr Arsentev";
        names[2] = "Sergey Gervis";
        names[3] = "Daniel Romanov";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
