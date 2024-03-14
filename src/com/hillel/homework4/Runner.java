package com.hillel.homework4;

public class Runner {
    public static void main(String[] args) {
        ClassName className = ClassNameFactory.newClassName(5);
        System.out.println(className);

        ClassLogic.fillClassNameMethod(className);
        System.out.println(className);

        ClassLogic.updateClassNameMethod(className, 4, 6);
        System.out.println(className);

        ClassLogic.deleteClassNameMethod(className, 1);
        System.out.println(className);
    }
}
