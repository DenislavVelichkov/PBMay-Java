package ExamExercises_07.Exam14and15April2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AluminiumJoinery {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int quantity = Integer.parseInt(scan.readLine());
        String type = scan.readLine();
        String deliveryType = scan.readLine();

        double price = 0;
        double priceWithDiscount = 0;

        if (quantity < 10) {
            System.out.println("Invalid order");
            return;
        }
        switch (type) {
            case "90X130":
                if (quantity > 30 && quantity <= 60) {
                    price = quantity * 110;
                    priceWithDiscount = price * 0.95;

                } else if (quantity > 60 && quantity <= 99) {
                    price = quantity * 110;
                    priceWithDiscount = price * 0.92;

                } else if (quantity > 99) {
                    price = quantity * 110;
                    priceWithDiscount = price * 0.92;

                    if (deliveryType.equals("With delivery")) {
                        priceWithDiscount += 60;

                        System.out.printf("%.2f BGN", priceWithDiscount * 0.96);

                    } else {
                        System.out.printf("%.2f BGN", priceWithDiscount * 0.96);
                    }
                    return;
                } else {
                    price = quantity * 110;
                    priceWithDiscount = price;
                }
                break;
            case "100X150":
                if (quantity > 40 && quantity <= 80) {
                    price = quantity * 140;
                    priceWithDiscount = price * 0.94;

                } else if (quantity > 80 && quantity <= 99) {
                    price = quantity * 140;
                    priceWithDiscount = price * 0.90;

                } else if (quantity > 99) {
                    price = quantity * 140;
                    priceWithDiscount = price * 0.90;

                    if (deliveryType.equals("With delivery")) {
                        priceWithDiscount += 60;

                        System.out.printf("%.2f BGN", priceWithDiscount * 0.96);

                    } else {
                        System.out.printf("%.2f BGN", priceWithDiscount * 0.96);
                    }
                    return;
                } else {
                    price = quantity * 140;
                    priceWithDiscount = price;
                }
                break;
            case "130X180":
                if (quantity > 20 && quantity <= 50) {
                    price = quantity * 190;
                    priceWithDiscount = price * 0.93;

                } else if (quantity > 50 && quantity <= 99) {
                    price = quantity * 190;
                    priceWithDiscount = price * 0.88;

                } else if (quantity > 99) {
                    price = quantity * 190;
                    priceWithDiscount = price * 0.88;

                    if (deliveryType.equals("With delivery")) {
                        priceWithDiscount += 60;

                        System.out.printf("%.2f BGN", priceWithDiscount * 0.96);

                    } else {
                        System.out.printf("%.2f BGN", priceWithDiscount * 0.96);
                    }
                    return;
                } else {
                    price = quantity * 190;
                    priceWithDiscount = price;
                }
                break;
            case "200X300":
                if (quantity > 25 && quantity <= 50) {
                    price = quantity * 250;
                    priceWithDiscount = price * 0.91;

                } else if (quantity > 50 && quantity <= 99) {
                    price = quantity * 250;
                    priceWithDiscount = price * 0.86;

                } else if (quantity > 99) {
                    price = quantity * 250;
                    priceWithDiscount = price * 0.86;

                    if (deliveryType.equals("With delivery")) {
                        priceWithDiscount += 60;

                        System.out.printf("%.2f BGN", priceWithDiscount * 0.96);

                    } else {
                        System.out.printf("%.2f BGN", priceWithDiscount * 0.96);
                    }
                    return;
                } else {
                    price = quantity * 250;
                    priceWithDiscount = price;
                }
                break;
        }
        if (deliveryType.equals("With delivery")) {
            priceWithDiscount += 60;

            System.out.printf("%.2f BGN", priceWithDiscount);

        } else {
            System.out.printf("%.2f BGN", priceWithDiscount);
        }
    }
}
