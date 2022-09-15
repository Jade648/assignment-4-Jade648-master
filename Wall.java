package edu.wctc;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Wall {

    private double width;
    private double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getwidth() {
        return width;
    }

    public double getheight() {
        return height;
    }

    public double getArea() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the wall:");
        double width = scanner.nextDouble();
        System.out.println("Enter the width of the wall:");
        double height = scanner.nextDouble();
        double area = width * height;
        System.out.println("The area of the walls is" + area);

        return area;

    }
}
