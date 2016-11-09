package constructor;

public class ExamConstructor2 {
	private int x,y;
	
	public ExamConstructor2(int x , int y){
		this.x = x;
		this.y = y;
	}
	private void printXY(){
		System.out.println("X 좌표 : "+ x + "\nY 좌표 : "+y);
	}
	
	public static void main(String [] ar){
		
		ExamConstructor2 constructor = new ExamConstructor2(10,20);
		
		constructor.printXY();
		
	}
}
