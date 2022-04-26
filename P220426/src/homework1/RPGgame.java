package homework1;

public class RPGgame implements Keypad {
	
	int mode; 	
	public RPGgame() {
		System.out.println("RPGgame 실행");
	}
		
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		if(0 == 0) {
		System.out.println("캐릭터가 한칸단위로 점프한다.");
	}else if

	@Override
	public void rightDownButton() {

	}

	@Override
	public void changeMode() {

	}

}
