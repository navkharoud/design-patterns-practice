
public class VacationVisitor implements Visitor
{    
    public VacationVisitor()
    {
    }

    public void visit(Employee e)
    {
        e.setVacationDays(e.getVacationDays()+7);
    }
}
