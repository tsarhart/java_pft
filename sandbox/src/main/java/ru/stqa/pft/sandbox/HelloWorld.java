package ru.stqa.pft.sandbox;

public class HelloWorld {
    public static void main(String[] args){
        hello("World");
        hello("Ilya");

        double l = 8;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 7;
        double b = 9;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}