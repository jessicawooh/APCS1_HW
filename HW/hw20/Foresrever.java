/*
Jessica Wu
APCS1 pd8
HW20 -- For the Lulz Love of Strings .
2017-10-20
*/

public class Foresrever {
    public static String fenceF(int posts){
        String output = "";
	for(int i = 0; i < posts; i++){
	    output += "|--";
	    posts -= 1;
	}
	return output;
    }
	    
    public static String reverseF(String s){
        String output = "";
	for(int i = s.length() - 1; i >= 0; i--){
	    output += s.charAt(i);
	}
	return output;
    }

    public static String reverseR(String s){
	int position = s.length()-1;
	if (s.length() == 0) {
	    return "";
	}
	return s.charAt(position) + reverseR(s);
    }


    public static void main(String[] args){
	System.out.println(fenceF(1)); 
	System.out.println(fenceF(3));
	
	System.out.println(reverseF("apple")); // test base case 
	System.out.println(reverseF("dog"));

	// System.out.println(reverseR("apple")); // test base case 
	// System.out.println(reverseR("dog"));
    }

}
