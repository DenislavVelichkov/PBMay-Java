<<<<<<< HEAD:src/LogicalStatements_02/SpeedInfo.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/SpeedInfo.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeedInfo {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double spd = Double.parseDouble(scan.readLine());

        if (spd > 150 & spd <= 1000){
            System.out.println("ultra fast");

        }else if (spd > 50 & spd <= 150){
            System.out.println("fast");

        }else if (spd > 10 & spd <= 50){
            System.out.println("average");
        }else if (spd <= 10){
            System.out.println("slow");
        }else {
            System.out.println("extremely fast");
        }
    }
}
