package ru.netology;

/**
 * binary facade
 */
public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        System.out.println(bins.sum("00000011", "00001001"));
        System.out.println(bins.mult("00000011", "00001001"));
    }
}
