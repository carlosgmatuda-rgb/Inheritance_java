package entities;

public class Company extends TaxPayers{
    private Integer numberOFemployees;

    public Company(Integer numberOFemployees) {
        super();
    }

    public Company(String name, Double annualIncome, Integer numberOFemployees) {
        super(name, annualIncome);
        this.numberOFemployees = numberOFemployees;
    }

    public Integer getNumberOFemployees() {
        return numberOFemployees;
    }

    public void setNumberOFemployees(Integer numberOFemployees) {
        this.numberOFemployees = numberOFemployees;
    }

    @Override
    public double tax() {
        if (numberOFemployees > 10) {
            return getAnnualIncome() * 0.14;
        } else {
            return getAnnualIncome() * 0.16;
        }
    }
}
