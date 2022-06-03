
public class SalaryVisitor implements Visitor
{    
    public SalaryVisitor()
    {
    }

    public void visit(Employee e)
    {
        e.setSalary(e.getSalary()+1000);
    }
}
