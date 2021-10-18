package main.java;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        String function = args[0];
        switch (function) {
            case "add" -> {
                int num1 = Integer.parseInt(args[1]);
                int num2 = Integer.parseInt(args[2]);
                System.out.println(calculator.add(num1, num2));

                break;
            }
            case "subtract" -> {
                int num1 = Integer.parseInt(args[1]);
                int num2 = Integer.parseInt(args[2]);
                System.out.println(calculator.subtract(num1, num2));

                break;
            }
            case "multiply" -> {
                int num1 = Integer.parseInt(args[1]);
                int num2 = Integer.parseInt(args[2]);
                System.out.println(calculator.multiply(num1, num2));

                break;
            }
            case "divide" -> {
                int num1 = Integer.parseInt(args[1]);
                int num2 = Integer.parseInt(args[2]);
                System.out.println(calculator.divide(num1, num2));

                break;
            }
            case "fibonacci" -> {
                int num = Integer.parseInt(args[1]);
                System.out.println(calculator.fibonacciNumberFinder(num));

                break;
            }
            case "binary" -> {
                int num = Integer.parseInt(args[1]);
                System.out.println(calculator.intToBinaryNumber(num));

                break;
            }
        }

    }

}
