public class weekthreehwtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int[] lengths = new int[names.length]; 
        for(int index = 0; index < names.length; index++) {
            String name = names[index]; 
            lengths[index] = name.length();
        }

        int totalLength = 0; 

        for (int length : lengths) {
            totalLength += length;
    }
        double average = totalLength / lengths.length;
        System.out.println("Average number of each name in the String names is: " + average);

        String totalNames = ""; 

        for (String name : names) {
        	totalNames += name + " "; 
        }
        System.out.println(totalNames);
        // Answer to question 3 and 4
        System.out.println(names[names.length - 1] +" is the last element and " +names[0] +" is the first element in the names array.");
		 
        int[] nameLengths = new int[names.length];
        for (int index = 0; index < names.length; index++) {
            String name = names [index];
            nameLengths[index] = names.length;
            System.out.println(name + " length = " + lengths[index]); }        
        int sumnameLengths = 0;
        for (String name : names) {
            sumnameLengths += name.length();        }
        System.out.println("The sum calculated in the namesLentgh array is " +sumnameLengths);
        	
        String word = "Holla";
        
        System.out.println( word.repeat(7) );
	
	int [] countIt = {3, 9, 23, 64, 2, 8, 28, 93, 98};
	

	 int sum = 0;
     
      for( int total : countIt) {
          sum = sum+total;
      }
      
      System.out.println("Sum of array elements is:"+sum);
      System.out.println(sum > 100);
     
      double[] dailyDouble = {3.9, 9.76, 23.4, 64.7, 2.6};
      double[] doubleDouble = {7.9, 67.76, 13.4, 14.7, 34.6};
      double allChar = 0;
      //Advanced for loop
      for( double doubler : dailyDouble) {
    	  allChar = allChar+doubler;
      }
      double dailyDoublesum = 0;
      
      for( double dailyDoubletotal : dailyDouble) {
    	  dailyDoublesum = dailyDoublesum+dailyDoubletotal;
      }
      
      double averageAge = allChar / dailyDouble.length;
      
      
      System.out.println("Sum of array elements in dailyDouble is:"+dailyDoublesum);
      System.out.println("The average age for dailyDouble is:"+averageAge);
      System.out.println(averageAge > dailyDouble.length);
      
      boolean isHotOutside = true; 
		double moneyInPocket = 15.80;
		boolean willBuyDrinks = (isHotOutside && moneyInPocket > 10.50);
		System.out.println(willBuyDrinks);}
		
	

	   

	
	

}