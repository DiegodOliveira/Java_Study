package AbstractEmployee;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);

        if(wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be < 0.0");

        if((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 or <= 168.0");

        this.wage = wage;
        this.hours = hours;

    }

    public void setWage(double wage){
        if(wage < 0.0)
            throw new IllegalArgumentException("Wage must be >= 0.0");

        this.wage = wage;
    }

    public double getWage(){
        return wage;
    }

    public void setHours(double hours){
        if((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours must be <= 0.0 or >= 168.0");
    }

    public double getHours(){
        return hours;
    }

    @Override
    public double earnings(){
        if(getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() +(getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %,.2f","Hourly employee", super.toString(), "Hourly wage", getWage(),
                "Hours worked", getHours());
    }

    @Override
    public double getPaymentAmount(){
        return wage;
    }
}
