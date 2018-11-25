package g.ComplexLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cPowersOfTwoVer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        for (int i = 0; i <= Math.pow(2, a); i*=2) {
            System.out.println(i);

        }
    }
}
