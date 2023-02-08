/*
 * @class: AreaAndVolume
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 5th, 2023
 * @description: This program will calculate the area and volume of a cylinder, with
 * user inputs of radius.
 */
package TextbookHomework2;

import java.util.Scanner;

public class AreaAndVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = input.nextInt();
        System.out.print("Enter the length: ");
        int length = input.nextInt();
        System.out.println("You inputted radius " + radius + "."); // Verifies the amounts given,
        System.out.println("You inputted length " + length + ".");
        double area = radius * radius * 3.1416; // Provides calculation of area and volume.
        double volume = area * length;
        System.out.println("This results in an area of " + area + ", with a volume of " + volume + ".");
        input.close();
    }
}
