package Employee;

public class BasePlusComisionEmployeeTest {
    public static void main(String[] args) {
        BasePlusComissionEmployee employee= new BasePlusComissionEmployee("Bob","Lewis","333-33-333",5000,0.04,300);

        System.out.println("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "The social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross rate is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Comission rate is", employee.getComissionRate());
        System.out.printf("%s %n%s", "Base salary is", employee.getBaseSalary());

        System.out.printf("%n%s:%n%n%s%n", "Update employee information obtained by toString", employee.toString());
    }
}
