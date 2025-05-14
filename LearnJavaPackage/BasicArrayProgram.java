package LearnJavaPackage;

public class BasicArrayProgram
{
	public static void main(String[] args)
{
		int [] rollno = new int[5];
		
		rollno[0]=10;
		rollno[1]=20;
		rollno[2]=30;
		rollno[3]=40;
		rollno[4]=50;

		System.out.println(rollno[2]);
		
		String [] name=new String[3];
		
		name[0]="Rahul";
		name[1]="Aarti";
		name[2]="Aarav";

		System.out.println(name[0] + "'s roll no. is " + rollno[1]);
		System.out.println(name[1] + "'s roll no. is " + rollno[2]);
		System.out.println(name[2] + "'s roll no. is " + rollno[3]);
}

}
