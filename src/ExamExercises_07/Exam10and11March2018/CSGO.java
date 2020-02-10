package ExamExercises_07.Exam10and11March2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSGO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int items = Integer.parseInt(reader.readLine());
        int money = Integer.parseInt(reader.readLine());
        int weaponPrice = 0;

if (items <= 7){
        for (int i = 0; i < items; i++) {
            String typeOfWeapon = reader.readLine();
            switch (typeOfWeapon){
                case "ak47":
                    weaponPrice += 2700;
                break;
                case "awp":
                    weaponPrice += 4750;
                    break;
                case "sg553":
                    weaponPrice += 3500;
                    break;
                case "grenade":
                    weaponPrice += 300;
                    break;
                case "flash":
                    weaponPrice += 250;
                    break;
                case "glock":
                    weaponPrice += 500;
                    break;
                case "bazooka":
                    weaponPrice += 5600;
                    break;
                    default:
                        break;
            }
        }
        if (weaponPrice <= money){
            System.out.printf("You bought all %d items! Get to work and defeat the bomb!", items);
        }else {
            System.out.printf("Not enough money! You need %d more money.", weaponPrice - money);
        }

        }else {
    System.out.println("Sorry, you can't carry so many things!");
        }
    }
}
