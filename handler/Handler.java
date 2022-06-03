
/**
 * Navkaran Singh 3119008
 */
public abstract class Handler
{
    protected Handler successor; 

    //constructor doesnt need arguments for the handler
    public Handler() { 

    }

    // sets the successor for the chain of responsibility pattern
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    // abstract boolean method for the dispensing of notes
    public abstract boolean dispense(int money);

}
