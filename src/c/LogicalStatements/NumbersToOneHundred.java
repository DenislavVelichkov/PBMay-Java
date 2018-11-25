package c.LogicalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersToOneHundred {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(scan.readLine()); //masiv
        String[] toNineteen = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] toNinety = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        if (num < 0 )
        {
            System.out.println("Invalid number");
        }
        else if (num > 100)
        {
            System.out.println("Invalid number");
        }
        else if (num >= 0 && num <= 19)
        {
            System.out.println(toNineteen[num]);
        }
        else if (num >= 20 && num < 100)
        {
            if (num % 10 == 0)
            {
                System.out.println(toNinety[(num / 10) - 2]);
            }
            else
            {
                System.out.println(toNinety[(num / 10) - 2] +" "+ toNineteen[(num % 10)]);

            }
        }
        else if (num == 100)
        {
            System.out.println("one hundred");
        }

    }
}
