public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[10];
		int[] index = new int[10];

		for (int i = 0; i < arr.length; i++) {
			
			boolean bool = false;
			
			int a = (int) ( (Math.random() * 10)+1);
			
			for (int j = 0; j < i; j++) {
				if (index[j] == a) {
					bool = true;
				}
			}
			
			if (bool == true) {
				i--;
				continue;
			}
			
			index[i] = a;
			arr[i] = "index : " + a;

		}

		for (String str : arr) {
			System.out.println(str);
		}
		switch("안녕"){
		case "안녕" : System.out.println("흐흐흐");break;
		}
	}

}
