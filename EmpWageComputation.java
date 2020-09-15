public class EmpWageComputation
{
	public static final int WAGEPERHOUR=20;
	public static final int FULLDAYHOUR=8;
	public static final int PARTTIMEHOUR=4;
	public static final int	TOTALWORKINGDAYS=20;
	public static final int MAXWORKINGHOURS=100;
	public static void main(String[] args)
	{
		long totalWage=0;
		int workingHour=0;
		int i=0;
		int currentWorkingHour=0;
		System.out.println("Welcome to employee wage computation problem !");

		 while(i<TOTALWORKINGDAYS && currentWorkingHour<MAXWORKINGHOURS)
		{
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
				workingHour=0;
               			break;
			}
			i++;
			currentWorkingHour+=workingHour;
			if(currentWorkingHour<MAXWORKINGHOURS)
			totalWage+=workingHour*WAGEPERHOUR;
			else
			break;
		 }
		System.out.println("Wage for a month:" +totalWage);
	}
}
