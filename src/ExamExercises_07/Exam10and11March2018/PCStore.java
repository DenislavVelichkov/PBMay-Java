package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PCStore {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double cpuPrice = Double.parseDouble(scan.readLine());
        double gpuPrice = Double.parseDouble(scan.readLine());
        double ramPrice = Double.parseDouble(scan.readLine());
        int ramNeeded = Integer.parseInt(scan.readLine());
        double discount = Double.parseDouble(scan.readLine());

        double cpuDisc = cpuPrice - cpuPrice * discount;
        double gpuDisc = gpuPrice - gpuPrice * discount;

        double cpuBGN = cpuDisc * 1.57;
        double gpuBGN = gpuDisc * 1.57;
        double ramBGN = ramPrice * 1.57;


        double ramTot = ramBGN * ramNeeded;

        double totMoney = cpuBGN + gpuBGN + ramTot;

        System.out.printf("Money needed - %.2f leva.",totMoney);

    }
}
