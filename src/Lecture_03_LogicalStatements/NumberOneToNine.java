<<<<<<< HEAD:src/LogicalStatements_02/NumberOneToNine.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/NumberOneToNine.java

import java.util.Scanner;

public class NumberOneToNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());

        if (a == 1) {
            System.out.println("one");
        } else if (a == 2) {
            System.out.println("two");
        } else if (a == 3) {
            System.out.println("three");
        } else if (a == 4) {
            System.out.println("four");
        } else if (a == 5) {
            System.out.println("five");
        } else if (a == 6) {
            System.out.println("six");
        } else if (a == 7) {
            System.out.println("seven");
        } else if (a == 8) {
            System.out.println("eight");
        } else if (a == 9) {
            System.out.println("nine");
        } else
            System.out.println("number too big");
        }
    }

