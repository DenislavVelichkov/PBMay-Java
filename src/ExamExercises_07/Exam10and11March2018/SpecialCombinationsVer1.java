package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialCombinationsVer1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int topBorderHundreds = Integer.parseInt(reader.readLine());
        int topBorderTens = Integer.parseInt(reader.readLine());
        int topBorderOnes = Integer.parseInt(reader.readLine());

        for (int i = 2; i <= topBorderHundreds; i++) {

            for (int j = 2; j <= topBorderTens; j++) {

                for (int k = 2; k <= topBorderOnes; k++) {

                    if (i % 2 == 0 && k % 2 == 0) {

                        boolean isPrime = true;

                        for (int l = 2; l <= Math.sqrt(j); l++) { //Namira prosto chislo (Prime) ot kombinaciite

                            if (j % l == 0) {                   //Proverqva Prime chisloto dali se deli samo na sebe si
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime){
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}

