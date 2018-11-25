package n.ExamExercises.Exam14and15April2018;

import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double l = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double avgh = Double.parseDouble(scan.nextLine());

        double spaceship = w * l * h;
        double room = (avgh + 0.40) * 2 * 2;
        int space = (int) Math.floor(spaceship / room);

        if (space < 3){
            System.out.println("The spacecraft is too small.");
        } else if (space <= 10){
            System.out.printf("The spacecraft holds %d astronauts.",space);
            }else
            System.out.println("The spacecraft is too big.");
        }
    }
