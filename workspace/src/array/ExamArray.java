package array;

public class ExamArray {
	public static void main(String[] ar) {
		// 배열이란 동일한 자료형으로 선언된 데이터 공간을
		// 메모리 상에 연속적으로 나열하여 데이터 관리의 효율성을 높이는 것입니다.

		// 배열의 종류에는 단일차원 배열과 다 차원 배열이 있습니다.

		/* 단일차원배열 */
		// 단일차원배열이란 한마디로 1차원적인 데이터의 나열입니다.
		// 단일차원배열은 두가지방법으로 선언 가능합니다.
		// 1.자료형[] 배열명;
		int[] arr_1;
		// 2.자료형 배열명[];
		@SuppressWarnings("unused")
		int arr_2[];
		// 단일 차원 배열은 두가지 방법으로 초기화가능합니다.
		// 1.배열명 = new 자료형[갯수];
		arr_1 = new int[10];
		// 2.배열명 = new 자료형[]{초기값,초기값...};
		arr_2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 당연히 선언과 초기화를 동시에 할 수 있습니다.
		// 자료형[] 배열명 = {초기값,초기값...};
		@SuppressWarnings("unused")
		int[] arr_4 = new int[10];
		@SuppressWarnings("unused")
		int[] arr_3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// arr_1은 int자료형이 들어갈 수 있는 공간(객체) 10개를 가지고있는 배열 객체입니다.
		// 10개의 공간 모두 빈 공간으로 default 값으로 초기화되어있습니다.(int자료형의default값은 0입니다.)
		// arr_1[0]과 arr_1[1]에 값을 넣어보죠.
		arr_1[0] = 10;
		arr_1[1] = 11;
		System.out.println("arr_1[0] : " + arr_1[0]);
		System.out.println("arr_1[1] : " + arr_1[1]);
		System.out.println("arr_1[2] : " + arr_1[2]);
		// arr_1[0]이란 arr_1의 배열 0번째 객체라는 뜻입니다.
		// arr_1이란 배열객체는 heap영역에 어떠한 공간 하나를 참조하고있습니다.
		// 그리고 arr_1의 크기 만큼 연속된 숫자로 방을 만들죠. int형은 4byte 자료형이니
		// 만약 arr_1이 100번 주소를 참조하고있고 크기가 5라면
		// arr_1[0]->100 arr_1[1]->104,arr_1[2]->108...arr_1[4]->116
		// 이런식으로 각자의 크기를 가지고 나열됩니다.값이 없다면 0으로 초기화되어있겠죠.
		// 위에 출력 결과를 이제 이해하실수 있겠습니까?
		// arr_[0]과 arr_1[1]에는 10과 11이란 값을 넣었고 arr_1[2]에는 아무값도 넣지
		// 않았으니 10, 11, 0 이 순서대로 출력된겁니다. 만약
		// System.out.println("arr_1[10] :"+arr_1[10]);
		// 를 출력한다면 ArrayIndexOutOfBoundsException : 10 이라는 오류가 뜹니다.
		// 배열을 선언 할 때 10개의 공간만 가지도록 초기화했기때문에 배열은
		// arr_1[0]~arr_1[9]까지 존재하기때문에 범위를 벗어났다는 오류메시지가 뜨는겁니다.

		/* 다차원배열 */
		// 다차원 배열에는 대표적으로 이중배열이 있습니다.
		// 선언
		// 자료형[][] 배열명;
		@SuppressWarnings("unused")
		double[][] arr_double_1;
		// 자료형 [] 배열명 [];
		double[] arr_double_2[];
		// 자료형 배열명[][];
		double arr_double_3[][];

		// 다차원 배열 초기화
		// 배열명 = new 자료형[개수][개수];
		arr_double_1 = new double[3][5];
		// 배열명 = new 자료형[][]{{...},{...}};
		arr_double_2 = new double[][] { { 1.0, 2.0, 3.0 }, { 1.0, 2.0, 3.0 } };
		// 배열명 = new 자료형[개수][]; -동적배열
		arr_double_3 = new double[3][];

		// 이중배열을 이해하면 삼중배열 사중배열 역시 마찬가지로 이해할 수 있습니다.
		// 그러나 삼중배열 이상부터는 잘쓰는 편은 아니며, 굳이 쓸 이유도 없습니다. 코드가 매우복잡해지기때문입니다.
		// arr_double_1배열객체는 new double[3][5];로 초기화되었습니다.
		// 무슨의미일까요?
		// 단일 차원 배열이 하나의 주소값을 참조하여 그주소값부터 배열의 크기만큼 일열로 나열된 거라면
		// 이중 배열은 여러개의 주소를 참조하여 여러 열을 나열시킨겁니다.
		// double[3][5]라는 뜻은 크기 5개의 열이 3줄 있다는 뜻인거지요. 말로는 이해가안갑니다.
		// 포스팅에서 그림으로 그려놓을테니 참고하세요.
		// arr_double_1이 크기만 정해서 초기화하는거라면
		// arr_double_2를 초기화하는 방법은 크기와 값을 동시에 초기화하는 겁니다.
		// arr_double_2 를 arr_double_1처럼 바꿔 선언하면 이렇게되죠.

		arr_double_2 = new double[2][3];

		for (int i = 0; i < arr_double_2.length; i++) {// 배열명.lenhth 를 하면 배열의 크기를 구할수있습니다.
			for (int j = 1; j < arr_double_2[i].length + 1; j++) {
				arr_double_2[i][j - 1] = j;
				System.out.print(arr_double_2[i][j - 1] + " ");
			}
			System.out.println();
		}

		// 크기가 정해져있고 값이 정해져있다면 처음부터 저렇게 선언해놓는 것이 편하고 메모리도 효율적으로
		// 관리 할 수 있죠. 그러나 그런 경우는 그렇게 많지않습니다.
		// 몇개의 데이터가 어떻게 생기고 줄어들지 모르는 경우가 훨씬 많죠. 그래서 동적 할당이라는것이있습니다.
		// arr_double_3=new double[3][]; 으로 초기화 한다는 것은
		// 3개의 줄을 세울건데 몇줄씩 슬지는 정해놓지않고 오는거봐서 세우겠다. 라는 의미입니다.
	
		for (int i = 0; i < arr_double_3.length; i++) {
			int rand = (int) (Math.random() * 10 + 1);//random함수입니다.0.0부터 0.9까지 난수를 생성합니다.
			arr_double_3[i]=new double[rand];//double_3[i]를 double[rand]만큼 크기를 주겠다.라는의미입니다.
			for (int j = 0; j < arr_double_3[i].length; j++) {
				arr_double_3[i][j] = j;
				System.out.print(arr_double_3[i][j] + " ");
			}
			System.out.println();
		}

	}
}
