//Jessica Wu
//APCS1 pd8
//HW07 - On the Origins of a BigSib
//2017-09-26

public class BigSib {
    private String helloMsg;

    public BigSib(){
	helloMsg = "Hi";
    }
    public BigSib(String newMsg){
	helloMsg=newMsg;
    }
    public String greet(String person){
	String greeting;
	greeting = helloMsg + " " + person;
	return greeting;
    }
}
