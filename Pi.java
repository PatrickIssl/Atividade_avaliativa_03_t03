import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Pi {
    public static void main(String[] args) {
        MathContext mc = new MathContext(50, RoundingMode.HALF_UP); // 50 dígitos de precisão
        BigDecimal pi = new BigDecimal("3");
        int sign = 1;
        long i = 1;

        while (true) {
            BigDecimal two = new BigDecimal("2");
            BigDecimal a = two.multiply(BigDecimal.valueOf(i));
            BigDecimal term = new BigDecimal("4")
                    .divide(a.multiply(a.add(BigDecimal.ONE)).multiply(a.add(new BigDecimal("2"))), mc);

            if (sign == 1) {
                pi = pi.add(term, mc);
            } else {
                pi = pi.subtract(term, mc);
            }

            System.out.println("Iteração " + i + ": " + pi.toPlainString());

            sign = -sign;
            i++;
        }
    }
}
