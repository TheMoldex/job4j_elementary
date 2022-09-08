package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean that = left > right;
        int result = that ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int maxi = Max.max(5, 2);
        System.out.println(maxi);
    }
}
