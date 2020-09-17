public class EmpWageComputation
{
	public static final int WAGEPERHOUR=20;
	public static final int FULLDAYHOUR=8;
	public static final int PARTTIMEHOUR=4;
	public static final int	TOTALWORKINGDAYS=20;
	public static final int MAXWORKINGHOURS=100;
	
	public static void calculateEmpWage()
	{
		int workingHour=0;
		int currentWorkingDays=0;
		int currentWorkingHour=0;
		int totalWage=0;
		
		
		  while(currentWorkingDays<TOTALWORKINGDAYS && currentWorkingHour<MAXWORKINGHOURS)
                {
                        int randomNumber=(int)Math.floor(Math.random()*10)%3;
                        switch(randomNumber)
                        {
                                case 1:
                                workingHour=FULLDAYHOUR;
                                break;
                                case 2:
                                workingHour=PARTTIMEHOUR;
                                break;
                                default:
                                workingHour=0;
                                break;
                        }
                        currentWorkingDays++;
                        currentWorkingHour+=workingHour;
                        if(currentWorkingHour<MAXWORKINGHOURS)
                        totalWage+=workingHour*WAGEPERHOUR;
                        else
                        break;
                 }
                System.out.println("Total Wage is :" +totalWage);
        }
		
	public static void main(String[] args)
	{
		calculateEmpWage();
	}
}
