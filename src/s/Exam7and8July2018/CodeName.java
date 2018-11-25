package s.Exam7and8July2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char symbol = reader.readLine().charAt(0);

        int sum = 0;
        char a = 0;
        char b = 0;
        char c = 0;
        int d = 0;
        int max = 0;

        for (char j = 100; j <= 111; j++) {
            for (char k = 109; k <= 112; k++) {
                for (char l = 74; l <= 79; l++) {
                    for (int m = 10; m <= 50; m++) {
                        if (m % 2 == 0) {
                            d = m;
                        }
                        sum = symbol + j + k + l + d;

                        if (sum > max && sum % 10 == 8) {
                            max = sum;
                            if (max % 2 == 0) {
                                a = j;
                                b = k;
                                c = l;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(max);
        System.out.printf("%s%s%s%s%d", symbol, a, b, c, d);
    }
}



