package n.ExamExercises.Exam19March2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bills {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int months = Integer.parseInt(reader.readLine());

        double water = 20;
        double totWater = water * months;
        double internet = 15;
        double totInternet = internet * months;
        double totElectricity = 0;
        double totOthers = 0;

        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(reader.readLine());

            totElectricity += electricity;
            totOthers += (electricity + water + internet) + (electricity + water + internet) * 0.2;
        }
        System.out.printf("Electricity: %.2f lv%n",totElectricity);
        System.out.printf("Water: %.2f lv%n", water * months);
        System.out.printf("Internet: %.2f lv%n", internet * months);
        System.out.printf("Other: %.2f lv%n", totOthers);
        System.out.printf("Average: %.2f lv", (totElectricity + totWater + totInternet + totOthers) / months);
    }
}
