package javaPackage;

public class ifElseNested {

	public static void main(String[] args) {

		int age =50;
		int weight = 75;
		
		if(age>40) 
		{
			if(weight>75) 
			{
			System.out.println("overweight");
			}
			else 
			{
				System.out.println("Fit");
			}
		}
		else 
		{
			System.out.println("No records");
		}
			
		}
	}


