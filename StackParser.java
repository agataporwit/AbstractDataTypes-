package com.agataporwit;

import java.util.Stack;

/**
 * @ agata porwit
 * assignment 2
 * Tom Abbott :) , Winter 2021
 * Your assignment submit things does not allow the file to be named assignment 2
 * Based on pseudo code from the book and past assignment from previous algo. class
 * <p>
 * If the brackets in the String parameter match up with one another,
 * method "Parsing" returns boolean true. Otherwise, it returns false.
 */
public class StackParser {

    public static boolean Parsing(String str) {
        Stack<Character> stack = new Stack<>();
        int b = 0;

        while (true) {
            if (b == str.length())
                break;
            //checking if we got to the left bracket if so means we adding to stack, than we check if we got to the right bracket and if it matches
            //current bracket on the left at the stack top
            char currentBracket = str.charAt(b);
            if (leftBracket(currentBracket)) {
                stack.push(currentBracket);
            } else if (rightBracket(currentBracket)) {
                if (stack.isEmpty())
                    return false;
                if (!(stack.pop()==isLeftLike(currentBracket)))
                    return false;
            }
            b++;
        }
        //extra bracket that is left
        if (!stack.isEmpty())
            return false;

        return true;
    }
    //left brackets
    private static boolean leftBracket(char currentBracket) {
        switch (currentBracket) {
            case '[':
            case '<':
            case '(':
            case '{':
                return true;

            default:
                return false;
        }
    }
    //right brackets
    private static boolean rightBracket(char currentBracket) {
        switch (currentBracket) {
            case ']':
            case '>':
            case ')':
            case '}':
                return true;

            default:
                return false;
        }

    }

    private static char isLeftLike(char currentBracket) {
        switch (currentBracket) {
            case ']':
                return '[';
            case '>':
                return '<';
            case ')':
                return '(';
            case '}':
                return '{';

            default:
                return 'E';
        }
    }
}
