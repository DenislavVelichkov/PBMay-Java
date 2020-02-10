<<<<<<< HEAD:src/LogicalStatements_02/ShapesCovers.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/ShapesCovers.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapesCovers {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String fgr = scan.readLine();
        double s = 0;

        if (fgr.equals("square")){

            double a = Double.parseDouble(scan.readLine());
            s = a * a;
            System.out.printf("%.3f",s);

        }else if (fgr.equals("rectangle")){

            double a = Double.parseDouble(scan.readLine());
            double b = Double.parseDouble(scan.readLine());
            s = a * b;
            System.out.printf("%.3f",s);

        }else if (fgr.equals("triangle")){

            double a = Double.parseDouble(scan.readLine());
            double h = Double.parseDouble(scan.readLine());

            s = (a * h) / 2;
            System.out.printf("%.3f",s);

        }else if (fgr.equals("circle")){

            double r = Double.parseDouble(scan.readLine());
            s = Math.PI * r * r;
            System.out.printf("%.3f",s);
        }
    }
}
