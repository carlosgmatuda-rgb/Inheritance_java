package entities;

public class Individual extends TaxPayers{
    private Double healthcareSpending;

    public Individual(Double healthcareSpending) {
       super();
    }

    public Individual(String name, Double annualIncome, Double healthcareSpending) {
        super(name, annualIncome);
        this.healthcareSpending = healthcareSpending;
    }

    public Double getHealthcareSpending() {
        return healthcareSpending;
    }

    public void setHealthcareSpending(Double healthcareSpending) {
        this.healthcareSpending = healthcareSpending;
    }

    @Override
    public double tax() {
        if (getAnnualIncome() < 20000.00) {
            return getAnnualIncome() * 0.15 - healthcareSpending * 0.50;
        } else {
            return getAnnualIncome() * 0.25 - healthcareSpending * 0.50;
        }
    }
}
