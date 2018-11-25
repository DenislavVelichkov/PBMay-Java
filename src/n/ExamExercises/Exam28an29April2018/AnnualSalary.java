package n.ExamExercises.Exam28an29April2018;


import java.util.Scanner;

public class AnnualSalary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int exp = Integer.parseInt(scan.nextLine());
        String special = scan.nextLine();

        double salary = 0d;

        if (exp <= 5) {

            if (special.equalsIgnoreCase("C# Developer")) {
                salary = 5400 * 0.342 ;

            } else if (special.equalsIgnoreCase("Java Developer")) {
                salary = 5700 * 0.342 ;

            } else if (special.equalsIgnoreCase("Front-End Web Developer")) {
                salary = 4100 * 0.342 ;

            } else if (special.equalsIgnoreCase("UX / UI Designer")) {
                salary = 3100 * 0.342 ;

            } else if (special.equalsIgnoreCase("Game Designer")) {
                salary = 3600 * 0.342 ;
            }
        }else {

            if (special.equalsIgnoreCase("C# Developer")) {
                salary = 5400 ;

            } else if (special.equalsIgnoreCase("Java Developer")) {
                salary = 5700 ;

            } else if (special.equalsIgnoreCase("Front-End Web Developer")) {
                salary = 4100 ;

            } else if (special.equalsIgnoreCase("UX / UI Designer")) {
                salary = 3100 ;

            } else if (special.equalsIgnoreCase("Game Designer")) {
                salary = 3600 ;
            }
        }
        System.out.printf("Total earned money: %.2f BGN", salary * 12.0);
    }
}
