public class EmpWageComputation
{
	public static final int FULLDAYHOUR=8;
	public static final int PARTTIMEHOUR=4;
	
	public static void calculateEmpWage(String company,int wagePerHr,int totalWorkingDays,int totalWorkingHours)
	{
		int workingHour=0;
		int currentWorkingDays=0;
		int currentWorkingHour=0;
		int totalWage=0;
		
		
		  while(currentWorkingDays<totalWorkingDays && currentWorkingHour<totalWorkingHours)
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
                        if(currentWorkingHour<totalWorkingHours)
                        totalWage+=workingHour*wagePerHr;
                        else
                        break;
                 }
                System.out.println("Total Wage of "+company+" is : " +totalWage);
        }
		
	public static void main(String[] args)
	{
		calculateEmpWage("Oracle",40,20,100);
		calculateEmpWage("Intel",30,30,200);
	}
}
