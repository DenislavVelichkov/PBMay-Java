package ExamExercises_07.Exam17September2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        int volume = a * b * c;
        double capacity = volume * 0.001;
        percent = percent * 0.01;

        double req = capacity * (1 - percent);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(req));

    }
}
