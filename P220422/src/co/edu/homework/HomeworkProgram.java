package co.edu.homework;

public class HomeworkProgram {
	
	int studentNo;
	String studentName;
	int kor;
	int eng;
	int math;
	
	//디폴트 생성자 정보를 밖에서 가져오거나, 내가 생성하거나.
	//this는 인스턴스를 가리킨다.
	//클래스(=설계도)는 하나지만 이것을 기반으로 만들어지는 것이 인스턴스(=물건)
	
	//방법1
	//public Student() {} 
	//(공유폴더보고 필기 다시 하기)
	
	//생성자를 만드는 방법과 다른 점: getset을 쓰면 들어오는 데이터가 유효한지 아닌지까지 알 수 있음
	//방법2
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
		
		
	}


