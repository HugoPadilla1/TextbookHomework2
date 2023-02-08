/*
 * @class: usingPaint
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 5th, 2023
 * @description: So in this program I will be using the amount of 
 * gallons and paint in order to paint a room. I will be finding
 * the area of the walls and the area of the floor for a total of
 * 5 different areas. 
 */

package TextbookHomework2;

import java.util.Scanner;

public class usingPaint {
    public static void main(String[] args){
        Scanner ben = new Scanner(System.in);
        System.out.print("What is the length of the room? ");
        int length = ben.nextInt();
        System.out.print("What is the width? ");
        int width = ben.nextInt();
        System.out.print("What about the height? ");
        int height = ben.nextInt();
        System.out.print("Any windows? ");
        int windows = ben.nextInt();
        System.out.print("Any doors? ");
        int doors = ben.nextInt();
        ben.close();
        int walls = length * width * height; // this will give me area of the walls
        int floor = length * width; // this will give me the area of the floor
        int paintWindows = windows * 15;
        int paintDoors = doors * 21;
        int paintArea = floor + walls - paintWindows - paintDoors;
        int gallons = paintArea/350;
        double quarts = paintArea%350;
        System.out.println("You will need a total of " + gallons + " gallons, and " + quarts + " quarts.");
    }
}
