/*
  Jessica Wu
  APCS1 pd8
  HW21 -- Karmacomma,
  2017-10-24 
*/

public class Commafier {
    public static  String commafyR(int num){
	String stringnum;
	stringnum = Integer.parseInt(num);
	if(stringnum.length() < 4){
	    return stringnum;
	}
	return commafyR(stringnum.substring(0, stringnum.length() - 3)) + "," + stringnum.substring(stringnum.length() - 3, stringnum.length());
    }
    public static String commafyF(int num){
	String number;
	number = Integer.parseInt(num);
	if(number.length() < 4){
	    return number;
	}
	for (int i = 0; i < (number.length() - 1) / 3; i++){
	    int commaPosition = number.length() - 3 - (3*i);
	    number = number.substring(0, commaPosition) + "," + number.substring(commaPosition);
	}
	return number;
    }
    public static void main(String[] args){
	for(String s: args){
	    System.out.print(commafyR(Integer.parseInt(s)));
	    System.out.print(commafyF(Integer.parseInt(s)));
	}

	System.out.print(commafyR(1)); // 1
	System.out.print(commafyR(10)); //  10
	System.out.print(commafyR(101)); // 101
	System.out.print(commafyR(1000));//  1,000
	System.out.print(commafyR(12345));//  12,345

	System.out.print(commafyF(1)); // 1
	System.out.print(commafyF(10)); //  10
	System.out.print(commafyF(101)); // 101
	System.out.print(commafyF(1000));//  1,000
	System.out.print(commafyF(12345));//  12,345
    }
}

//having trouble converting the int input into a string
