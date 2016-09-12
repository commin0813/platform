package system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamIn2 {
	public static void main(String[] ar) throws IOException {
		// 이번엔 문자열을 입력해봅시다.
		// 문자열을 입력하는 방법은 여러가지가있는데 초반에는 그냥 하나 외워서 씁시다.

		// System.in.read(byte[]);
		byte[] arr = new byte[10];
		System.out.print("문자열 입력:");
		System.in.read(arr);// 키보드로부터 입력받은 값을 byte형태로 arr 에 저장
		String str = new String(arr);
		System.out.println("문자열 출력:" + str);

		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문자열 입력:");
		String bufferstr = in.readLine();
		System.out.println("문자열 출력:" + bufferstr);

		/* Exception */
		// 값을 외부로부터 입력받는 것이기때문에 무슨 오류가 생길지 몰라요. 그러므로 오류가 생겼을 시에 어떻게 처리 하라라는
		// 명령을 코딩해줘야합니다. 때문에 윗부분에 throws IOException 을 써준겁니다.
		// Exception의 종류는 여러가지가 정의되어있고 InputOutputException의 줄임말로써 입출력 관련 오류가 정의되어있습니다.
		// 위 방식은 메소드안에 모든 코딩에 IOException 에관련된 오류가나면 던져버려라(무시하라)라는 뜻으로쓰였습니다.
		// 그럼 특정 한 부분만 묶어서 관리할수는 없을까요?

		try {
			in.readLine();// try{내용}catch(오류정의){내용}으로 try{내용}에서 내용부분을 실행하다가
			// catch(오류정의)에서 정의한 오류가 발생하면 catch(){내용}부분에 내용을 실행하도록 하는 문구입니다.
			// 한마디로 오류잡는 문구입니다. 나중에 디버그할때 가장많이 쓰이는 문구이니 숙지하도록 합시다.
		} catch (IOException e) {
			System.err.println(e);// 에러가 나면 catch{내용}부분이 실행됩니다.
		}

	}
}
