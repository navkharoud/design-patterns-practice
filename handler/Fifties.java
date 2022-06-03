
/**
 *  Navkaran Singh 3119008
 */
public class Fifties extends Handler
{
    private int amountOfBills = 10;
    private boolean process;

    //constructor sets the amount of notes available inside the atm machine 
    public Fifties(int amount){
        amountOfBills = amount;
    }

    //dispensing the money
    public boolean dispense(int money){
        if(money<= (amountOfBills*50)){
            int num = money/50;
            int remainder = money%50;

            if(remainder != 0){
                // return false of the error handler return false
                // for amounts which are not available inside the atm like 5s or less
                if(!successor.dispense(remainder)){
                    process = false;
                }
                //moves here if the chain doesnt go to the error and return true successfully
                else{
                    amountOfBills = amountOfBills-num;
                    System.out.println("Dispensing " +num+" $50 note(s)");
                    process = true;
                }
            }
            // moves here if the remainder is zero
            else{
                amountOfBills = amountOfBills-num;
                System.out.println("Dispensing " +num+" $50 note(s) ");
            }

        }
        //executes this if the inputted amount is greater than the available money 
        // goes to the error handler at the end of the chain via hte 20 and 10 handler
        else{
            successor.dispense(money);
            process = false;
        }
        return process;
    }
}
