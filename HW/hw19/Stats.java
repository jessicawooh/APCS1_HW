/*
  Kevin Lin, Maryann Foley, Jessica Wu
  APCS1 pd8
  HW19 -- gcd 3 ways
  2017-10-18
*/
 
public class Stats {
 
    public static int mean(int a, int b) {
	int c = a + b;
	c /= 2;
	return c;
    }
 
    public static double mean(double a, double b) {
	double c = a + b;
	c /= 2;
	return c;
    }
 
    public static int max(int a, int b) {
	if (a >= b) {
	    return a;
	}
	return b;
    }
 
    public static int max(int a, int b, int c) {
	return max(max(a,b),c);
    }
 
    public static double max(double a, double b) {
	if (a >= b) {
	    return a;
	}
	return b;
    }
 
    public static double max(double a, double b, double c) {
	return max(max(a,b),c);
    }
 
    public static int geoMean(int a, int b) {
	return (int) Math.sqrt(a * b);
    }
 
    public static int geoMean(int a, int b, int c) {
	return (int) Math.pow(a * b * c, (1.0/3));
    }
 
    public static double geoMean(double a, double b) {
	return Math.sqrt(a * b);
    }
 
    public static double geoMean(double a, double b, double c) {
	return Math.pow(a * b * c, (1.0/3));
    }
 
    public static int gcd(int a, int b) { //uses brute-force approach, beginning at 1 and working up to lesser input
	int min = a;
	if (a > b) { min = b; }
	int ctr = 1;
	int currentGCD = 1;
	while (ctr <= min) {
	    if (a % ctr == 0 && b % ctr == 0) { currentGCD = ctr; }
	    ctr += 1;
	}
	return currentGCD;
    }
/*
Euclid's algorithm takes in two positive integers and returns the greatest common divisor. If integer a < integer b, switch their values. Divide a by b, and if modulo is equal 0, return b. Replace the a value with the b value, and the b value by the modulo. Repeat until modulo is equal to zero. 
*/ 
    public static int gcdER(int a, int b) { //employs Euclid’s algorithm recursively
        if (a % b == 0) { return b; }
	else if (b % a == 0) { return a; }
	return gcdERHelper(a,b);
    }
 
    private static int gcdERHelper(int a, int b) { //helper function for gcdER
	if (b > a) {
	    b -= a;
	    if (b == 0) { return a; }
	    else { return gcdERHelper(a,b); }
	}
	else {
	    a -= b;
	    if (a == 0) { return b; }
	    else { return gcdERHelper(a,b); }
	}}
 
    public static int gcdEW(int a, int b) { //employs Euclid’s algorithm iteratively with a while loop
	if (a % b == 0) { return b; }
	else if (b % a == 0) { return a;}
	while (!(b == 0 || a == 0)) {
	    if (a > b) { a -= b; }
	    else { b -= a; }
	}
	if (a == 0) { return b; }
	return a;
    }
}
