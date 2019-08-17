package ExamExercises_07.Exam10and11March2018;


import java.util.Scanner;

public class ASCIICombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int numSum = 0;
        String numString = "";
        int capitalSum = 0;
        String capitalString = "";
        int smallSum = 0;
        String smallString = "";
        int otherSum = 0;
        String otherString = "";


        for (int i = 0; i < n; i++) {
            char symbol = scan.nextLine().charAt(0);

            if (symbol >= '0' && symbol <= '9') {
                numSum += symbol;
                numString += symbol;

            } else if (symbol >= 'A' && symbol <= 'Z') {
                capitalSum += symbol;
                capitalString += symbol;

            } else if (symbol >= 'a' && symbol <= 'z') {
                smallSum += symbol;
                smallString += symbol;
            } else {
                otherSum += symbol;
                otherString += symbol;
            }


        }
        int maxSum = Math.max(Math.max(numSum, capitalSum), Math.max(smallSum, otherSum));

        if (maxSum == numSum) {
            System.out.printf("Biggest ASCII sum is:%d%n", numSum);
            System.out.printf("Combination of characters is:%s", numString);
        } else if (maxSum == capitalSum) {
            System.out.printf("Biggest ASCII sum is:%d%n",capitalSum);
            System.out.printf("Combination of characters is:%s", capitalString);
        } else if (maxSum == smallSum) {
            System.out.printf("Biggest ASCII sum is:%d%n", smallSum);
            System.out.printf("Combination of characters is:%s", smallString);
        }else {
            System.out.printf("Biggest ASCII sum is:%d%n", otherSum);
            System.out.printf("Combination of characters is:%s", otherString);
        }
    }
}
