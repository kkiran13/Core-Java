
public class LeftToRightEvaluation {

// exparr has 1st element which is blank//So in the loop we take values from 1st index
	public int ltor(int[] numarr, String[] exparr){
		int sum = numarr[0];
		for(int i=1;i<numarr.length;i++){
			sum = value(sum,numarr[i],exparr[i]);
		}
		return sum;
	}
	
	public int value(int n1, int n2, String exp){
		int val = 0;
		switch(exp){
		case "+" : val = n1+n2; break;
		case "-" : val = n1-n2; break;
		case "*" : val = n1*n2; break;
		case "/" : val = n1/n2; break;
		}
		return val;
	}
	
	public static void main(String[] args){
		String s = "20+2-2*4";
		System.out.println(s);
		
		String[] numstrarr = s.split("\\W") ; // or  s.split("\\+|-|\\*") removes all words or chars from string
		String[] exparr = s.split("\\d+"); //removes all letters and words keeping on special chars
		int[] numarr = new int[numstrarr.length];
		
		for(int i=0;i<numstrarr.length;i++){
			numarr[i] = Integer.parseInt(numstrarr[i]);
		}
		
		LeftToRightEvaluation lr = new LeftToRightEvaluation();
		System.out.println("Result is: "+lr.ltor(numarr, exparr));
	}
}

//s.split("\\W") matches non word chars -- 2+3-1*4 - 2 3 1 4
