    package g.ComplexLoops;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class iSumDigits {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.valueOf(reader.readLine());
            int sum = 0;

            do {
                sum += (n % 10);
                n = n / 10;

            }while (n > 0);
            System.out.println(sum);

        }
    }
