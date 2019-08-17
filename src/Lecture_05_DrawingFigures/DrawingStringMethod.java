package DrawingFigures_05;

import java.io.IOException;
// void e metod, koito ne vryshta nishto

public class DrawingStringMethod {
    public static void main(String[] args) throws IOException {
//repeatString e imeto na metoda, koito sme syzdali

        String result = repeatString(" *", 10); // Zapazvame metoda po- dolu v promenliva
        System.out.println(repeatString(" *", 10));
    }
    private static String repeatString(String text, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;  //Izliza ot metoda i vryshta resultata;
    }
}
