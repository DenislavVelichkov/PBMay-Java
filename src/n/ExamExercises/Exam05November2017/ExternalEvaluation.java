package n.ExamExercises.Exam05November2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExternalEvaluation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int students = Integer.parseInt(reader.readLine());
        double poorMarkCounter = 0d;
        double satisfactoryMarkCounter = 0d;
        double goodMarkCounter = 0d;
        double veryGoodMarkCounter = 0d;
        double excellentMarkCounter = 0d;

        for (int i = 1; i <= students; i++) {
            double mark = Double.parseDouble(reader.readLine());

            if (mark < 22.5){
                poorMarkCounter++;
            }else if (mark < 40.5){
                satisfactoryMarkCounter++;
            }else if (mark < 58.5){
                goodMarkCounter++;
            }else if (mark < 76.5){
                veryGoodMarkCounter++;
            }else {
                excellentMarkCounter++;
            }
        }
        System.out.printf("%.2f%% poor marks\n", (poorMarkCounter / students) * 100);
        System.out.printf("%.2f%% satisfactory marks\n", (satisfactoryMarkCounter / students) * 100);
        System.out.printf("%.2f%% good marks\n", (goodMarkCounter / students) * 100);
        System.out.printf("%.2f%% very good marks\n", (veryGoodMarkCounter / students) * 100);
        System.out.printf("%.2f%% excellent marks\n", (excellentMarkCounter / students) * 100);
    }
}
