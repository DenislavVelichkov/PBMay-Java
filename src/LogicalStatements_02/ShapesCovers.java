package LogicalStatements_02;

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
