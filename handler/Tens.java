
/**
 *  Navkaran Singh 3119008
 */
public class Tens extends Handler
{
    private int amountOfBills = 100;
    private boolean process;

    public Tens(int amount){
        amountOfBills = amount;
    }

    public boolean dispense(int money){
        if(money<= (amountOfBills*10)){
            int num = money/10;
            int remainder = money%10;
            amountOfBills = amountOfBills-num;
            if(remainder != 0){
                if(!successor.dispense(remainder)){
                    process = false;
                }

            }
            else{
                System.out.println("Dispensing " +num+" $10 note(s)");
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
