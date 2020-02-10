package ComplexLogicalStatements_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cinema {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String typeProjection = reader.readLine();
        int r = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        double fullCinema = r * c;

        switch (typeProjection){
            case "Premiere":
                fullCinema *= 12.00;
                break;
            case "Normal":
                fullCinema *= 7.50;
                break;
            case "Discount":
                fullCinema *= 5.00;
                break;
                default:
                    break;
        }
        System.out.printf("%.2f leva", fullCinema);
    }
}
