package corejavaprogram;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        try
        {
            int i = Integer.parseInt(sc.nextLine());
           
            if (99 % i == 0)
                System.out.println(i + " factor of 99");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Arithmetic " + ex);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Number Format Exception occurs" + ex);
        }

	}

}

