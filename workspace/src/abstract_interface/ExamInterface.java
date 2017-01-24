package abstract_interface;

public class ExamInterface {
	/**
	 * 인터페이스는 추상클래스의 일종이지만 보다 더 극단적인경우입니다.
	 * 추상메서드로만 구성되며 abstract와다르게 메서드만 정의가 가능합니다.
	 * 공동 작업을 할때 메서드의 표준화를 시키기 위하여 많이 사용되며,
	 * 서로 다른 클래스를 연결할 때도 사용됩니다.
	 */
	public static void main(String[] ar) {
		Door door = new Door();
		door.open();
		door.close();
		door.Red();
		door.Blue();

		Bottle bottle = new Bottle();
		bottle.open();
		bottle.close();
	}
}

interface OpenCloseIf {
	public void open();

	public void close();
}
interface PaintIf {
	int s=1;
	public void Red();

	public void Blue();
}

/**
 * Interface 는 implements 로 상속받으며
 * extends 상속과는 다르게 다중 상속이 가능합니다.
 */
class Door implements OpenCloseIf , PaintIf {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Door Open");
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Door Close");
	}
	
	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("Paint the door red");
	}

	@Override
	public void Blue() {
		// TODO Auto-generated method stub
		System.out.println("Paint the door blue");
	}

	

}

class Bottle implements OpenCloseIf {
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Bottle Open");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Bottle Close");
	}
}
