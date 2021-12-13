
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n;
	int total=1;

	System.out.println("give the number to calculate factorial");
	n = Console.readInt();
		

			for (int i=1; i<=n; i++) {
				total = total * i; 
				
		}
			System.out.println("the total is = "+ total);
	}
	
}
