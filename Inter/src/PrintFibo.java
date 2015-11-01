public class PrintFibo {

	public void PrintFibonacci(int digits){
		int x = 1;
		int y = 0;
		System.out.print(x+" ");
		for(int i=1;i<digits;i++){
			x = x + y;
			y = x - y;
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args){
		PrintFibo pf = new PrintFibo();
		pf.PrintFibonacci(8);
	}
	
}