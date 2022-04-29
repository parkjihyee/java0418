package Homework1;

public class ArcadeGame implements Keypad1{
	
	int mode;
	
	public ArcadeGame() {
		this.mode = NORMAL_MODE;
		System.out.println("ArcadeGame ����");
	}

	@Override
	public void leftUpButton() {
		System.out.println("ĳ���Ͱ� �������� �̵��Ѵ�.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("ĳ���Ͱ� �������� �̵��Ѵ�.");
	}

	@Override
	public void rightUpButton() {
		if(mode==0) {
			System.out.println("ĳ���Ͱ� �Ϲ� ����.");
		}else if(mode==1) {
			System.out.println("ĳ���Ͱ� ���� ����.");
		}
	}

	@Override
	public void rightDownButton() {
		if(mode==0) {
			System.out.println("ĳ���Ͱ� HIT ����.");
		}else if(mode==1) {
			System.out.println("ĳ���Ͱ� Double HIT ����.");
		}
	}

	@Override
	public void changeMode() {
		if(mode==0) {
			System.out.println("������ :  HARD_MODE");
				mode = 1;
				System.out.println(mode);
		}else if (mode !=0) {
			System.out.println("������ :  NORMAL_MODE");
				mode = 0;
				System.out.println(mode);
		}
	}

}
