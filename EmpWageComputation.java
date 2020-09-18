public class EmpWageComputation
{
	public static final int FULLDAYHOUR=8;
	public static final int PARTTIMEHOUR=4;
	private int totalWage=0;	
	
	private static String company;
	private static int wagePerHour;
	private static int numberOfWorkingDays;
	private static int numberOfWorkingHours;
	
	public EmpWageComputation(String company,int wagePerHour,int numberOfWorkingDays,int numberOfWorkingHours)
	{
		this.company=company;
		this.wagePerHour=wagePerHour;
		this.numberOfWorkingDays=numberOfWorkingDays;
		this.numberOfWorkingHours=numberOfWorkingHours;
	}
	
	public String toString()
	{
		return "Total Wage of "+company+" is: "+totalWage;
	}
		
	public void calculateEmpWage()
	{
		int workingHour=0;
		int currentWorkingDays=0;
		int currentWorkingHour=0;
		
		while(currentWorkingDays<numberOfWorkingDays && currentWorkingHour<numberOfWorkingHours)
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
                        if(currentWorkingHour<numberOfWorkingHours)
                        totalWage+=workingHour*wagePerHour;
                        else
                        break;
                 }
        }
		
	public static void main(String[] args)
	{
		EmpWageComputation objIntel=new EmpWageComputation("Intel",30,25,100);
		EmpWageComputation objGoogle=new EmpWageComputation("google",20,26,150);
		objIntel.calculateEmpWage();
		System.out.println(objIntel);
		objGoogle.calculateEmpWage();
		System.out.println(objGoogle);
	}
}
