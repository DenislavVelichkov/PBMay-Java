package c.LogicalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSeconds {
    public static void main(String[] args) throws IOException {
        BufferedReader scan =new BufferedReader(new InputStreamReader(System.in));

        int sec1 = Integer.parseInt(scan.readLine());
        int sec2 = Integer.parseInt(scan.readLine());
        int sec3 = Integer.parseInt(scan.readLine());

        int total = sec1 + sec2 + sec3;
        int min = total / 60;
        int sec = total % 60;

        if (sec < 10){
            System.out.println(min + ":0" + sec);
        }else {
            System.out.println(min + ":" + sec);
        }

    }
}
