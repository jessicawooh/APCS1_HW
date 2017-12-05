/*
  Jessica Wu
  APCS1 pd8
  HW38 -- Put It Together
  2017-11-21
*/

/* ------SUMMARY------
   1. created a method to generate random 4 letter strings
   2. created a method to populate a 2D array with these random Strings
   3. created a new toString to output array position numbers + value 
   4. created a swap method that calculated row/columns of 2 values that will be
   switched and switched them
   5. created a method to take in user input as method params
*/

/* ------DIRECTIONS------
   create a 2D array of unique 3- or 4-character Strings
   and display it in the terminal. 
   then prompt the user to specify two locations, 
   swap the items at these locations, 
   and redisplay the array.
*/

/* ----METHODS---
   1. generate random 3- or 4-character Strings --> genString()
   2. populate 2D array with those Strings --> populate()
   3. prompt user + print swap --> execute()
   4. swap --> swap()
   5. new toString --> toString()
*/

//import cs1 package
import cs1.Keyboard;

public class Swapper {

    //genString() --> generates random character String
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String genString(){
	String str = "";
	for (int i = 0; i < 4; i++){
	    int letterpos = (int) (Math.random() * ALPHABET.length());
	    str += ALPHABET.substring(letterpos, letterpos + 1); 
	}
	return str; 
    }//end genString()

    //populate() --> fill 2D array with random Strings
    public static void populate(String[][] a){
	for (int i = 0; i < a.length;i++){
	    for (int j = 0; j < a[i].length;j++){
		a[i][j] = genString();
	    }//end inner foreach loop
	}//end outer foreach loop
    }//end populate()

    // //---(ignore) testing method for populate()----
    // public static void print2( String[][] a )
    // {
    // 	for( String[] row : a ) {
    // 	    for( String i : row )
    // 		System.out.print( i + " ");
    // 	}
    // 	System.out.println();
    // }

    //toString() --> returns array
    public static String toString(String[][] a){
	int i = 0;
	String str = "";
	for (String[] row : a) {
	    for (String column : row) {
		str += " " + i + ": " + column;
		i += 1;
	    }
	    str += "\n";
	}
	return str;
    }//end toString()

    //swap() --> switches values at 2 locations
    public static void swap(String[][] a, int location1, int location2 ){

	try {
	    //figuring out new location
	    int swapLoc1R = (location1 / a[0].length);
	    int swapLoc1C = (location1 % a[swapLoc1R].length);
	    int swapLoc2R = (location2 / a[0].length);
	    int swapLoc2C = (location2 % a[swapLoc2R].length);

	    //actual swapping
	    String temp =  a[swapLoc1R][swapLoc1C];
	    a[swapLoc1R][swapLoc1C] = a[swapLoc2R][swapLoc2C];
	    a[swapLoc2R][swapLoc2C] =  temp;
	}
	catch (Exception e){
	    System.out.println("Position out of bound. Please try again.");
	    System.out.println("Switch two values! Choose the first position:");
	    int newLoc1 = Keyboard.readInt();
	    System.out.println("Now choose the second position:");
	    int newLoc2 = Keyboard.readInt();
	    swap(a, newLoc1, newLoc2);

	}
    }//end swap()

    //execute() --> takes in user input as method params
    public static void execute(){
	//new 2D array and populate 
	System.out.println("How many rows do you want your array to have?");
	int rows = Keyboard.readInt();
	System.out.println("How many columms do you want your array to have?");
	int col = Keyboard.readInt();
	String[][] a = new String[rows][col];
	populate(a);

	//pick swapping locations
	System.out.println("Current array:");
	System.out.println(toString(a));
       	System.out.println("Switch two values! Choose the first position:");
	int pos1 = Keyboard.readInt();
	System.out.println("Now choose the second position:");
       	int pos2 = Keyboard.readInt();
       	System.out.print("You are switching items ");
	System.out.print(pos1);
	System.out.print(" and ");
	System.out.println(pos2);

	//	System.out.print("You are switching: ");
	//	System.out.println(pos1);
	

	//swapping action
	swap(a, pos1, pos2);
	System.out.println(toString(a));
    }//end execute()
    
    
    public static void main(String[] args){

	// //test genString()
	// System.out.println(genString());

	// //test populate() and toString()
	// String[][] x = new String[2][3];
	// populate(x);
	// print2(x);
	// System.out.println(toString(x));

	// //test swap()
	// swap(x,1,2);
       	// System.out.println(toString(x));

	execute();

	
    }//end main()
}//end class Swapper
