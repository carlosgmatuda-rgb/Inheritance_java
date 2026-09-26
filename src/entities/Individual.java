package entities;

public class Individual extends TaxPayers{
    private Double healthcareSpending;

    @Override
    public double tax() {
        return 0;
    }
}
