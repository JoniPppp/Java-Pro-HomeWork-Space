package com.hillel.homework4;

import java.util.Arrays;

public class ClassName {
    private final Integer[] array;

    protected ClassName(int length) {
        this.array = new Integer[length];
    }

    protected int getLength() {
        return array.length;
    }

    protected int getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        }
        System.out.println("Довжена масиву менше за вказаний індекс або введено відємне число.");
        return -1;
    }

    protected void setElement(int index, Integer value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else System.out.println("Довжена масиву менше за вказаний індекс або введено відємне число.");
    }

    @Override
    public String toString() {
        return "Array data=" + Arrays.toString(array);
    }
}
