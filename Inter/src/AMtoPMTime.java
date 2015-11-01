import java.io.BufferedReader;
import java.io.InputStreamReader;


public class AMtoPMTime {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strarr = br.readLine().split(":");
		String ampm = strarr[strarr.length-1].substring(2);
		String hr = "";
		if(ampm.equals("AM")){
			if (strarr[0].equals("12")){
			strarr[0] = "00";
			}
			System.out.println(strarr[0]+":"+strarr[1]+":"+strarr[2].substring(0,2));
		}else if(ampm.equals("PM")){
			switch(strarr[0]){
			case "01" : hr = "13"; break;
			case "02" : hr = "14"; break;
			case "03" : hr = "15"; break;
			case "04" : hr = "16"; break;
			case "05" : hr = "17"; break;
			case "06" : hr = "18"; break;
			case "07" : hr = "19"; break;
			case "08" : hr = "20"; break;
			case "09" : hr = "21"; break;
			case "10" : hr = "22"; break;
			case "11" : hr = "23"; break;
			case "12" : hr = "12"; break;
			}
			System.out.println(hr+":"+strarr[1]+":"+strarr[2].substring(0,2));
		}
	}
}