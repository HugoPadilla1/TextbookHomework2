/*
 * @class: SecondstoHMS
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 5th, 2023
 * @description: This program will take a user inputted seconds, and convert it to the
 * corresponding amount of hours, minutes, and seconds.
 */

package TextbookHomework2;

import java.util.Scanner;

public class SecondsToHMS {
    public static void main (String[] args){
        Scanner ben = new Scanner (System.in);
        System.out.print("Enter a value in seconds: ");
        int seconds = ben.nextInt();
        int hours = seconds/3600;
        int remainingSeconds = seconds%3600; // takes the remaining seconds after calculating hours
        int minutes = remainingSeconds/60; // and converts them to minutes
        remainingSeconds = remainingSeconds%60; 
        System.out.println(seconds + "seconds would equal " + hours + "hours, " + minutes + "minutes, and " + remainingSeconds + "seconds.");
        ben.close();
    }
}
