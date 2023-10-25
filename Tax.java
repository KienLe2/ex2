import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
public class Tax {
    public static void main(String[] args) {
        double productCosts = 9.99;
        double VAT = 0.23;
        double quantity = 10000;

        System.out.println();

        BigDecimal VAT = new BigDecimal("1")
                .divide(new BigDecimal("1000"), BigDecimal.ROUND_HALF_UP);
        BigDecimal bd = new BigDecimal("10").multiply(VAT);

    }
}
