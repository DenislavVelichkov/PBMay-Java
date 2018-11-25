package n.ExamExercises.Exam16December2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BarcodeGenerator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int scopeBeginning = Integer.parseInt(reader.readLine());
        int scopeEnd = Integer.parseInt(reader.readLine());

        int fourthDigitOfBeginning = scopeBeginning % 10;
        int thirdDigitOfBeginning = (scopeBeginning / 10) % 10;
        int secondDigitOfBeginning = (scopeBeginning / 100) % 10;
        int firstDigitOfBeginning = scopeBeginning / 1000;
        
        int fourthDigitOfEnd = scopeEnd % 10;
        int thirdDigitOfEnd = (scopeEnd / 10) % 10;
        int secondDigitOfEnd = (scopeEnd / 100) % 10;
        int firstDigitOfEnd = scopeEnd / 1000;
        
        for (int i = firstDigitOfBeginning; i <= firstDigitOfEnd; i++) { //use of continue za propuskane a interacii
            boolean firstCheck = i % 2 == 0;

            if (firstCheck) continue;

            for (int j = secondDigitOfBeginning; j <= secondDigitOfEnd; j++) {
                boolean secondCheck = j % 2 == 0;
                    if (secondCheck) continue;

                for (int k = thirdDigitOfBeginning; k <= thirdDigitOfEnd; k++) {
                    boolean thirdCheck = k % 2 == 0;
                    if (thirdCheck)continue;

                    for (int l = fourthDigitOfBeginning; l <= fourthDigitOfEnd; l++) {
                        boolean fourthCheck = l % 2 == 0;
                        if (fourthCheck) continue;

                            System.out.printf("%d%d%d%d ", i ,j ,k ,l);


                    }
                }
            }
        }
    }
}
