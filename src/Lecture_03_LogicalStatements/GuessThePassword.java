<<<<<<< HEAD:src/LogicalStatements_02/GuessThePassword.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/GuessThePassword.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessThePassword {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String pass = scan.readLine();

        if (pass.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong Password!");
        }


    }
}
