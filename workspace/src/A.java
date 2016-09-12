public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[10];

		for (int i = 0; i < arr.length; i++) {
				arr[i] = "index : "+(int)(i+Math.random()*100);
		}
		
		for(String str : arr){
			System.out.println(str);
		}
	}

}
