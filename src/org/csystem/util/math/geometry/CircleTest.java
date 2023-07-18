package org.csystem.util.math.geometry;

import java.util.Random;
import java.util.Scanner;

public class CircleTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Input a number:");
        int count = kb.nextInt();

        while (count-- > 0) {
            System.out.println("---------------------------------------------------");
            double radius = random.nextDouble(-23.34, 23.34);
            System.out.printf("Generated Radius:%f%n", radius);
            Circle c = new Circle(radius);

            System.out.printf("Radius: %f%n", c.getRadius());
            System.out.printf("Area: %f%n", c.getArea());
            System.out.printf("Perimeter: %f%n", c.getPerimeter());
            System.out.println(c.toString());
            System.out.println("---------------------------------------------------");
        }

        System.out.println("Program sonu...");
    }

    public static void main(String[] args)
    {
        run();
    }
}
