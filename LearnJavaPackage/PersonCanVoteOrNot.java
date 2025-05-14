package LearnJavaPackage;

import java.util.Scanner;

public class PersonCanVoteOrNot
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Please enter the age of a person");
	
	int a=s.nextInt();

	if(a>=18)
{
	System.out.println("PERSON CAN VOTE");
}
	else
{
	System.out.println("PERSON CANNOT VOTE");
	
	s.close();
}}}