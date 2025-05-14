package LearnJavaPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThowsKeyword
{
	public static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
        br.close();
    }
public static void main(String[] args) throws IOException
{
	try {
        readFile(); // Caller must handle the exception
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }

	
}
}
