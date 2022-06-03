
/**
 * Navkaran Singh 3119008
 */
public class Twenties extends Handler
{
    private int amountOfBills = 10;
    private boolean process;

    public Twenties(int amount){
        amountOfBills = amount;
    }

    public boolean dispense(int money){
        if(money<= (amountOfBills*20)){
            int num = money/20;
            int remainder = money%20;
            amountOfBills = amountOfBills-num;
            if(remainder != 0){
                if(!successor.dispense(remainder)){
                    process = false;
                }
                else{
                    System.out.println("Dispensing " +num+" $20 note(s)");
                    process = true;
                }
            }
            else{
                System.out.println("Dispensing " +num+" $20 note(s)");
                process = true;
            }

        }
        else{
            successor.dispense(money);
            process = false;
        }
        return process;
    }
}
