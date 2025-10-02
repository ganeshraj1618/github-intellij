import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;
        Scanner scanner = new Scanner(System.in);
        double monthlyRate = 0;
        double principal = 0;
        int noOfPayments =0;

        while (true) {
            System.out.print("\nPrinciple (1K - 1M):");
            principal = scanner.nextDouble();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.print("Enter a value between 1,000 and 1,000,000");
        }

        while (true)
        {
            System.out.print("\nAnnual intrest rate (%) :");
            double annualRate = scanner.nextDouble();
            if (annualRate > 0 && annualRate <= 100)
            {
                monthlyRate = annualRate / monthsInYear / percent;
                break;
            }

        System.out.print("Enter a value between 0 and 100");
        }


        while (true){
            System.out.print("\nperiod (Years):");
            int years = scanner.nextInt();
            if (years >0 && years <31) {
                noOfPayments = years * monthsInYear;
                break;
            }
        System.out.println("Enter a value between 1 and 30");
        }


        double mortgage = principal * ( monthlyRate * Math.pow( 1 + monthlyRate , noOfPayments ))/( Math.pow( 1 + monthlyRate , noOfPayments ) - 1);
        System.out.print("Mortgage :" + NumberFormat.getCurrencyInstance().format(mortgage));



    }
}