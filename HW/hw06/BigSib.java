//Jessica Wu
//APCS1 pd8
//HW06 - On BigSib Individuality and the Elimination of Radio Fuzz
//2017-09-25

public class BigSib {
    private String helloMsg;

    public setHelloMsg(){
	helloMsg="Hi"
    }
    public setHelloMsg(String newMsg){
	helloMsg=newMsg;
    }
	public String greet(String person){
	    String greeting;
	    greeting = helloMsg + " " + person;
	    return greeting;
    }
}
