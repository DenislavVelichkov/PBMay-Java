package n.ExamExercises.Exam14and15April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moving {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int freeSpaceWight = Integer.parseInt(reader.readLine());
        int freeSpaceLength = Integer.parseInt(reader.readLine());
        int freeSpaceHeight = Integer.parseInt(reader.readLine());

        int boxCount = 0;
        int spaceLeft = 0;
        int boxVolume = 1;

        String stop = reader.readLine();


        int freeSpaceVolume = freeSpaceWight * freeSpaceLength * freeSpaceHeight;


        while (!stop.equals("Done")) {

            int boxes = Integer.parseInt(stop);
            boxCount += boxes;



            if (boxCount * boxVolume > freeSpaceVolume){

                System.out.printf("No more free space! You need %d Cubic meters more.", boxCount * boxVolume - freeSpaceVolume);
                return;
            }

            stop = reader.readLine();

                }
        System.out.printf("%d Cubic meters left.", freeSpaceVolume - boxCount * boxVolume);


    }
}
