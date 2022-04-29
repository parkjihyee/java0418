package co.Homework1;

public class RPGgameExample {

	public static void main(String[] args) {
		RPGgame1 rp = new RPGgame1();
		
		rp.leftUpButton();
		rp.rightUpButton();
		rp.changeMode();
		rp.rightUpButton();
		rp.rightDownButton();
		rp.leftDownButton();
		rp.changeMode();
		rp.rightDownButton();
		
		System.out.println("======================");	
		
		ArcadeGame ar = new ArcadeGame();
		
		ar.leftUpButton();
		ar.rightUpButton();
		ar.leftDownButton();
		ar.changeMode();
		ar.rightUpButton();
		ar.leftUpButton();
		ar.rightDownButton();		
	}

}
