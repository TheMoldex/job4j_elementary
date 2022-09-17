package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double dolg = amount + (amount * percent / 100);
            amount = dolg - salary;
            year++;
        }
        return year;
    }
}
