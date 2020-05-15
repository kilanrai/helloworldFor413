package com.company;

/**
 * Create an interface named Pairable. A Pairable object contains two objects of
 * the same generic type T.
 * @param <T>
 */

public interface Pairable <T>{
    public T getFirst();
    public T getSecond();
    public void changeOrder();
}
