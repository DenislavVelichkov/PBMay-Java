package d.ComplexLogicalStatements;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class InvalidNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        boolean isValid = (number >= 100) && (number <= 200) || number == 0;
        if (!isValid) {
            System.out.println("invalid");

        }
    }
}