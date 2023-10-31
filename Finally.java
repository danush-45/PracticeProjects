package corejavaprogram;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
	    {
	      System.out.println ("in try");
	      System.out.println (30 / 0);
	    }
	    catch (ArithmeticException ae)
	    {
	      System.out.println ("catch");
	    }
	    finally
	    {
	      System.out.println ("finally");
	    }
	    System.out.println ("after try catch finally");

	}

}
