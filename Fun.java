public class Fun {
	
	int add(int x, int y){
		return x+y;
	}

	int subtract(int x, int y){
		return 0;
	}

	int divide(int x, int y){
		return 0;
	}

	int multiply(int x, int y){
		return 0;
	}

	public static void main(String[] args) 
	{
		Fun app = new Fun();
		if (app.add(5, 2) == 7) 
		{
			System.out.println("Addition is working");
		}
		else 
		{
			 System.out.println("Addition is not working");
		}
		if (app.multiply(5, 2) == 10) 
		{
			System.out.println("Multiplication is working");
		}
		else 
		{
			 System.out.println("Multiplication is not working");
		}
		if (app.subtract(5, 2) == 3) 
		{
			System.out.println("Subtraction is working");
		}
		else 
		{
			 System.out.println("Subtraction is not working");
		}
		if (app.divide(5, 2) == 2) 
		{
			System.out.println("Division is working");
		}
		else 
		{
			 System.out.println("Division is not working");
		}
	}
	
}
		