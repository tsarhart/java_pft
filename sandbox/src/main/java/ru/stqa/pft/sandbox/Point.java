package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(double x1, double y1, double x2, double y2)
    {
        //Напишите тут ваш код
        return Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
    }
}
