package LearnJavaPackage;

public class Enumeration
{
	enum Day 
	{
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}


public static void main(String[] args)
{
	
    Day today = Day.FRIDAY;
    System.out.println("Today is: " + today);
    
    
    switch(today)
    {
        case MONDAY:
            System.out.println("Start of work week");
            break;
        case FRIDAY:
            System.out.println("Weekend is near!");
            break;
        default:
            System.out.println("Midweek day");
}
}
}
