package javaPackage;

public class Static3 {

	int roll;
	String Name;
	String College = "IIT";
	
		//constructor	
		Static3(int r, String n){
		roll = r;
		Name = n;
		}
		
		//User defined method
		public void getResult() {
		System.out.println(roll+" "+Name+" "+College);
		}

		
		public static void main(String[] args) {
		
			Static3 s1 = new Static3(1, "Rushali");
			
			Static3 s2 = new Static3(2, "Vaishali");

			Static3 s3 = new Static3(3, "Arvind");
			
			s1.getResult();
			s2.getResult();
			s3.getResult();

}

}
