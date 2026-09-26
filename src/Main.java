import entities.Company;
import entities.Individual;
import entities.TaxPayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayers> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { //List payers
            System.out.println();
            System.out.println("Enter #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("healthcare spending: ");
                double healthcareSpending = sc.nextDouble();

                list.add(new Individual(name, annualIncome, healthcareSpending));
            } else {
                System.out.print("Enter number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAX PAYERS:");

        for (TaxPayers tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ", Tax: == " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAX: $ " + String.format("%.2f", sum));
        sc.close();
    }
}