/*
  Jessica Wu
  APCS1 pd8
  HW16 -- Get It While You Can
  2017-10-16
*/

public class Coin {
    private  double value;
    private String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr;
    private int tailsCtr;
    private double bias;

    public Coin(){
	name = "null";
	upFace = "heads";
    }

    public Coin(String denom){ //the string input = the denomination
	this();
	name = denom; 
    }
    
    public Coin(String denom, String face){ //the string input = the denomination + the face
	this(denom);
	upFace = face; 
    }
    
    public String flip(){ // coin flip via bias --> results returns as a string
	bias = Math.random();
	if (bias <= 0.5){
	    upFace = "heads";
	    headsCtr += 1;
	} else {
	    upFace = "tails";
	    tailsCtr += 1;
	}
	flipCtr +=1;
	return upFace;
    }
    
    public String toString(){ // returns denomination and current face
	String retStr = name;
	retStr += "--";
	retStr += upFace;
	return retStr;
    }

    public boolean equals(Coin wayne){ // compare coin to another --> true if same face, false otherwise
	if (upFace == wayne.upFace){
	    return true;
	} else{
	    return false;
	}
    }

    public void assignValue(int newValue){ //assign coin value
	if (name == "penny")
	    value = 0.01;
	if (name == "nickel")
	    value = 0.05;
	if (name == "dime")
	    value = 0.1;
	if (name == "quarter")
	    value = 0.25;
	if (name == "dollar")
	    value = 1.0;
    }


    public void reset( String s, double d )
    { 
	flipCtr = 0;
	tailsCtr = 0;
	headsCtr = 0;
	upFace = s;
	bias = d;
    }

    
} // end of Coin class
