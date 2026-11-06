package operator_statements;

public class Fizz_Buzz {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++)
		{
			
			if(i%5==0&&i%3==0) {
				
			System.out.println("enter Fizz& Buzz");
			}
			else if(i%5==0) {
				System.out.println("Fizz");
			}
				else if(i%3==0) {
					System.out.println("Buzz");	
				}
				else {
					System.out.println(i);
				}
			}
		}
	}


