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
                System.out.println("Total Wage of is : " +totalWage);
        }

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
		System.out.println("Welcome to employee wage computation problem !");
        	int random=(int)Math.floor(Math.random()*10)%3;
		int dailyWage=0;
		int workingHour=0;
		int i=0;
		int totalWage=0;
		int currentWorkingHour=0;
		if(random == 1)
		{
			System.out.println("Employee is present");
			dailyWage=WAGEPERHOUR*FULLDAYHOUR;
			System.out.println("Daily Wage is:" +dailyWage);
		}
		else if(random == 2)
		{
			System.out.println("Employee is present");
                	dailyWage=WAGEPERHOUR*FULLDAYHOUR;
                	System.out.println("Daily Wage is:" +dailyWage);
		}
		else
		{
			System.out.println("Employee is present");
			System.out.println("Daily Wage is:" +dailyWage);
		}
		
		System.out.println("Employee wage calculation using switch case");
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
		dailyWage=workingHour*WAGEPERHOUR;
		System.out.println("Daily Wage is:" +dailyWage);

		while(i<TOTALWORKINGDAYS)
		{
			int randomNum=(int)Math.floor(Math.random()*10)%3;                        
		 	switch(randomNum)
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
			totalWage+=workingHour*WAGEPERHOUR;
		 }
		System.out.println("Wage for a month:" +totalWage);
		System.out.println("Wage calculation by checking maximum hours and maximum days");
		totalWage=0;
		i=0;
		while(i<TOTALWORKINGDAYS && currentWorkingHour<MAXWORKINGHOURS)
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
			i++;
			currentWorkingHour+=workingHour;
			if(currentWorkingHour<MAXWORKINGHOURS)
			totalWage+=workingHour*WAGEPERHOUR;
			else
			break;
		 }
		System.out.println("Wage for a month:" +totalWage);
		System.out.println("Wage calculation using class method");
		calculateEmpWage();
		System.out.println("Wage Calculation for multiple companies");
		calculateEmpWage("Oracle",40,20,100);
		calculateEmpWage("Intel",30,20,200);
	}
}
