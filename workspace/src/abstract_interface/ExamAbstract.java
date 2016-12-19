package abstract_interface;

public class ExamAbstract {
	/**
	 * 추상클래스 & 추상메서드 abstract 사용하기 추상클래스는
	 * 말그대로 약간 추상적인 의미를 가진 클래스여야 하며 
	 * 비추상적인 클래스에서 이를 상속받아 사용합니다.
	 */
	public static void main(String [] ar){
		Tiger tiger = new Tiger("Hodol");
		tiger.cry();
		tiger.behavior();
		System.out.println("사자의 이름은 :" + tiger.animal_name);
		
		Dog dog = new Dog("Mikey");
		dog.cry();
		dog.behavior();
		System.out.println("개의 이름은 :" + dog.animal_name);
	}
	
}

abstract class Animal {
	String animal_name;
	
	Animal(String name) {
		animal_name = name;
	}
	public abstract void cry();

	public abstract void behavior();

}

class Tiger extends Animal {
	
	public Tiger(String name) {
		super(name);
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("어흥");
	}

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		System.out.println("우측으로 빠르게 움직인다.");
	}

}

class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		System.out.println("왼쪽으로 느리게 달린다");
	}

}
