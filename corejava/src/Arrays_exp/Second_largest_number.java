package Arrays_exp;

public class Second_largest_number {

	public static void main(String[] args) {
		int numbers[]= {1,2,3,4,5,6,7,1,9};
		int largest=numbers[0];
		int second=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
		if(numbers[i]>largest)
			{
			second=largest;
			largest=numbers[i];
				}
		else if(numbers[i]>second&&numbers[i]!=largest) {
			second=numbers[i];
		}
			
			
			}
		System.out.println("second largest number:"+second);
		}
	
			
		}
	

	
