package javaPackage;

public class BreakStatement1 {

	public static void main(String[] args) {
		//break the exec when i=10
		for(int i =3; i <20; i++)
		{
			if(i==10) 
			{
				
				break; // without this line code will print uptil 19
			}
			
			System.out.println(i);
			
			
		}

	}

}
