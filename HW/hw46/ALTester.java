//Jessica Wu
//APCS1 pd8
//HW46 -- Al<B> Sorted!
//2017-12-05


/*
  Class ALTester, which will populate an ArrayList with 23 Integers 
  and determine whether the list is sorted or not.
*/

import java.util.ArrayList;

public class ALTester 
{
    public static void sorted(ArrayList<Comparable> arraylist){
	for( int i = 0; i < arraylist.size()-1; i++ ) {
	    if ( arraylist.get(i).compareTo(arraylist.get(i+1)) > 0 ) {
		System.out.println( "Not sorted" );
		break;
	    }
	}
    }

    public static void main( String[] args ) 
    {
	ArrayList<Comparable> testarray = new ArrayList<Comparable>();

	// fill array
	for( int i=0; i<23; i++ ){
	    testarray.add( (int) (20 * Math.random()));
	}

	System.out.println(testarray);

	testarray.sorted();
    }
}
	    
