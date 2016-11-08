package constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaculatorMain {
	// developed by commin//

	// Caculator Program //
	// ver 1.0.0 //
	// 2016.11.8 //

	CaculatorPro caculatorPro_1 = null;

	CaculatorPro caculatorPro_2_div = null;

	CaculatorPro caculatorPro_3_mul = null;
	
	BufferedReader in =null;

	CaculatorMain() {
		//init
		caculatorPro_1 = new CaculatorPro();//덧셈과 뺄셈만 가능한 객체
		
		caculatorPro_2_div = new CaculatorPro(true, false);//곱하기가 안되는 객체
		
		caculatorPro_3_mul = new CaculatorPro(false, true, "Caculator Program");//나누기가 안되는 객체
		
		in = new BufferedReader(new InputStreamReader(System.in));
		start();//시작 메서드
	}
	
	public void start(){
		while(true){
			try{
			System.out.println("1:덧셈 2:뺄셈 3:나눗셈 4:곱셈");
			int imsi = in.read();
			
			}catch(IOException e){
				System.out.println("IOException ! continued program");
				continue;
			}
			
		}
		
	}

	public static void main(String[] ar) {
		new CaculatorMain();// 객체가 딱히 필요없을때는 인스턴스만 만들어줍니다.
	}
}
