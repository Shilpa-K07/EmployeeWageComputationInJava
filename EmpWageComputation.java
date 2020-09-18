interface IEmpWageComputation
{
	public void addCompanyEmpWage(String company,int wagePerHour,int numberOfWorkingDays,int numberOfWorkingHours);
	public void computeWage();
}

class CompanyEmpWage
{
	private int totalWage=0;	
	
	public final String company;
	public final int wagePerHour;
	public final int numberOfWorkingDays;
	public final int numberOfWorkingHours;
	
	public CompanyEmpWage(String company,int wagePerHour,int numberOfWorkingDays,int numberOfWorkingHours)
	{
		this.company=company;
		this.wagePerHour=wagePerHour;
		this.numberOfWorkingDays=numberOfWorkingDays;
		this.numberOfWorkingHours=numberOfWorkingHours;
	}
	
	public void setTotalWage(int totalWage)
	{
		this.totalWage=totalWage;
	}
	public String toString()
	{
		return "Total Wage for company "+company+" is: "+totalWage;
	}
}

public class EmpWageComputation implements IEmpWageComputation
{		
	public static final int FULLDAYHOUR=8;
        public static final int PARTTIMEHOUR=4;
	private int numberOfCompany=0;

	CompanyEmpWage[] companyEmpWageArray;

	public EmpWageComputation(int size)
	{
		companyEmpWageArray=new CompanyEmpWage[size];
	}
	
	@Override	
	public void addCompanyEmpWage(String company,int wagePerHour,int numberOfWorkingDays,int numberOfWorkingHours)	
	{
		companyEmpWageArray[numberOfCompany]=new CompanyEmpWage(company,wagePerHour,numberOfWorkingDays,numberOfWorkingHours);
		numberOfCompany++;
		
	}
	
	@Override
	public void computeWage()
	{
		for(CompanyEmpWage array:companyEmpWageArray)
		{
			if(array==null)
			continue;
			array.setTotalWage(calculateEmpWage(array));
			System.out.println(array);
		}
	}
	private int calculateEmpWage(CompanyEmpWage companyEmpWage)
	{
		int workingHour=0;
		int currentWorkingDays=0;
		int currentWorkingHour=0;
		int totalSalary=0;
		
		while(currentWorkingDays<companyEmpWage.numberOfWorkingDays && currentWorkingHour<companyEmpWage.numberOfWorkingHours)
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
                        if(currentWorkingHour<companyEmpWage.numberOfWorkingHours)
                        totalSalary+=workingHour*companyEmpWage.wagePerHour;
                        else
                        break;
                 }
	return totalSalary;
        }
		
	public static void main(String[] args)
	{
	 	EmpWageComputation object=new EmpWageComputation(5);
		object.addCompanyEmpWage("Intel",20,28,100);
		object.addCompanyEmpWage("Oracle",30,20,200);
		object.computeWage();
	}
}
