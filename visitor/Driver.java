
public class Driver
{
    
    public static void main(String[] args)
    {
        Company company = new Company();
        company.add(new Employee(1,14,100000,"Jill"));
        company.add(new Employee(1,7,100000, "Jack"));
        System.out.println("\nOriginal info for employees");
        company.display();
        
        System.out.println("\nChange in salaries");
        company.accept(new SalaryVisitor());
        company.display();
        
        System.out.println("\nChange in vacation time");
        company.accept(new VacationVisitor());
        company.display();
    }

}
