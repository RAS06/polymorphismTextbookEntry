package com.company;

public class polymorphismTests {
    public polymorphismTests(){}

    public static void explainPolymorphism() {
        System.out.println("Polymorphism relates to reference variables that refer to objects from different places at different points in the code." +
                "\n If an object is declared and initalized: \"Obj obj = new subObj,\" the Obj type on the left is known as the \"Declared Type,\" and" +
                "\n will be checked for correctness at compile time. If that object type does not have a method for the type being called, the compiler" +
                "\n will throw an error. At run-time, the \"Actual Type,\" on the right will be used in declaration. That also means that if the method" +
                "\n is overriden, the overriden method will be called instead. Casting down on objects can be performed to avoid this. Any method can be" +
                "\n overriden, including methods from the object class. There is no raw algorithm to show for this unit.");
    }


}
