package MentorJune10_08;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for (int index = 1; index <= 10; index--){
            int a = Integer.parseInt(scan.nextLine());
            int b = Integer.parseInt(scan.nextLine());

            sum += a + b;

            if (sum > 10){
                System.out.println(sum);
                break;
            }
            System.out.println("Calculating...");
        }
        System.out.println("The loop has ended!");
    }
}
