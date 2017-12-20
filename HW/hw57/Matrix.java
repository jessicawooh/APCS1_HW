//Jessica Wu
//APCS1 pd8
//HW57 -- How Deep Does the Rabbit Hole Go?
//2017-12-19

/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/

public class Matrix {
    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix() {
	matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
    } 


    //constructor intializes an a*a matrix
    public Matrix( int a ) {
	matrix = new Object[a][a];
    }


    //return size of this matrix, where size is 1 dimension
    private int size() {
	int rows = matrix.length;
	int col = matrix[0].length;
	return rows * col; 
    }


    //return the item at the specified row & column   
    private Object get( int r, int c ) {
	return matrix[r][c];
    }


    //return true if this matrix is empty, false otherwise
    private boolean isEmpty() {
	boolean empty = true;
	for (int i =0; i < matrix.length; i++){
	    for (int j = 0; j < matrix[0].length; j++){
		if (matrix[i][j] == null){
		    empty = true;
		} else {
		    empty = false;
		}
	    }
	}
	return empty;
    }


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal )  {
	Object oldVal = matrix[r][c];
	matrix[r][c] = newVal;
	return oldVal;
    }


    //return String representation of this matrix
    // (make it look like a matrix)
    /*        -       -
     *   M =  | a b c |
     *        | d e f |
     *        -       -
     */
    public String toString()  {
    	String output = "";
    	for (int i = 0; i < matrix.length; i++) {
    	    output += "| ";
	    for (int j = 0; j < matrix[0].length; j++) {
		output += matrix[i][j] + " ";
	    }
    	    output += "|" + '\n';
    	}
    	return output;
    }


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) {
	Matrix _rightSide = (Matrix) rightSide; 
    	//value checker
    	boolean equalVal = false;
    	for (int i = 0; i < matrix.length; i++){
    	    for (int j = 0; j < matrix[0].length; j++){
    		if (matrix[i][j] == _rightSide.matrix[i][j]){
    		    equalVal = true;
    		} else {
    		    equalVal = false;
    		    break;
    		}
    	    }
    	}
	
    	if (matrix.length == _rightSide.matrix.length &&
    	    matrix[0].length == _rightSide.matrix[0].length &&
    	    equalVal == true){
    	    return true;
    	} else {
    	    return false;
    	}
    }
		
    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) {
	for (int i = 0; i < matrix.length; i++){
	    Object temp = matrix[i][c1];
	    matrix[i][c1] = matrix[i][c2];
	    matrix[i][c2] = temp;
	}	
    }


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {
    	Object[] temp;
    	temp = matrix[r1];
    	matrix[r1] = matrix[r2];
    	matrix[r2] = temp;
    }


    //main method for testing
    public static void main( String[] args ) {
	//default constructor test
	Matrix clive = new Matrix();
       	System.out.println(clive.size());
	System.out.println(clive.isEmpty());
	System.out.println(clive);
	System.out.println(clive.set(0,1,42));
	System.out.println(clive);
	System.out.println(clive.get(0,1));
	
	//constructor test
	Matrix cade = new Matrix(4);
       	System.out.println(cade.size());
       	System.out.println(cade);
	//populate
	for (int i = 0; i < cade.matrix.length; i++){
	    for (int j = 0; j < cade.matrix[0].length; j++){
		cade.set(i,j,j);
	    }
	}
       	System.out.println(cade);
	cade.swapColumns(0,1);
	System.out.println(cade);
	cade.set(2,1,88);
       	System.out.println(cade);
	cade.swapRows(2,3);
	System.out.println(cade);
	
	//equals
	System.out.println(cade.matrix.equals(clive.matrix));
}

}//end class Matrix
