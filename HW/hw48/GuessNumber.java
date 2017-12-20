//Jessica Wu
//APCS1 pd8 
//HW48 -- Keep Guessing
//2017-12-06

/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

import cs1.Keyboard;

public class GuessNumber 
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  _lo, _hi, _guessCtr, _target inst vars created
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) 
    {
	_lo = a;
	_hi = b;
	_guessCtr = 1;
	_target = (int) ((_hi - _lo) * Math.random());

	//debugging
	//System.out.println(_target);
	   
    }//end GuessNumber()


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:  inst vars assigned values 
      post: goes through the game
      ==================================================*/
    public void playRec() 
    {
	System.out.print("Guess a number from " + _lo + "-" + _hi + ": ");
	int guess = (int) Keyboard.readInt();
	
	//correct
	if (guess == _target) {
	    System.out.println("Correct! It took " + _guessCtr + " guesses.");
	    return;
	}
	//too high
	if (guess > _target){
	    System.out.println("Too high, try again...");
	    _hi = guess - 1;
	    _guessCtr += 1;
	    playRec();
	}
	//too low
	else {
	    System.out.println("Too low, try again...");
	    _lo = guess + 1;
	    _guessCtr += 1;
	    playRec();
	}
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() 
    {
	/* YOUR IMPLEMENTATION HERE */
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
	//use one or the other below:
	playRec();
	//playIter();
    }


    //main method to run it all
    public static void main( String[] args ) 
    {
	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
      	g.play();
	
	//recursive test
	//g.playRec();
       	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class
