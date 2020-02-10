package LogicalStatements_02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOneHtoTwoH {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(scan.readLine());

        if (value > 200){
            System.out.println("Greater than 200");
        }else if (value < 100){
            System.out.println("Less than 100");
        }else {
            System.out.println("Between 100 and 200");
        }
    }
}
