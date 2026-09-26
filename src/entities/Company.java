package entities;

public class Company extends TaxPayers{
    private Integer numberOFemployees;

    @Override
    public double tax() {
        return 0;
    }
}
