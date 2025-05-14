package LearnJavaPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP_StoreAccountsInMap
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	
	Map<String, String> accountDetails = new HashMap<>(); //Map to store account details

    System.out.print("Enter how many accounts you want to add: ");
    int count = s1.nextInt();
    s1.nextLine();

    for (int i = 1; i<= count; i++) {
        System.out.println("\nAccount " + i + ":");

        System.out.print("Enter Account Number: ");
        String accNumber = s1.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accHolder = s1.nextLine();

        accountDetails.put(accNumber, accHolder);
    }

    System.out.println("\nStored Account Details:");
    for (Map.Entry<String, String> entry : accountDetails.entrySet())
    {
        System.out.println("Account Number: " + entry.getKey() + ", Holder Name: " + entry.getValue());
    }

    s1.close();
}
}
