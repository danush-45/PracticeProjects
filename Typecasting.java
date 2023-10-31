package corejavaprogram;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 9;
	    double myDouble = myInt;

	    System.out.println("Before conversion in implicit : "+myInt); 
	    System.out.println("After conversion in implicit : "+myDouble); 
	    
	    double d = 166.66;  
	    long l = (long)d;   
	      
	    System.out.println("Before conversion in explicit : "+d);  
	    
	    System.out.println("After conversion into long type in explicit: "+l);  
	      
	}

}
