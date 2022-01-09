public class HelloNumbers {
    public static void main(String[] args) {
        for (int i = 0; i<= 9; i++){
			int result = 0;
			for (int j = 0; j <= i ; j++){
				result += j;
			}
			System.out.print(result + " ");
		}
    }
}