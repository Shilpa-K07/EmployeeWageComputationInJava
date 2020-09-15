public class EmpWageComputation
{
	public static final int WAGEPERHOUR=20;
	public static final int FULLDAYHOUR=8;
	public static final int PARTTIMEHOUR=4;
	public static void main(String[] args)
	{
		int dailyWage=0;
		int workingHour=0;
		System.out.println("Welcome to employee wage computation problem !");
        	int random=(int)Math.floor(Math.random()*10)%3;

		 switch(random)
                {
                        case 1: 
			workingHour=FULLDAYHOUR;
                        break;
                        case 2: 
			workingHour=PARTTIMEHOUR;
                        break;
                        default:       
			workingHour=workingHour;
                        break;
                }
		dailyWage=workingHour*WAGEPERHOUR;
		System.out.println("Daily Wage is:" +dailyWage);
	}
}
