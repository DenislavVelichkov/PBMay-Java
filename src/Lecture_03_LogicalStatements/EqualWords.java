<<<<<<< HEAD:src/LogicalStatements_02/EqualWords.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/EqualWords.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualWords {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String word1 = scan.readLine();
        String word2 = scan.readLine();


        if (word1.equalsIgnoreCase(word2)){
            System.out.println("yes");
        }else
            System.out.println("no");
    }
}
