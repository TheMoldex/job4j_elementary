package ru.job4j;

public class TestSite {
    private static int fibo ( int n) {
        if (n==1 || n==2) return 1;

        int f = 0;
        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i <= n;i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f;
}
    public static void main(String[] args) {
        int n=7;
        System.out.println(fibo(n));
    }
}