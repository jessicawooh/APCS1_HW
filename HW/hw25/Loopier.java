/*
  Jessica Wu
  APCS1 pd8
  HW25 -- All Hallow's Eve 
  2017-10-31
*/

public class Loopier{

    //static method to populate existing array w/ random ints
    //element with an int in the set [lower, upper)

    public static void populatArray(int[] array,int lower,int upper) {
	for (int i = 0; i < array.length; i++) {
	    array[i] = (int) ((Math.random() * (upper-lower)) + lower);
	}
    }
   
    //static method to return a String version of array of ints
    public static String arrayToString(int[] array) {
	String output = "";
	for(int i = 0; i < arr.length - 1; i++) {
	    output += array[i] + ",";
	}
	return str + arr[arr.length-1];

    }
}//end class
