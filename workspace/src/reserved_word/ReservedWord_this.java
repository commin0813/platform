package reserved_word;

public class ReservedWord_this {
	//this 는 '자기자신의 객체를 참조하는 예약어' 입니다.
	//즉 , 클래스 내부에서 자신의 클래스를 지칭하는 객체라는 뜻입니다.
	String name="commin's blog";
	String address="Seoul";
	ReservedWord_this(String name){
		
		System.out.println(name);//결과: commin
		
		//ReservedWord_this 의 생성자의 파라미터도 String의 name이라는 변수이고
		//전영변수로 선언된 name도 같은 이름의 변수입니다.
		
		//같은 클래스 안에서 전역변수는 클래스 전체에 영향을 미칩니다. 
		
		System.out.println(address);//결과값 : Seoul
		
		//그러나 메서드안에서 같은 이름의 변수가 생성될 수 있는데요.
		//이때 자바는 메서드안에 변수 즉, 지역변수로 선언된 변수를 사용하게됩니다.
		//address 라는 변수는 현재 메서드 내부에서 같은 이름으로 선언된 변수가없으므로 지역변수를 가져다 쓴것이 보이시죠?
		
		//그러면 같은이름으로 선언되었지만, 지역변수를 써야 할 때 어떻게할까요?
		//그럴때 바로 this 를 씁니다.
		
		System.out.println(this.name);//결과:commin's blog
		
		//this 는 자기자신을 지칭하는 객체이므로 현재 클래스에 접근하여 멤버필드에 있는 name을 가져오는거죠.
		//전에 말했듯이 메서드안에서 선언된 변수는 메서드가 끝나는 시점에 같이 없어지지만, 
		//지역변수로 선언된 변수는 클래스가 끝나지 않는 이상 계속해서 존재하게됩니다. 
		//그러니 객체로 접근한 클래스에서는 메서드안에 변수를 사용 할 수 없죠. 그래서 지역변수로 선언된 변수만을
		//가져옵니다.

		this.name=name;
		//이런식으로 생성자에서 받은 데이터를 클래스의 지역변수로 옮겨닮는 코딩을 많이 하게됩니다.
		System.out.println(this.name);//결과:commin;
	}
	public static void main(String [] ar){
		
		new ReservedWord_this("commin");
		
	}
}
