package com.company;

public class subclassInheritance {
    public subclassInheritance(){}

    public static void explainInheritance() {
        System.out.println("Using the keyword \"extends,\" one can declare a class to be a subclass of" +
                "\n another class. Subclasses inherit methods from their superclasses, but don't inherit" +
                "\n constructors; however, the \"super\" keyword can be used to invoke the constructor of" +
                "\n the superclass with parameters inserted into the super keyword call. Ex: the phrase" +
                "\n \"super(n, m)\" can be called in the constructor of a subclass, and will construct the" +
                "\n object. In the subclass constructor, the remaining instance variables can be declared" +
                "\n as well. The super keyword can also be used to call the overridden versions of inherited" +
                "\n methods. The notation for this action is \"super.method(parameters);.\" Inheritance creates" +
                "\n a class of attribute comparisons known as \"is-a,\" and \"has-a.\" Is-a comparisons mean" +
                "\n that the class on the left side of the comparison is a subclass of the superclass on the right." +
                "\n The has-a comparison means that the class on the left is superclass of the subclass on the right." +
                "\n The \"instanceof\" line can be called to return a boolean determining whether or not the statement" +
                "\n is true. If there is no call to super in the constructor of a subclass, it is automatically, " +
                "\n implicitly called by Java. All classes are subclasses of the Object class, where methods like" +
                "\n equals and toString originate.");
    }
}
