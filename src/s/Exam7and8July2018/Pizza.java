package s.Exam7and8July2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pizza {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String pizzaType = reader.readLine();
        String pizzaSize = reader.readLine();
        String pizzaSouse = reader.readLine();
        int pizzaCount = Integer.parseInt(reader.readLine());

        double withMeatSmall = 7.50;
        double withMeatBig = 11.0;

        double withoutMeatBig = 7.20;
        double withoutMeatSmall = 5.50;

        double veganBig = 5.45;
        double veganSmall = 3.90;

        double tomatoSouse = 1.50;
        double garlicSouse = 1.70;
        double specialSouse = 2.50;

        double totPizzaPrice = 0;

        switch (pizzaType) {
            case "with meat":
                switch (pizzaSize) {
                    case "big":
                        if (pizzaSouse.equals("none")) {
                            totPizzaPrice = withMeatBig;
                        } else switch (pizzaSouse) {
                            case "tomato":
                                totPizzaPrice = withMeatBig + tomatoSouse;
                                break;

                            case "garlic":
                                totPizzaPrice = withMeatBig + garlicSouse;
                                break;

                            case "special":
                                totPizzaPrice = withMeatBig + specialSouse;
                                break;
                        }
                        break;

                    case "small":
                        if (pizzaSouse.equals("none")) {
                            totPizzaPrice = withMeatSmall;
                        } else switch (pizzaSouse) {
                            case "tomato":
                                totPizzaPrice = withMeatSmall + tomatoSouse;
                                break;

                            case "garlic":
                                totPizzaPrice = withMeatSmall + garlicSouse;
                                break;

                            case "special":
                                totPizzaPrice = withMeatSmall + specialSouse;
                                break;
                        }

                }
                break;

            case "vegetarian":
                switch (pizzaSize) {
                    case "big":
                        if (pizzaSouse.equals("none")) {
                            totPizzaPrice = withoutMeatBig;
                        } else switch (pizzaSouse) {
                            case "tomato":
                                totPizzaPrice = withoutMeatBig + tomatoSouse;
                                break;

                            case "garlic":
                                totPizzaPrice = withoutMeatBig + garlicSouse;
                                break;

                            case "special":
                                totPizzaPrice = withoutMeatBig + specialSouse;
                                break;
                        }
                        break;

                    case "small":
                        if (pizzaSouse.equals("none")) {
                            totPizzaPrice = withoutMeatSmall;
                        } else switch (pizzaSouse) {
                            case "tomato":
                                totPizzaPrice = withoutMeatSmall + tomatoSouse;
                                break;

                            case "garlic":
                                totPizzaPrice = withoutMeatSmall + garlicSouse;
                                break;

                            case "special":
                                totPizzaPrice = withoutMeatSmall + specialSouse;
                                break;
                        }
                }
                break;

            case "vegan":
                switch (pizzaSize) {
                    case "big":
                        if (pizzaSouse.equals("none")) {
                            totPizzaPrice = veganBig;
                        } else {
                            totPizzaPrice = veganBig + tomatoSouse;
                        }
                        break;

                    case "small":
                        if (pizzaSouse.equals("none")) {
                            totPizzaPrice = veganSmall;
                        } else {
                            totPizzaPrice = veganSmall + tomatoSouse;
                        }
                        break;
                }
                break;
        }

        System.out.printf("%.2flv.", totPizzaPrice * pizzaCount);
    }
}
