package n.ExamExercises.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PictureInTheWall {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int wight = Integer.parseInt(scan.readLine());
        int length = Integer.parseInt(scan.readLine());
        int a = Integer.parseInt(scan.readLine());
        int n = Integer.parseInt(scan.readLine());

        int sHall = wight * length;
        int sPictures = (a * a) * n;


        if (sHall > sPictures) {
            int diff = sHall - sPictures;
            System.out.printf("The pictures fit in the hole. Hole area is %d bigger than pictures area.", diff);

        } else {
            int diff = sHall - sPictures;
            System.out.printf("The pictures don't fit in the hole. Picture area is %d bigger than hole area.", Math.abs(diff));
        }
    }
}
