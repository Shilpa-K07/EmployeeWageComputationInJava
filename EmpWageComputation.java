import java.util.*;
import java.util.Scanner;
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
		
	public static ArrayList getDetails()
	{
		Scanner scn=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		System.out.println("Enter company name");
		arr.add(scn.next());
		System.out.println("Enter Wage per hour");
		arr.add(scn.nextInt());
		System.out.println("Enter total working days");
		arr.add(scn.nextInt());
		System.out.println("Enter total working hours");
		arr.add(scn.nextInt());
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the number of companies");
		int n=scn.nextInt();
		int i=0;
		while(i<n)
		{
			ArrayList arr=getDetails();
			calculateEmpWage(arr.get(0).toString(),(int)arr.get(1),(int)arr.get(2),(int)arr.get(3));
			i++;
		}
	}
}
