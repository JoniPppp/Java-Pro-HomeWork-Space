package com.hillel.homework4;

import java.util.Random;

public class ClassLogic {

    protected static ClassName fillClassNameMethod(ClassName className) {
        Random randomInt = new Random();
        for (int i = 0; i < className.getLength(); i++) {
            className.setElement(i, randomInt.nextInt());
        }
        return className;
    }

    protected static ClassName updateClassNameMethod(ClassName className, int index, Integer value) {
        className.setElement(index, value);
        return className;
    }

    protected static ClassName deleteClassNameMethod(ClassName className, int index) {
        className.setElement(index, null);
        return className;
    }
}
