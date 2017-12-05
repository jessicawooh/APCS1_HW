/*
Jessica Wu
APCS1 pd8
HW17 -- Do I repeat myself?
2017-10-16
*/

public class Repeater {
    public static String fenceW(int numPosts){
	String posts = "|";
	while (numPosts > 1){
	    posts += "--|";
	    numPosts -= 1;
	}
	return posts;
    }
    
    public static String fenceR(int numPosts){
    	if (numPosts == 1) { // base case 
	    return "|"; 
	} else{
	    return  "|--" + fenceR(numPosts-1); 
	}
    }

    public static void main(String[] args){
	System.out.println(fenceW(1)); 
	System.out.println(fenceW(3));
	
	System.out.println(fenceR(1)); // test base case 
	System.out.println(fenceR(3));


    }

}
