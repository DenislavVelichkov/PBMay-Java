package n.ExamExercises.Exam28an29April2018;

import java.util.Scanner;

public class ProgramingBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pageprice = Double.parseDouble(scan.nextLine());
        double coverprice = Double.parseDouble(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());
        double designer = Double.parseDouble(scan.nextLine());
        int team = Integer.parseInt(scan.nextLine());

        double bookprice = (pageprice * 899) + (coverprice * 2);
        double publishexp = bookprice * (1 - (double) discount / 100);
        double designerexp = publishexp + designer;

        System.out.printf("Avtonom should pay %.2f BGN.", designerexp * (1 - (double) team / 100));

    }
}
