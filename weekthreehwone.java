
public class weekthreehwone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 98};
		// this would of been the answer if 93 was last and I used -1 instead of -2, figured I would show the answer for both.
		System.out.println(ages[0] - ages[ages.length - 2]);
		System.out.println(ages[0] - ages[ages.length - 1]);
		
		
		//use loop to calculate avg age 
		 int sum = 0;
	      //Advanced for loop
	      for( int total : ages) {
	          sum = sum+total;
	      }
	      int averageAge = sum / ages.length;
	      System.out.println("Sum of array elements is:"+sum);
	      System.out.println("The average age for ages is:"+averageAge);}
	      
	      
}