package n.ExamExercises.Exam24April2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationsBetweenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double n1 = Double.parseDouble(reader.readLine());
        double n2 = Double.parseDouble(reader.readLine());
        String operator = reader.readLine();

        double sum = 0;
        double sub = 0;
        double mult = 0;
        double dev = 0;
        double mod = 0;
        double result = 0;

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            switch (operator) {
                case "+":
                    sum = n1 + n2;
                    result = sum;
                    break;
                case "-":
                    sub = n1 - n2;
                    result = sub;
                    break;
                case "*":
                    mult = n1 * n2;
                    result = mult;
                    break;
            }
            boolean var1 = (sum % 2 == 0) && (sub % 2 == 0) && (mult % 2 == 0);

            if (var1 && n1 != 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", n1, operator, n2, result);

            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", n1, operator, n2, result);
            }
            return;
        }

            if (operator.equals("/") && n2 != 0) {
                dev = n1 / n2;
                System.out.printf("%.0f %s %.0f = %.2f", n1, operator, n2, dev);

            } else if (operator.equals("%") && n2 != 0) {
                mod = n1 % n2;
                System.out.printf("%.0f %s %.0f = %.0f", n1, operator, n2, mod);

            } else {
                System.out.printf("Cannot divide %.0f by zero", n1);
            }
        }
}

