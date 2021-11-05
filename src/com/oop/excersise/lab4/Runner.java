package com.oop.excersise.lab4;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> oneExpression = Reader.read("one_expression.txt");
        List<String> threeExpressions = Reader.read("three_expressions.txt");

        assert oneExpression != null;
        System.out.println(Parenthesis.areBracketsBalanced(oneExpression.get(0)) + " " + oneExpression.get(0));

        assert threeExpressions != null;
        for (String threeExpression : threeExpressions) {
            System.out.println("\n" + Parenthesis.areBracketsBalanced(threeExpression) + " " + threeExpression);
        }
    }
}
