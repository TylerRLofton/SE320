import java.text.NumberFormat;
import java.util.Locale;

public class Locales {
    public static void main(String[] args) {
        double number = 12345.678;

        NumberFormat ukFormat = NumberFormat.getInstance(Locale.UK);
        ukFormat.setMinimumFractionDigits(2);
        ukFormat.setMaximumFractionDigits(2);
        String ukFormattedNumber = ukFormat.format(number);
        System.out.println("UK formatted number: " + ukFormattedNumber);

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usFormattedNumber = usFormat.format(number);
        System.out.println("US formatted number: " + usFormattedNumber);

        String numberString = "12,345.678";
        try {
            Number parsedNumber = ukFormat.parse(numberString);
            System.out.println("Parsed number: " + parsedNumber.doubleValue());
        } catch (Exception e) {
            System.out.println("Failed to parse number: " + e.getMessage());
        }
    }
}

