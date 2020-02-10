package ComplexLoops_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jCheckPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        boolean prime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) { //sqrt se izpolzva, za da se izvyrshat po- malko interacii
                                                // v sluchai, che chisloto e mnogo golqmo
            if (n % i == 0){
                prime = false;
                break;
            }
        }if (prime){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

    }
}
