package t.JavaBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEncryption {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        StringBuilder encryptedStr = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            char letter = reader.readLine().charAt(0);
            encryptedStr.append(encrypt(letter));
        }
        System.out.print(encryptedStr);
    }

    private static String encrypt(char charToBeEncrypted) {

        int firstPart;
        int secondPart;

        if (charToBeEncrypted >= 100) {
            firstPart = (int) charToBeEncrypted / 100;
            secondPart = (int) charToBeEncrypted % 10;
        } else {
            firstPart = (int) charToBeEncrypted / 10;
            secondPart = (int) charToBeEncrypted % 10;
        }

        int thirdPart = charToBeEncrypted + secondPart;
        int fourthPart = charToBeEncrypted - firstPart;

        String str;
        str = "" + (char) thirdPart + firstPart + secondPart + (char) fourthPart;
        return str;
    }
}