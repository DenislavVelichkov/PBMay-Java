package c.LogicalStatements;

import java.util.Scanner;

public class Time15Pluse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.valueOf(scan.nextLine()); // diff between parseInt calls int , valueOf call Integer
        int minutes = Integer.valueOf(scan.nextLine()) + 15;

        if (minutes >= 60){
            hours++;
            minutes = minutes - 60;
            if (hours > 23){
                hours = 0;
            }
        }
        if (minutes < 10){
            System.out.println(hours + ":0" + minutes);
        }else {
            System.out.println(hours + ":" + minutes);
        }
    }
}
