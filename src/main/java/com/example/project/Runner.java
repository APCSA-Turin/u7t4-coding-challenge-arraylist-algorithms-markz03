package com.example.project;

public class Runner {
    public static void main(String[] args) {
        int[] intList18 = {1, 2, 3, 2, 4, 5, 5, 6};
        int[] intList19 = {1, 2, 6, 2, 3, 4, 6, 5, 5, 6, 7};
        int[] intList20 = {1, 2, 1, 2, 4, 1, 2, 4, 1, 1, 3};
        int[] intList21 = {1, 2, 3, 4, 3, 2, 1, 4, 1, 2, 3};
        int[] intList22 = {1, 2, 3, 4, 5, 6};
        int[] intList23 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 1, 2, 3, 4, 5, 6};
        int[] intList24 = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6};

        System.out.println(Main.modes(intList18));
        System.out.println(Main.modes(intList19));
        System.out.println(Main.modes(intList20));
        System.out.println(Main.modes(intList21));
        System.out.println(Main.modes(intList22));
        System.out.println(Main.modes(intList23));
        System.out.println(Main.modes(intList24));


    }
}
