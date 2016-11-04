package java_class;

public class K5 {
	int carNumber = 12345;
	String getTire(){
		return "k5_tire";
	}
	String getBody(){
		return "k5_body";
	}
	String createCar(){
		return getBody()+getTire();
	}
	public static void main(String [] ar){
		K5 car = new K5();
		
		System.out.println(car.getTire());
		
		System.out.println(car.getBody());
		
		System.out.println();
		
		System.out.println(car.createCar()+"\nNumber:"+car.carNumber);
	}
}
