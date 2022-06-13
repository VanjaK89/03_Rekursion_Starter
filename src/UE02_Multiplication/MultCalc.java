package UE02_Multiplication;

public class MultCalc {

    public int calcMultiplication(int multiplicand, int multiplier)
    {
        if(multiplicand == 0 || multiplier == 0)
        return 0;
        else
            System.out.print(multiplicand + " ");
        if (multiplier == 1) {
            return multiplicand;
        } else {
            System.out.print(" + ");
            return multiplicand + (calcMultiplication(multiplicand, multiplier - 1));
        }
    }
}
