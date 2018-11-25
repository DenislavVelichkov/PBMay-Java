package n.ExamExercises.Exam07May2017;

import java.util.Scanner;

public class AlcholeShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double whiskeyprice = Double.parseDouble(scan.nextLine());
        double beerqu = Double.parseDouble(scan.nextLine());
        double whinequ = Double.parseDouble(scan.nextLine());
        double rakiaqu = Double.parseDouble(scan.nextLine());
        double whiskeyqu = Double.parseDouble(scan.nextLine());

        double rakiaprice = whiskeyprice / 2;
        double whineprice = rakiaprice - (0.4 * rakiaprice);
        double beerprice = rakiaprice - (0.8 * rakiaprice);

        double rakiatot = rakiaqu * rakiaprice;
        double whinetot = whinequ * whineprice;
        double beertot = beerprice * beerqu;
        double whiskeytot = whiskeyqu * whiskeyprice;

        double tot = rakiatot + whinetot + beertot + whiskeytot;
        System.out.printf("%.2f",tot);

    }
}
