package corejavaprogram;

public class ClassObjects {
	private String name;
	ClassObjects() {
    System.out.println("Call constructor:");
    name = "Constructor";
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassObjects obj = new ClassObjects();
	    System.out.println("The name is " + obj.name);
	}

}
