package LearnJavaPackage;

public class FinalVariable
{

	public static void main(String[] args)
{
		// final variable (must be initialized)
        final int MAX_AGE = 100;
        
        //MAX_AGE = 120; // Error: cannot reassign final variable
        
        System.out.println("Maximum age: " + MAX_AGE);
    		
	}

}
