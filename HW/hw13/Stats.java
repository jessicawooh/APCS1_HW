/*
  Jessica Wu
  APCS1 pd08
  HW13 -- May ah Hahv S’maur, Please?
  2017-10-07
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

    public static int max(int a, int b, int c) {
	return max(max(a,b),c);
    }

    public static double max(double a , double b, double c) {
	return max(max(a,b),c);
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

    public static int geoMean(int a, int b, int c) {
        double geoMean;
	geoMean = Math.pow(a*b*c, 1./3);
	return (int) geoMean; 
    }

    public static double geoMean(double a, double b, double c) {
        double geoMean;
	geoMean = Math.pow(a*b*c, 1./3);
	return geoMean; 
    } 
}
