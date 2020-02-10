<<<<<<< HEAD:src/LogicalStatements_02/EqualThreeNums.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/EqualThreeNums.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualThreeNums {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(scan.readLine());
        int b = Integer.valueOf(scan.readLine());
        int c = Integer.valueOf(scan.readLine());

        if (a == b && b == c){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
