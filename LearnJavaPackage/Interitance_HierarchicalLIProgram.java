package LearnJavaPackage;
class Animal
{
	void MakeSound()
	{
		System.out.println("Animals make different sound");
	}
}
class DOG extends Animal
{
	void bark(String a)
	{
		System.out.println("Dogs Bark");
	}
}
class CAT extends Animal
{
	void meow(String b)
	{
		System.out.println("Cats Meow");
	}
}
class COW extends Animal
{
	void moo(String c)
	{
		System.out.println("Cows Mooo");
	}
}
public class Interitance_HierarchicalLIProgram
{
	public static void main(String[] args)
{
		DOG dog=new DOG();
		dog.MakeSound();
		dog.bark("Woof");
		
		CAT cat=new CAT();
		cat.MakeSound();
		cat.meow("Meow");
		
		COW cow=new COW();
		cow.MakeSound();
		cow.moo("Moo");
}}