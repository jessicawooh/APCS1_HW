public class Greet {
    public static void main(String[] args){
	String greeting;
	
	BigSib richard = new BigSib();
	BigSib inst2 = new BigSib();
	BigSib inst3 = new BigSib(); 
	BigSib inst4 = new BigSib();
 
	richard.setHelloMsg("Word up");
	inst2.setHelloMsg("Salutations");
	inst3.setHelloMsg("Hey ya");
	inst4.setHelloMsg("Sup");

	greeting = richard.greet("freshman");
	System.out.println(greeting);

	greeting = inst2.greet("Dr. Spaceman");
	System.out.println(greeting);

	greeting = inst3.greet("Kong Fooey");
	System.out.println(greeting);

	greeting = inst4.greet("mom");
	System.out.println(greeting);

	System.out.println(BigSib.greet("Nash"));


    }
}
