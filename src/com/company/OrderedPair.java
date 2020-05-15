package com.company;

/**
 * @author Kilan C. Rai
 * A class of ordered pairs of objects having the same data type that implements
 * interface Pairable
 * @param <T>
 */

public class OrderedPair<T> implements Pairable<T> {
    private T first, second;

    // create a constructor
    public OrderedPair(T firstItem, T secondItem){
        first = firstItem;
        second = secondItem;

    }
    // Return the first object in this pair
    @Override
    public T getFirst() {
        return first;
    }
    // Return the second object in this pair
    @Override
    public T getSecond() {
        return second;
    }

    // Interchange the object in this pair
    @Override
    public void changeOrder() {
        T temp = first;
        first = second;
        second = temp; // changeOrder


    }
    // Return the string representation of this pair
    public String toString(){

        return "(" + first + ", " + second + ")";
    }
}
