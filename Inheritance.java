package corejavaprogram;
class Employee {
    void salary() {
        System.out.println("Regular Salary= 200000");
    }
}
class FestiveBonus extends Employee { 
    void bonus() {
        System.out.println("Diwali Bonus=50000");
    }
}
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   FestiveBonus f = new FestiveBonus();
	       f.salary(); 
	       f.bonus(); 

	}

}

