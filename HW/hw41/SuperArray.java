//Jessica Wu
//APCS1 pd8
//HW41 -- Array of Steel
//2017-11-27


/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
	_data = new int[10];
	_size = 0;
    }


    //output SuperArray in [a,b,c] format
    public String toString()
    {
        String str = "[";
	for (int item : _data){
	    str += _data[item] + ",";
	}
	str = str.substring(0, str.length() - 1) + "]";
	return str;
    }


    //double capacity of SuperArray
    private void expand()
    {
	int[] temp = new int[_data.length * 2];
	for (int i : _data){
	    temp[i] = _data[i];
	}
	_data = temp;
    }


    //accessor -- return value at specified index
    public int get( int index )
    {
	if (index < 0 || index >= _data.length) {
	    System.out.print("Error: Out of Bounds");}
	return _data[index];
    }


    //mutator -- set value at index to newVal,
    //           return old value at index
    public int set( int index, int newVal )
    {
	int oldVal = _data[index];
	_data[index] = newVal;
	return oldVal;    }


    //main method for testing
    public static void main( String[] args )
    {
	SuperArray curtis = new SuperArray();
	System.out.println( "Printing empty SuperArray curtis..." );
	System.out.println( curtis );

	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.set( i, i * 2 );
	}

	System.out.println("Printing populated SuperArray curtis...");
	System.out.println(curtis);

	for( int i = 0; i < 3; i++ ) {
	    curtis.expand();
	    System.out.println("Printing expanded SuperArray curtis...");
	    System.out.println(curtis);
	}
	/*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
    }//end main()


}//end class
