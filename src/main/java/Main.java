import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle:");
        double principal = scanner.nextDouble();

        System.out.print("Annual intrest rate (%) :");
        double annualRate = scanner.nextDouble();
        double monthlyRate = annualRate / monthsInYear / percent ;

        System.out.print("period (Years):");
        int years = scanner.nextInt();
        int noOfPayments = years* monthsInYear ;

        double mortgage = principal * ( monthlyRate * Math.pow( 1 + monthlyRate , noOfPayments ))/( Math.pow( 1 + monthlyRate , noOfPayments ) - 1);
        System.out.print("Mortgage :" + NumberFormat.getCurrencyInstance().format(mortgage));



    }
}