package fc_Pages;


public class PassParameters {


		public static void main(String[] args) {
			
			PassParameters obj = new PassParameters();
			obj.add(50, 100);
             obj.sum(500, 200);
}
		
public void add (int a , int b) {
	 int c= a+b;
	 System.out.println(c);
	
}

public void sum (double x , double y) {
	 double z=x-y;
	 System.out.println(z);
			 
}
}
