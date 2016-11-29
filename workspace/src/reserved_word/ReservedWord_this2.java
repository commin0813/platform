package reserved_word;

public class ReservedWord_this2 {
	//그러면 this()는 무엇일까요? 
	//쉽게생각해서 자기자신의 생성자를 호출하는 녀석입니다.
	//this()를 호출하면 생성자가 호출되는데요. 메서드가 호출되는 순서도 같이 한번 보겠습니다.
	//이해가 잘안되면 오류에 빠지기 쉬운 부분이기때문에 주의깊게 봐주세요.
	String name;
	String address;
	int age;
	public static void main(String [] ar){
		new ReservedWord_this2();//첫번째로 인스턴스만 생성하여 ResevedWord_this2의 생성자를 호출해보겠습니다.
		System.out.println("-------------------fin-------------------------");
		/*마지막으로 콘솔창에 찍히며 프로그램이 끝납니다.*/
	}
	ReservedWord_this2(){//main 메서드에서 호출되어 처음으로 실행되는 생성자입니다.
		this("commin");//this()를 이용하여 String 하나를 매개변수로 가지는 생성자를 호출합니다.
		System.out.println("name : "+this.name+"\n"
				+"address:"+this.address+"\n"
				+"age:"+this.age);
		System.out.println("-------------------1-------------------------");//생성자를 호출했으니, 다음 프로그래밍 순서는
		//print()여서 -----1---- 이 콘솔창에 찍힐까요? 아닙니다. 메서드가 호출되면 호출된메서드가 끝나기전까진 돌아오지않습니다.
		
		/*네번째로 콘솔창에 찍힙니다.
		 * 전역변수 3개 모두 데이터가 있죠. */
	}
	ReservedWord_this2(String name){//다음으로 호출된 녀석입니다. commin이라는 String 데이터를 가지고 왔죠.
		this(name,"Seoul");//곧바로 this()를 이용해 다음 생성자를 호출합니다. 매개변수로받은 name을 바로 인자로 넣고. address를 추가하였습니다.
		this.name=name;/*인자 두개의 생성자의 내용이 끝나면 이쪽으로 다시 돌아오겠죠?*/
		System.out.println("name : "+this.name+"\n"
				+"address:"+this.address+"\n"
				+"age:"+this.age);
		System.out.println("-------------------2-------------------------");/*세번째로 콘솔창에 찍힙니다.
																	전역변수에 age와 address, name까지 모두 데이터가 있습니다.*/
	}
	ReservedWord_this2(String name,String address){//3번째로 호출된 생성자입니다.
		this(name,address,18);//곧바로 마지막 생성자를 호출합니다. 이번엔 age 를 추가하여 호출하였습니다.
		this.address=address;/*마지막으로 호출된 생성자가 끝나면 다시 이쪽으로 돌아와서 소스를 읽습니다.*/
		System.out.println("name : "+this.name+"\n"
				+"address:"+this.address+"\n"
				+"age:"+this.age);
		System.out.println("--------------------3------------------------");/*두번째로 콘솔창에 찍힙니다.
		 																	전역변수에 age와 address는 데이터가있죠.*/
	}
	ReservedWord_this2(String name,String address,int age){//마지막으로 호출된 생성자입니다.
		this.age=age;//이생성자에선 더이상 생성자를 호출하지않으므로 정상적인 순서로 프로그램이 실행됩니다. 
		System.out.println("name : "+this.name+"\n"
				+"address:"+this.address+"\n"
				+"age:"+this.age);
		System.out.println("--------------------4------------------------");/*첫번째로 콘솔창에 찍힙니다.
		 																	전역변수 3개중 현재는 방금 데이터를 넣은
		 																	age만 데이터가 존재합니다.*/
	}
	
	//this 와 헷깔리는 예약어로는 super가있는데 이건 상속 파트에서 다룰겁니다. 
	//하지만 무서워할것없습니다. this가 자기자신을 지칭하는 객체라고만 확실히 이해하면됩니다 ^^.
	
}
