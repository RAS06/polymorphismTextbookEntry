package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

	    System.out.println("Welcome to the next rendition of the Interactive Java Textbook: by Riz." +
                "\nInput one of the following statements to continue." +
                "\nPolymorphic Methods" +
                "\nSubclass Inheritance");
        String s = scan.nextLine();

        while(!s.equals("terminate")) {
            if(s.equals("Polymorphic Methods")){
                polymorphismTests.explainPolymorphism();
            } else if(s.equals("Subclass Inheritance")) {
                subclassInheritance.explainInheritance();
            }
            s = scan.nextLine();
        }

    }
}
