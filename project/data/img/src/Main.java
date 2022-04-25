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

	File emptyFile = new File("empty.txt");
    Scanner emptyInput = new Scanner(emptyFile);
    //Checks if the file exists, if not, the program is closed
    if(!emptyFile.exists()) {
      System.out.println("The empty file doesn't exist.");
      System.exit(0);
    }
    //Counts the number of lines in the empty.txt file
   empty[] emp = new empty[count];
	while (emptyrInput.hasNextLine()) {
      count++;
      emptyInput.nextLine();
    }


	File largeFile = new File("large.txt");
    Scanner largeInput = new Scanner(largeFile);
    //Checks if the file exists, if not, the program is closed
    if(!largeFile.exists()) {
      System.out.println("The large file doesn't exist.");
      System.exit(0);
    }
    //Counts the number of lines in the large.txt file
   large[] emp = new large[count];
	while (largeInput.hasNextLine()) {
      count++;
      largeInput.nextLine();
    }


	
	File mediumFile = new File("medium.txt");
    Scanner mediumInput = new Scanner(mediumFile);
    //Checks if the file exists, if not, the program is closed
    if(!mediumFile.exists()) {
      System.out.println("The medium file doesn't exist.");
      System.exit(0);
    }
    //Counts the number of lines in the medium.txt file
   medium[] emp = new medium[count];
	while (mediumInput.hasNextLine()) {
      count++;
      mediumInput.nextLine();
    }

	
	File sheriFile = new File("sheri.txt");
    Scanner sheriInput = new Scanner(sheriFile);
    //Checks if the file exists, if not, the program is closed
    if(!sheriFile.exists()) {
      System.out.println("The sheri file doesn't exist.");
      System.exit(0);
    }
    //Counts the number of lines in the sheri.txt file
   sheri[] emp = new sheri[count];
	while (sheriInput.hasNextLine()) {
      count++;
      sheriInput.nextLine();
    }
	
	File smallFile = new File("small.txt");
    Scanner smallInput = new Scanner(smallFile);
    //Checks if the file exists, if not, the program is closed
    if(!smallFile.exists()) {
      System.out.println("The small file doesn't exist.");
      System.exit(0);
    }
    //Counts the number of lines in the small.txt file
   small[] emp = new small[count];
	while (smallInput.hasNextLine()) {
      count++;
      smallInput.nextLine();
    }


	File xlFile = new File("xl.txt");
    Scanner xlInput = new Scanner(xlFile);
    //Checks if the file exists, if not, the program is closed
    if(!xlFile.exists()) {
      System.out.println("The xl file doesn't exist.");
      System.exit(0);
    }
    //Counts the number of lines in the xl.txt file
   xl[] emp = new xl[count];
	while (xlInput.hasNextLine()) {
      count++;
      xlInput.nextLine();
    }
}
   }    


