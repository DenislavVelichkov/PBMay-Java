<<<<<<< HEAD:src/LogicalStatements_02/NumberOneHtoTwoH.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/NumberOneHtoTwoH.java


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOneHtoTwoH {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(scan.readLine());

        if (value > 200){
            System.out.println("Greater than 200");
        }else if (value < 100){
            System.out.println("Less than 100");
        }else {
            System.out.println("Between 100 and 200");
        }
    }
}
