package n.ExamExercises.Exam23July2017;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JuiceDiet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(reader.readLine());
        int s = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int exceptQuantity = Integer.parseInt(reader.readLine());

        double cherry = 15;
        double strawberry = 7.5;
        double rasberry = 4.5;

        double maxValue = -Double.MAX_VALUE;

        int cCount = 0;
        int sCount = 0;
        int rCount = 0;


        for (int i = 0; i <= c; i++) {

            for (int j = 0; j <= s; j++) {

                for (int k = 0; k <= r; k++) {

                    double fruitSum = i * cherry + j * strawberry + k * rasberry;
                    if (fruitSum <= exceptQuantity) {
                        if (fruitSum >= maxValue) {
                            maxValue = fruitSum;
                            cCount = i;
                            sCount = j;
                            rCount = k;
                        }
                    }
                }
            }
        }
        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %f."
                , rCount, sCount, cCount, maxValue);
    }
}
