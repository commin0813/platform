package constructor;

public class ExamConstructor {
	private int x,y;
	
	public void setXY(int x , int y){
		this.x = x;
		this.y = y;
	}
	
	public void printXY(){
		System.out.println("X 좌표 : "+ x + "\nY 좌표 : "+y);
	}
	
	public static void main(String [] ar){
		
		ExamConstructor constructor = new ExamConstructor();
		
		constructor.setXY(10, 20);
		
		constructor.printXY();
		
	}
}
