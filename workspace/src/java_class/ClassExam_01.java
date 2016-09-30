package java_class;

public class ClassExam_01 {
	
	// 클래스의 기본 구성
	// 클래스의 형식
	/*
	 * 접근제한자 지정예약어 class 클래스 extends 상속할클래스 implements 상위인터페이스
	 */
	//이미 여러분들은 클래스를 만들어왔습니다. 자바 자체가 객체지향언어이고 객체가 클래스이니
	//지금까지 만들었던것들과 별다른것은 없습니다만, 아직 extends가 뭔지, implements가 뭔지
	//이해가 되지 않으실겁니다. 아직 배우지않았으니까요. 
	//추후에 상속이나 인터페이스를 포스팅할때 더 자세히 설명하도록 하겠습니다. 일단은 class의 full형식은 
	//저렇게 생겼구나 라고 이해하시면되겠습니다.
	//클래스란 C언어 구조체에서 비롯된 개념입니다. 하나의기능 덩어리라고 생각하시면됩니다.
	
	//클래스의 멤버
	/*
	 * 중첩클래스
	 * 데이터 저장공간(Member Field:class안에 들어있는 member)
	 * 객체를 생성하고 초기화하는 Method(Construct:생성자)
	 * 특정 행위의 기술(Method)
	 */
	//중첩클래스는 추후에 포스팅하도록하고 Member Field가 무엇인지 먼저 보겠습니다.
	//class는 여러 Member Field를가질수있는데요. 
	//멤버 필드에는 class,method,생성자,변수 가들어갑니다. 

	//ClassExam_01 클래스 안에 들어가는 member feild.
	
	public class ExClassA{}//class
	
	ClassExam_01(){ }//생성자
	
	int x;//변수(전역변수)
	
	void ex(){}//method
	
	public static void main(String[] ar) {//main method

	}
}
