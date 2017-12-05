/*
   Team 5 / Team Brownies 
   Jessica Wu
   APCS1 pd08
   HW12 -- stAtistically sPeaking 
   2017-10-05
*/

public class Stats {
    public static int mean(int a, int b) {
	int sum = a + b;
	int mean = sum / 2;
	return mean;
    }
    
    public static double mean(double a, double b) {
	double sum = a + b;
	double mean = sum / 2;
	return mean;
    }

    public static int max(int a, int b) {
	int diff1 = a - b;
	int diff2 = b - a;
	
	if (diff1 > diff2) {
	    return a;
	} else if (diff2 > diff1) {
	    return b;
	} 
	    return a;
    }

    public static double max(double a, double b) {
	double diff1 = a - b;
	double diff2 = b - a;
	
	if (diff1 > diff2) {
	    return a;
	} else if (diff2 > diff1) {
	    return b;
	} 
	    return a;
    }

    public static int geoMean(int a, int b) {
	int product = a * b;
	double result = Math.sqrt(product);
	return (int) result;
    }
	    
    public static double geoMean(double a, double b) {
	double product = a * b;
	double result = Math.sqrt(product);
	return result;
    }
    
    public static void main(String[] args) {
	// Should return 5
	System.out.println(mean(4,6));
	
	// Should return 14.5
	System.out.println(mean(7.0,22.0));
	
	// Should return 3
	System.out.println(max(1,3));
	
	// Should return 3.2
	System.out.println(max(3.1,3.2));
	
	// Should return 5
	System.out.println(max(5,5));
	
	// Should return 10.0
	System.out.println(max(10.0,10.0));
	
	// Should return 6
	System.out.println(geoMean(18,2));
	
	// Should return root 10
	System.out.println(geoMean(2.0, 5.0));
    }

}
