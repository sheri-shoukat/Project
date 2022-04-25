public class Main {
public static void main(String[] args) {

  
  // Get a string
	
        System.out.println("Input a string ");
	StringTokenizer data = new StringTokenizer(keyboardInput.readLine());

	// Output number of tokens in the line
	
	numberOfTokens = data.countTokens();
	System.out.println("Number of tokens = " + numberOfTokens + "\n");
	
	// Output tokens
	
	for (int counter=0; counter < numberOfTokens; counter++) { 
	    System.out.println(data.nextToken());
	    }	
	
  File customerFile = new File("Customers.txt");
    Scanner customerInput = new Scanner(customerFile);
    //Checks if the file exists, if not, the program is closed
    if(!customerFile.exists()) {
      System.out.println("The Customers file doesn't exist.");
      System.exit(0);
    }
    //Counts the number of lines in the Customers.txt file
    while (customerInput.hasNextLine()) {
      count++;
      customerInput.nextLine();
    }


}
   }    


