public class TestArray{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int[] arr= new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<myList.length;i++){
			System.out.println(myList[i]+"");
		}
		double total = 0;
		for(int i=0;i<myList.length;i++){
			total+=myList[i];
		}

		System.out.println("Total is" +total);
	}
}