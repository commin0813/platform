package method;

public class ExamMethod1 {

	public static void callByName(){
		System.out.println("'CallByName' was called");
	}
	public static void callByValue(String name){
		System.out.println("'"+name+"'"+" was called");
	}
	public static int addNumber(int a,int b){
		return a+b;
	}
	
	public static void main(String[] ar) {
		// 메서드란?
		/* 자주 반복되어 사용되는 내용을 묶어서 특정이름으로 정의한 묶음 */
		// 형식
		/* 메서드 명(매개변수) throws 예외 클래스{ 내용정의; } */
		
		//메서드의 종류
		
		//Call By Name - 메서드의 이름으로 호출하는 메서드. 특정 매개변수가없습니다.
		callByName();
		//Call By Value - 메서드를 호출 할때 특정 매개변수를 전달함으로써 그 값을 가지고 실행하는 메서드
		callByValue("callByValue");
		//Call By Reference - 메서드 호출 시 매개변수로 사용되는 값이 특정 위치를 참조하는 reference변수
		//매개 변수의 원래 주소값을 저장하는 방식으로써 Java에서는 클래스 객체를 인수로 전달하는 경우에만 Reference로 처리합니다.
		//CallByValue와 많이 혼동되고 어려운 개념으로써, 현 초급단계에서는  설명하지않겠습니다.
		//추후에 CallByValue 와 CallByReference의 차이점에대해 따로 포스팅 하겠습니다.
		
		//자신이 원할때 만들어 놓은 메서드는 언제든 다시 호출해서 쓸 수있습니다.
		callByName();
		callByValue("callByValue");
		
		//결과를 리턴하는 메서드
		//return 예약어를 쓰면 값을 리턴받아서 사용할 수있습니다.
		int result = addNumber(10,20);
		System.out.println("result : "+result);
	}
}
