package reserved_word;

public class ReservedWord_static {
	//이번에 볼 내용은 공유를 위해 사용하는 static 이라는 예약어입니다.
	//static 필드 : 데이터 값을 공유하기 위해서 선언하는 공간을 말합니다.
	//멤버필드로만 가능하며 이렇게 선언된 멤버는 클래스의 이름으로도 접근이 가능합니다.
	//이것이 가능한것은 객체를 만들지않아도 자바가 미리 메모리를 할당해 놓기 때문입니다.
	
	//static은 클래스 설계단계에서 멤버변수 중 다른 모든 인스턴스에서 공통적으로 사용 하는 것과
	//static 메서드로 작성된 내부내용에 static이아닌 기본 인스턴스 변수가 사용되지않을때 
	//static을 붙입니다. 
	
	//아무때나 막 붙이면, 메모리의 낭비이며, 여러곳에서 접근하여 값이 변하기때문에 
	//정상적이 프로그램운용이 되지않을 수 있으니, 조심해서 사용해야합니다.
	 class Car{
		String name;
		int price;
		public static final int wheel=4;
		public static final int door=4;
	}
	 
	static class House{
		public static int width=400;
		public static int height=500;
		public static void sell(String str){
			System.out.println(str);
		}
	}
	public ReservedWord_static(){
		//생성자를 호출하는 이유는 inner class로 작성된 Car라는 클래스에
		//static 메서드인 main()가 접근 할 수 없기때문입니다.
		//이유는 main 메서드는 static 메서드이기때문에 객체가 선언되지 않아도 자바가
		//프로그램이 시작하면 미리 메모리에 할당해 놓아 바로 시작이 가능하지만,
		//Car라는 클래스는 객체화되기 전에는 메모리에 존재하지않기때문에 참조 할 수가 없기때문입니다.
		//사용하고싶으면 Car 클래스를 static 으로 선언하면됩니다.
		Car car = new Car();
		
		car.name="K5";
		car.price=50000000;
		
		System.out.println("door number : "+Car.door
				+"\n"+"wheel number : "+Car.wheel
				+"\n"+"wheel number : "+car.name
				+"\n"+"wheel number : "+car.price
				);
		System.out.println();
		
		car.name="K7";
		car.price=70000000;
		System.out.println("door number : "+Car.door
				+"\n"+"wheel number : "+Car.wheel
				+"\n"+"wheel number : "+car.name
				+"\n"+"wheel number : "+car.price
				);
		System.out.println();
		//Car 클래스안에 name과 price는 car객체를 이용하여 마음대로 바꿀 수 있지만,
		//final static 으로 선언된 wheel과 door는 만약 바꿀려고하면 오류가나게됩니다.
		//final 값은 불변의 값으로 어디서나 공통적으로 같은값을 쓸때 사용합니다.
		//그럼 왜 final 로 선언하였을까요? final을 지워보시게되면 
		//오류가 납니다. 이유는 wheel과 door는 static으로 선언되어 메모리에 할당되어있지만
		//Car라는 클래스는 레퍼런스 로 선언되어 메모리에 할당되지않았을 수있는 상태입니다.
		//때문에 레퍼런스 클래스 안에 static은 반드시 final로 선언해야하며 static메서드는 사용할수없습니다.
		//물건을 담는 상자는없는데 물건이 어지러져있으면 매우 불안정한상태이기때문에 final로 고정시켜놓는것이라 이해하시면됩니다.
		
		//그러면 House라는 static으로 성언된 클래스를 만들고 안에 static 멤버필드를 넣어봅시다.
		System.out.println("House width:"+House.width+
				"\n"+"House height:"+House.height);
		House.sell("이미팔렸습니다.");
		

		House.height=300;
		House.width=200;
		System.out.println();
		System.out.println("House width:"+House.width+
				"\n"+"House height:"+House.height);
		House.sell("아직 안 팔렸습니다.");
		
		//객체를 생성하지않았어도 House라는 클레스는 이미 메모리에 할당되어있는상태입니다.
		//Car 클래스와는 다르게 House 클래스 자체도 static으로 선언되어잇으므로, 
		//상자안에 있는 멤버들은 자유롭게 변화되어도 자바가 처리 할 수 있으니 static으로 선언이 가능합니다.
		
	}
	public static void main(String [] ar){//static 메서드의 대표적인 것은 main메서드입니다.
		
		System.out.println("door number : "+Car.door
				+"\n"+"wheel number : "+Car.wheel);
		//Car라는 클래스는 아직 메모리에 존재하지않지만 그안에 static으로 선언된 멤버필드인
		//wheel과 door변수는 프로그램이 시작되면서 메모리에 할당되게됩니다.
		//때문에 클래스이름만으로 접근하여 사용이 가능합니다.
		System.out.println();
		new ReservedWord_static();
		
		

	}
}
