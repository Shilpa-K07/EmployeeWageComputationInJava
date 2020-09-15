public class EmpWageComputation
{
	public static final int WAGEPERHOUR=20;
	public static final int FULLDAYHOUR=8;
	public static void main(String[] args)
	{
		int dailyWage=0;
		System.out.println("Welcome to employee wage computation problem !");
        	int random=(int)Math.floor(Math.random()*10)%2;
		if(random ==1)
		dailyWage=WAGEPERHOUR*FULLDAYHOUR;
		System.out.println("Daily Wage is:" +dailyWage);
	}
}
