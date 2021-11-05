package com.oop.excersise.lab4;

import java.util.Stack;

public class Parenthesis {
    public static boolean areBracketsBalanced(String expression) {
        Stack<Character> charStack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            } else if (c == ')' && !charStack.isEmpty() && charStack.peek() == '(') {
                charStack.pop();
            } else if (c == '}' && !charStack.isEmpty() && charStack.peek() == '{') {
                charStack.pop();
            } else if (c == ']' && !charStack.isEmpty() && charStack.peek() == '[') {
                charStack.pop();
            } else if (c ==')' && charStack.isEmpty()) {
                return  false;
            }
        }

        return charStack.isEmpty();
    }
}
