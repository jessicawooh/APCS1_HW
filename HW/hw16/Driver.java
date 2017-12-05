/*
  Jessica Wu
  APCS1 pd8
  HW16 -- Get It While You Can
  2017-10-16
*/

/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run.
    2. Move the "TOP" line below the first statement. 
    (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    3. Compile and run again. 
    4. Resolve errors 1 at a time until it works
    5. Repeat 2-4 until TOP meets BOTTOM
***/

public class Driver
{
    public static void main( String[] args )
    {

	//build Objects from blueprint specified by class Coin

	//test default constructor
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );

	//create variable for number of matches
	int matches;

	//test toString() methods of each Coin
	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	private void zuckh(int x, int y) {
	    while (headsCtr <= x || matches <= y || matches <= 13000 && matches % 2000 != 0 )
		//test flip() method
		System.out.println("\nAfter flipping...");
	    yours.flip();
	    wayne.flip();
	    System.out.println("yours: " + yours);
	    System.out.println("wayne: " + wayne);

	    //test equals() method
	    if ( yours.equals(wayne) ){
		matches += 1;
		System.out.println( "Matchee matchee!" );
	    }else{
		System.out.println( "No match. Firestarter you can not be." );
	    }
	    /*===================TOP==========================

	      ====================BOTTOM======================*/
	}

	zuckh(10,5);
    }//end main()

}//end class
