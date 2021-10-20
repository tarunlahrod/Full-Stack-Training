package org.example;

public class Calculator {
    private int x;
    private int y;

    public Calculator(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
        System.out.println("Calculator constructor: double, double");
    }

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Calculator constructor: int, int");
    }

    public Calculator(String x, String y) {
        this.x = Integer.parseInt(x);
        this.y = Integer.parseInt(y);
        System.out.println("Calculator constructor: String, String");
    }

    public void addNumber() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Sum: " + (x + y));
    }
}
