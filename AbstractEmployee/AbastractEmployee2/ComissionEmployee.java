package AbstractEmployee;

public class ComissionEmployee extends Employee{

    private double grossSales;
    private double comissionRate;

    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate){
        super(firstName, lastName, socialSecurityNumber);

        if(comissionRate <= 0.0 || comissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        if(grossSales < 0.0)
            throw new IllegalArgumentException("Commision rate must be > 0.0");

        this.comissionRate = comissionRate;
        this.grossSales = grossSales;
    }

    public void setComissionRate(double comissionRate) {
        if(comissionRate <= 0.0 || comissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.comissionRate = comissionRate;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setGrossSales(double grossSales){
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    @Override
    public double earnings(){
        return getComissionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %,.2f","Commission employee", super.toString(), "Commission rate", getComissionRate(),
                "GrosssSales", getGrossSales());
    }
}
