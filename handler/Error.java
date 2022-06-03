
/**
 * Navkaran Singh 3119008
 */
public class Error extends Handler
{
    private boolean process;

    public Error(){
    }

    public boolean dispense(int money){
        if(money>=1000){
            System.out.println("A request of $"+money+" cannot be proccessed");
            process = false;
        }
        if(money%5 !=0){
            System.out.println("A request for $"+money+
                " cannot be accommodated since there are no fives or below in the ATM.");
            process = false;
        }
        return process;
    }
}
