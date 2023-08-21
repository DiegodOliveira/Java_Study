package AbstractEmployee;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee John_Smith = new SalariedEmployee("John","Smith","111-11-111",800.00);
        HourlyEmployee Karen_Price = new HourlyEmployee("Karen","Price","222-22-222",16.75,40);
        ComissionEmployee Sue_Jones = new ComissionEmployee("Sue","Jones","333-33-333",10000,0.6);
        BasePlusCommissionEmployee Bob_Lewis = new BasePlusCommissionEmployee("Bob","Lewis","444-44-444",5000,.04,300);

        System.out.println("Employees processed individually");

        System.out.printf("%n%s%n%s: %.2f%n%n",John_Smith,"earned", John_Smith.earnings());
        System.out.printf("%n%s%n%s: %.2f%n%n",Karen_Price,"earned", Karen_Price.earnings());
        System.out.printf("%n%s%n%s: %.2f%n%n",Sue_Jones,"earned", Sue_Jones.earnings());
        System.out.printf("%n%s%n%s: %.2f%n%n",Bob_Lewis,"earned", Bob_Lewis.earnings());

        // Cria um array employee de quatro elementos.
        Employee[] employees = new Employee[4];

        // Inicializa o array de employees.
        employees[0] = John_Smith;
        employees[1] = Karen_Price;
        employees[2] = Sue_Jones;
        employees[3] = Bob_Lewis;

        System.out.printf("Employees processed polymorphically:%n%n");

        // Processa genericamente cada elemento em employees
        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            if( currentEmployee instanceof BasePlusCommissionEmployee){
                // downcast da referência de Employee para
                // referência a BasePlusCommissionEmployee
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }

            System.out.printf("earned: %,.2f%n%n", currentEmployee.earnings());
        }

        for(int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
    }
}
