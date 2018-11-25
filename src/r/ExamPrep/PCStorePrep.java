package r.ExamPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PCStorePrep {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double processorPriceUSD = Double.parseDouble(reader.readLine());
            double videoCardPriceUSD = Double.parseDouble(reader.readLine());
            double ramPriceUSD = Double.parseDouble(reader.readLine());
            double ramQuantity = Double.parseDouble(reader.readLine());
            double discountPercent = Double.parseDouble(reader.readLine());

            double processorPriceLeva = processorPriceUSD * 1.57;
            double processorTotPrice = processorPriceLeva - (processorPriceLeva * discountPercent);

            double videoCardPriceLeva = videoCardPriceUSD * 1.57;
            double videoCardTotPrice = videoCardPriceLeva - (videoCardPriceLeva * discountPercent);

            double totRamPrice = ramPriceUSD * ramQuantity * 1.57;
            double result = processorTotPrice + videoCardTotPrice + totRamPrice;

        System.out.printf("Money needed - %.2f leva.", result);
    }
}
