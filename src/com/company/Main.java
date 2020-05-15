package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, this is a generic data type with an ordered pair of String objects");

        // Create an ordered pair of String objects
        OrderedPair<String> fruit =new OrderedPair<>("apple", "banana");
        System.out.println(fruit);
        fruit.changeOrder();
        System.out.println(fruit);
        String firstFruit = fruit.getFirst();
        System.out.println(firstFruit + " has length " + firstFruit.length());
        System.out.println();
        System.out.println("This is a generic data type with an ordered pair of Integer objects!!!");

        // Create an ordered pair of Integer objects
        OrderedPair<Integer> intPair = new OrderedPair<>(1, 2);
        System.out.println(intPair);
        intPair.changeOrder();
        System.out.println(intPair);

    }
}
