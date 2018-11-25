package g.ComplexLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class labelTheory {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    myLoop: //Name Loop
    for (int i = 0; i < 3; i++) {
        System.out.println(i);
        for (int j = 0; j < 3; j++) {
            if (j == 2){
                break myLoop;
            }
        }
    }

    }
}
