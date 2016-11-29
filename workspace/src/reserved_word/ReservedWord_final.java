package reserved_word;

public class ReservedWord_final {
	// final 은 상수필드와 변수를 위해 사용합니다.
	// final 필드 : 상수값을 저장하기 위한 공간이며 값이 변경될수없습니다.



	final int age = 56;
	int tall = 183;

	ReservedWord_final() {
		tall = 190; // 변경가능
		// age = 67;//변경불가능
	}
	
	
	
	// final 메서드 : 상속을 하였을때 오버라이딩이 안되게 만들필요가있을때 사용합니다.
	
	final void TestMethod_final() {
		System.out.println("TestMethod_final !! ");
	}

	void TestMethod_normal() {
		System.out.println("TestMethod_normal !! ");
	}
	class A extends ReservedWord_final{
		@Override
		void TestMethod_normal() {
			// TODO Auto-generated method stub
			super.TestMethod_normal();
		}
		
		//final로 선언된 메서드를 오버라이드 하면 오류가납니다.
//		@Override
//		void TestMethod_final() {
//			// TODO Auto-generated method stub
//			super.TestMethod_normal();
//		}
	}
	
	
	
	// final 클래스 : class자체를 상속하지 못하도록 할 때 사용합니다.
	
	final class TestClass_final {
		TestClass_final() {
			System.out.println("TestClass_final !! ");
		}
	}

	class TestClass_normal {
		TestClass_normal() {
			System.out.println("TestClass_normal !! ");
		}
	}

	// final 로 선언된 클래스를 선언 할 때 오류가 납니다.
	
	
	// class B extends TestClass_final{
	//
	// }
	class B extends TestClass_normal {

	}
	
	
	

	public static void main(String[] ar) {
		new ReservedWord_final();
	}

}
