package LogicalStatements_02;

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
