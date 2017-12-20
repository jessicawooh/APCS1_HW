import java.util.ArrayList;

public class Test {
    public static void main(String[] args){

	int index1 = 0;
	int index2 = 1;

	ArrayList testarray = new ArrayList<Integer>();
	testarray.add(7);
	testarray.add(1);
	testarray.add(5);
	testarray.add(12);
	testarray.add(3);
	System.out.println("testarray: " + testarray );

	System.out.println(testarray.get(index1));
	System.out.println(testarray.size());

	for (int i: testarray){
	    System.out.println(i);
	}
    }
}
