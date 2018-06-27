package guessGame;

public class Player {

	public int number;

	public void guess() {
		// TODO Auto-generated method stub
		for(int i = 0; i<100; i++) {
			number = (int) (Math.random() * 100);
		}
	}
}
