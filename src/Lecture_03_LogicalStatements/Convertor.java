<<<<<<< HEAD:src/LogicalStatements_02/Convertor.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/Convertor.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Convertor {
    public static void main(String[] args) throws IOException {
        BufferedReader scan =new BufferedReader(new InputStreamReader(System.in));

        double input = Double.parseDouble(scan.readLine());
        String from = scan.readLine();
        String to = scan.readLine();

        if (from.equals("mm")){
            input = input / 1000;
        }else if (from.equals("cm")){
            input = input / 100;
        }else if (from.equals("mi")) {
            input = input / 0.000621371192;
        }else if (from.equals("in")) {
            input = input / 39.3700787;
        }else if (from.equals("km")) {
            input = input / 0.001;
        }else if (from.equals("ft")) {
            input = input / 3.2808399;
        }else if (from.equals("yd")) {
            input = input / 1.0936133;
        }if (to.equals("mm")){
            input = input * 1000;
        }else if (to.equals("cm")){
            input = input * 100;
        }else if (to.equals("mi")) {
            input = input * 0.000621371192;
        }else if (to.equals("in")) {
            input = input * 39.3700787;
        }else if (to.equals("km")) {
            input = input * 0.001;
        }else if (to.equals("ft")) {
            input = input * 3.2808399;
        }else if (to.equals("yd")) {
            input = input * 1.0936133;
        }
        System.out.printf("%.8f %s",input,to);
    }
}
