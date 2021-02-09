package com.agataporwit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String test = "{ { } } }";
        boolean testResults = StackParser.Parsing(test);
        System.out.println("String: " +testResults);

        String test2 =" { ( } )";
        boolean testResults2 = StackParser.Parsing(test2);
        System.out.println("String: " +testResults2);

        String test3 = "{ ( ) }";
        boolean testResults3 = StackParser.Parsing(test3);
        System.out.println("String: " + testResults3);
    }
}
