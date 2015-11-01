import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.sun.xml.internal.ws.util.StringUtils;


public class example {
	
public static void main(String[] args){

	String x2 = "GoSpursGo.csv";
	String[] strar = x2.split("\\.");
	System.out.println(strar[0]);
	String x1 = "hi hello.Win etc";
	String x3 = x1.toLowerCase();
	System.out.println(x3);
	if (x3.contains("win") || x1.contains("lose")){
		System.out.println("Yes");
	} else{
		System.out.println("No");
	}
	
	String line = "spurs win huuuu hsajdklsj win lose";
	//int count = y.contains("win");
	//int count = StringUtils.countMatches("a.b.c.d", ".");
	//int occurance = StringUtils.countOccurrencesOf("win win", "win");
	int count = line.length();
int count1 = line.length() - line.replace("win","aa").length() ;
int count2 = line.length() - line.replace("lose","aaa").length();
	System.out.println(count1+" wins and lose "+count2);
	int re = count1 + count2;
	System.out.println(re);
	//System.out.println(line.replace("win","aa").length());
	//System.out.println(line.replace("lose","aa").length());
	//System.out.println(count);
	
}
}