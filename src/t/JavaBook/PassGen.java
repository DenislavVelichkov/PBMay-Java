package t.JavaBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PassGen {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder encryptedStr = new StringBuilder();

        String password = reader.readLine();
        char[] symbols = password.toCharArray();

        for (char element : symbols) {

            System.out.print(encrypt(element));
        }
    }

    private static String encrypt(char charToBeEnc) {

        String finalString;
        int firstPart;
        int secondPart;

        if (charToBeEnc >= 100) {
            firstPart = (int) charToBeEnc / 100;
            secondPart = (int) charToBeEnc % 10;
        } else {
            firstPart = (int) charToBeEnc / 10;
            secondPart = (int) charToBeEnc % 10;
        }

        int thirdPart = charToBeEnc + secondPart;
        int fourthPart = charToBeEnc - firstPart;


        finalString = "" + (char) thirdPart + firstPart + secondPart + (char) fourthPart;
        return finalString;
    }
}