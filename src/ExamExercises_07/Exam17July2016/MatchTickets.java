package ExamExercises_07.Exam17July2016;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatchTickets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double budget = Double.parseDouble(reader.readLine());
        String category = reader.readLine();
        int people = Integer.parseInt(reader.readLine());

        double priceVip = 499.99;
        double priceNormal = 249.99;
        double moneyForTransport = 0;
        double moneyNeededForTickets = 0;

        if (people <= 4){
            moneyForTransport = budget * 0.75;
        }else if (people <= 9){
            moneyForTransport = budget * 0.6;
        }else if (people <= 24){
            moneyForTransport = budget * 0.5;
        }else if (people <= 49){
            moneyForTransport = budget * 0.4;
        }else {
            moneyForTransport = budget * 0.25;
        }
        switch (category){
            case "VIP":
                moneyNeededForTickets = priceVip * people;
                break;
            case "Normal":
                moneyNeededForTickets = priceNormal * people;
                break;
        }
        double budgetLeft = budget - moneyForTransport;

        if (moneyNeededForTickets < budgetLeft ){
            System.out.printf("Yes! You have %.2f leva left.", budgetLeft - moneyNeededForTickets);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budgetLeft - moneyNeededForTickets));
        }
    }
}
