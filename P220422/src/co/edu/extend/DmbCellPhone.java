package co.edu.extend;

//자식 클래스
public class DmbCellPhone extends CellPhone{
		//필드
		public int channel;
		
		//생성자
		public DmbCellPhone(String model, String color, int channel) {
			super(model, color);	
			this.channel = channel;
		}
		//메소드
		void turnOnDmb() {
			System.out.println("채널 : " + channel + "Dmb 시작");
		}
		void turnOffDmb() {
			System.out.println("Dmb 종료");
		}
		@Override
		void powerOn() {
			System.out.println("자식 클래스에서 전원을 켭니다.");
		}
}	
	
