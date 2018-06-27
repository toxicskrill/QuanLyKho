package guessGame;

public class GuessGame {
	static Player p1;
	static Player p2;
	static Player p3;
	
	 public static void main(String[] args) {
    	 StartGame();
     }
	
	public static void StartGame() {
		System.out.println("hello world");
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 100);
		System.out.println("I'm thinking of a number between 0 and 100");
		
        int i;
		for(i = 0; i < 100; i++) {
           System.out.println("Number to guess is " + targetNumber);

          
		p1.guess();
		p2.guess();
		p3.guess();

           guessp1 = p1.number;
           System.out.println("Player 1 guessed " + guessp1);

           guessp2 = p2.number;
           System.out.println("Player 2 guessed " + guessp2);

           guessp3 = p3.number;
           System.out.println("Player 3 guessed " + guessp3);

           if (guessp1 == targetNumber) {
           	p1isRight = true;
           }
           if (guessp2 == targetNumber) {
           	p2isRight = true;
           }
           if (guessp3 == targetNumber) {
           	p3isRight = true;
           }

           if (p1isRight || p2isRight || p3isRight) {
           	System.out.println("We have a winner");
           	System.out.println("Player 1 got is right " + p1isRight);
           	System.out.println("Player 2 got is right " + p2isRight);
           	System.out.println("Player 3 got is right " + p3isRight);
           	System.out.println("You guessed " + i);
           	System.out.println("Game is over");
           	break;
           }else {
           	System.out.println("Try again");
           }
	    }
	}
}
