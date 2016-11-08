package constructor;

public class CaculatorPro {

	// developed by commin//

	// Caculator Program //
	// ver 1.0.0 //
	// 2016.11.8 //

	// 전역 변수

	private double pre_number = 0; // double형 전역변수의 초기 값은 자동으로 0 이지만, 이렇게 0으로
									// 초기화 해주는것이 리소스 관리에 좋다. 다른 자료형도 마찬가지.
	private double after_number = 0;

	private boolean STATUS_DIV = false; // 나눗셈 기능의 사용 가능 여부 초기값: false

	private boolean STATUS_MUL = false; // 곱셈 기능의 사용 가능 여부 초기값: false

	private String[] operator;
	private double[] numbers;

	public CaculatorPro() {
		// Default 생성자로, 인자가 아무것도 없습니다.
		// 이 생성자로 생성 된 객체는 기초적인 덧셈과 뺄셈만 할 수 있습니다.
		System.out.println("Caculator Pro Start!\n (덧셈 과 뺄샘만 사용 가능합니다.)");
	}

	public CaculatorPro(boolean STATUS_DIV, boolean STATUS_MUL) {
		this.STATUS_MUL = STATUS_MUL;
		this.STATUS_DIV = STATUS_DIV;
		System.out.println("Caculator Pro Start!\n");
		System.out.println();

	}

	public CaculatorPro(boolean STATUS_DIV, boolean STATUS_MUL, String msg) {
		this.STATUS_MUL = STATUS_MUL;
		this.STATUS_DIV = STATUS_DIV;
		System.out.println(msg);
		System.out.println();
	}

	public double add(double x, double y) {
		return x + y;
	}

	public double sub(double x, double y) {
		return x - y;
	}

	public double div(double x, double y) {
		if(STATUS_DIV == false){
			System.out.println("Impossible.");
			System.out.println();
			return Double.MAX_VALUE;
		}
		try {
			return x / y;
		} catch (Exception e) {
			return Double.MIN_VALUE;
		}
	}

	public double mul(double x, double y) {
		if(STATUS_MUL == false){
			System.out.println("Impossible.");
			System.out.println();
			return Double.MAX_VALUE;
		}
		return x * y;
	}

}
