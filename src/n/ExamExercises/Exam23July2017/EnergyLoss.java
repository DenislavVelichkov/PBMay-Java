package n.ExamExercises.Exam23July2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnergyLoss {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int trainingDays = Integer.parseInt(reader.readLine());
        int dancers = Integer.parseInt(reader.readLine());

        double energyLoss = 0;
        double totEnergy = 100 * dancers * trainingDays;
        double energyLossTotal = 0;

        for (int i = 1; i <= trainingDays; i++) {
            int trainingHours = Integer.parseInt(reader.readLine());

            if (i % 2 != 0 && trainingHours % 2 != 0){
                energyLossTotal += dancers * 30;

            }else if (i % 2 == 0 && trainingHours % 2 == 0){
                energyLossTotal += dancers * 68;

            }else if (i % 2 == 0 && trainingHours % 2 != 0){
                energyLossTotal += dancers * 65;

            }else {
                energyLossTotal += dancers * 49;
            }

        }
        double remainingTotEnergy = totEnergy - energyLossTotal;
        double remainingEnergyPerDancer = remainingTotEnergy / dancers / trainingDays;

        if (100 - remainingEnergyPerDancer <= 50){
            System.out.printf("They feel good! Energy left: %.2f", remainingEnergyPerDancer);
        }else {
            System.out.printf("They are wasted! Energy left: %.2f", remainingEnergyPerDancer);
        }
    }
}
