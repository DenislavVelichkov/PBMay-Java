package ComplexLogicalStatements_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gender {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double age = Double.parseDouble(scan.readLine());
        String gender = scan.readLine();

        if (gender.equals("DrawingFigures_05")) {
            if (age < 16) {
                System.out.printf("Miss",gender);
            }else {
                System.out.printf("Ms.",gender);
            }
        }else {
            if (age < 16) {
                System.out.printf("Master",gender);
            } else {
                System.out.printf("Mr.",gender);
            }
        }
    }
}
