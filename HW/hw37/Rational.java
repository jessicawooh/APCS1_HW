//Jessica Wu
//APCS1 pd8
//HW37 -- Be More Rational
//2017-11-20

public class Rational {

    //Instance variables for the numerator and denominator
    private int numerator;
    private int denominator;

    //Creates a new Rational with the value of 0/1
    public Rational() {
	numerator = 0;
	denominator = 1;
    }//end Rational()

    
    //takes 2 parameters, one for the numerator, one for the denominator
    //if an invalid denominator is attempted, should print a message and set the number to 0/1
    public Rational(int a, int b) {
	this();
	if (b == 0) {
	    System.out.println("Error: Divide be zero");}
	else {
	    numerator = a;
	    denominator = b;}
    }//end Rational()


    //returns a string representation of the rational number
    public String toString() {
	return numerator + "/" + denominator;
    }//end toString()


    //Returns a floating point value of the number
    //Uses the most precise floating point primitive
    public double floatValue() {
	return (double) numerator / denominator;
    }//end floatValue()


    //Takes 1 Rational object as a parameter and multiplies it by this Rational object
    //Does not return any value
    //Should modify this object and leave the parameter alone
    //Need not reduce the fraction
    public void multiply(Rational a) {
	numerator *= this.numerator;
	denominator *= this.denominator;
    }//end multiply()


    //Works the same as multiply, except the operation is division
    public void divide(Rational a) {
	numerator *= this.numerator;
	denominator *= this.denominator;
    }//end divide()

    //takes 1 Rational object (just like multiply) and adds it to the current rational number object
    //Need not reduce
    public void add(Rational a){
	numerator *= a.denominator;
	numerator += (a.numerator * denominator);
	denominator *= a.numerator;
    }//end add()

    //Works the same as add, except the operation is subtraction
    public void subtract(Rational a){
	numerator *= a.denominator;
	numerator -= (a.numerator * denominator);
	denominator *= a.denominator;
    }

    //Returns the gcd of the numerator and denominator of this Rational
    public static int gcd(int a, int b) {
	if (a % b == 0) { return b; }
	else if (b % a == 0) { return a;}
	while (!(b == 0 || a == 0)) {
	    if (a > b) { a -= b; }
	    else { b -= a; }
	}
	if (a == 0) { return b; }
	return a;
    }// end gcd(a,b)

    //Changes this Rational to one in reduced form (should use gcd)
    public void reduce(){
	numerator /= this.gcd(numerator,denominator);
	denominator /= this.gcd(numerator,denominator); 
    }//end reduce()


    //Takes a Rational parameter and compares it to the calling object
    //Returns 0 if the two numbers are equal
    //Returns a positive integer if the calling number is larger than the parameter
    //Returns a negative integer if the calling number is smaller than the parameter
    public int compareTo(Rational a){
	return (this.numerator * a.denominator) - (this.denominator * a.numerator);
    }//end compareTo()
    //test
    public static void main(String[] args) {
	// Rational r = new Rational(2,3); //Stores the rational number 2/3
	// System.out.println(r);//2/3
	// System.out.println(r.floatValue());//0.6666666667

	// System.out.println("---------------------------");
	
	// Rational s = new Rational(1,2); //Stores the rational number 1/2
	// System.out.println(s);//1/2

	// System.out.println("---------------------------");

	// Rational p = new Rational();
	// System.out.println(p);//0/1

	// System.out.println("---------------------------");

	// Rational q = new Rational(1, 0);//error
	// System.out.println(q);//0/1

	// System.out.println("---------------------------");

	// r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2
	// System.out.println(s);//1/2
	// System.out.println(r);//2/6

	// System.out.println("---------------------------");

	// r.divide(s); //Divides r by s, changes r to 4/6.  s remains 1/2
	// System.out.println(s);//1/2
	// System.out.println(r);//4/6

	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	System.out.println(t); //4/18
	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
	t.reduce(); //Changes t to 2/9

	System.out.println("---------------------------");

	Rational j = new Rational(10,20);//Stores the rational number 10/20
	Rational k = new Rational(2,5);
	j.subtract(k); //Adds k to j, changes j to 2/20.  k remains 2/5
	System.out.println(j); //2/20

       	System.out.println("---------------------------");

	

    }//end main()

}//end class Rational
