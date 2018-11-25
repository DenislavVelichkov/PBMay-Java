package d.ComplexLogicalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalType {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String animalType = reader.readLine();

        switch (animalType) {
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            case "dog":
                System.out.println("mammal");
                break;

                default:
                    System.out.println("unknown");
                    break;
        }
    }
}
