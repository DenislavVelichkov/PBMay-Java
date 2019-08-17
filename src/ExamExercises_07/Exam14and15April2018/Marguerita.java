package ExamExercises_07.Exam14and15April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marguerita {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int height = 7 * n + 3;
        int wight = 8 * n + 2;

        int dotCount = 0;
        System.out.println("'" + "&$" + repeatString("'", wight - 3));

        for (int i = 2; i <= n; i++) {
            System.out.println(repeatString("'", i) + "\\" + repeatString("'", wight - i - 1));
        }
//Sugar
        for (int i = 0; i < 1 ; i++) {
            for (int j = 0; j < wight / 2 - 1; j++) {
                System.out.print("^");
                System.out.print("*");
            }
        }
        System.out.print("^");
        System.out.println("'");
//Glass
        for (int i = 0; i <= n * 3 + 2; i++) {
            dotCount++;
            if (i <= n - 2) {
                System.out.println(repeatString("'", i) + "\\\\" +              //27
                        repeatString(" ", n) + "\\" + repeatString(" ", (n * 7 - i - 3) - dotCount) +
                        "//" + repeatString("'", i) + "'");
//Water Level
                if (i == n - 2) {
                    System.out.println(repeatString("'", i + 1) + "\\" +
                            repeatString("~", (n * 8 - i - 2) - dotCount) +
                            "/" + repeatString("'", i + 1) + "'");
                }
            }
            if (i >= n - 2 && i <= n) {
                System.out.println(repeatString("'", i + 1) + "\\" +
                        repeatString(" ", (n * 8 - 2) - dotCount) +
                        "/" + repeatString("'", i + 1) + "'");

            }
            if (i > n && i <= n + 1){
                System.out.println(repeatString("'", i + 1) + "\\" +
                        repeatString("_", (n * 6 - i + n + 2) - dotCount) +
                        "/" + repeatString("'", i + 1) + "'");
            }
            if (i == n + 2){
                System.out.println(repeatString("'", i + 1) + "\\" +
                        repeatString(".", (n * 6 - i + n + 2) - dotCount) +
                        "/" + repeatString("'", i + 1) + "'");
            }
            if (i > n + 2 && i <= n * 4 - n){
                System.out.println(repeatString("'", i + 1) + "\\" +
                        repeatString(" ", (n * 6 - i + n + 2) - dotCount) +
                        "/" + repeatString("'", i + 1) + "'");
            }if (i >= n * 4 - n + 1) {
                System.out.println(repeatString("'", i + 1) + "\\" +
                        repeatString("_", (n * 6 - i + n + 2) - dotCount) +
                        "/" + repeatString("'", i + 1) + "'");

            }

            /*'&$'''''''''''''''''''''''''''''''
''\'''''''''''''''''''''''''''''''
'''\''''''''''''''''''''''''''''''
''''\'''''''''''''''''''''''''''''
^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^'
\\ \ //'
'\\ \ //''
''\\ \ //'''
'''\~~~~~~~~~~~~~~~~~~~~~~~~~/''''
''''\ /'''''
'''''\ /''''''
''''''\___________________/'''''''
'''''''\................./''''''''
''''''''\ /'''''''''
'''''''''\ /''''''''''
''''''''''\ /'''''''''''
'''''''''''\ /''''''''''''
''''''''''''\ /'''''''''''''
'''''''''''''\ /''''''''''''''
''''''''''''''\___/'''''''''''''''
'''''''''''''''|||''''''''''''''''
'''''''''''''''|||''''''''''''''''
'''''''''''''''|||''''''''''''''''
'''''''''''''''|||''''''''''''''''
'''''''''''''''|||''''''''''''''''
'''''''''''''''|||''''''''''''''''
'''''''''''''''|||''''''''''''''''
'''''''''''''''|||''''''''''''''''
'''''''''''''''|||''''''''''''''''
_________________________________'
'-------------------------------''*/
        }

    }

    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
