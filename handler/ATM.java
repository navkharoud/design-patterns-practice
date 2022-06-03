
/**
 * Navkaran Singh 3119008
 */
public class ATM
{
    private Fifties fifty;
    private Twenties twenty;
    private Tens ten;
    private Error err;

    public ATM(){ 
        // initialization
        fifty = new Fifties(10);
        twenty = new Twenties(10);
        ten = new Tens(100);
        err= new Error();
        // Setting successors for the chain 
        fifty.setSuccessor(twenty);
        twenty.setSuccessor(ten);
        ten.setSuccessor(err);
    }

    public void dispense(int money){
        boolean dispense = fifty.dispense(money);
    }
}
