import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class incub {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner br = new Scanner(new FileReader("/home/karthik/Documents/Incubator/Dataset/Posts.xml"));
		Scanner br2 = new Scanner(new FileReader("/home/karthik/Documents/Incubator/Dataset/Posts.xml"));
		Scanner br1 = new Scanner(new FileReader("/home/karthik/Documents/Incubator/Dataset/Comments.xml"));
		try {
			int cntt = 0;
			while(br.hasNextLine()){
				String[] strarr = br.next().split(" ");
				for(int i=0;i<strarr.length;i++){
					if(strarr[i].contains("Tags")){
						if(strarr[i].contains("probability")){
							cntt ++;
						}
					}
				}
				}
			int scorecount = 0;
			while(br2.hasNextLine()){
				String[] strarr2 = br2.next().split(" ");
				for(int i=0;i<strarr2.length;i++){
					if(strarr2[i].contains("Score=\"")){
int score = Integer.parseInt(strarr2[i].substring(strarr2[i].indexOf("=")+2, strarr2[i].indexOf("\"",7)));
						scorecount += score;
					}
				}
			}
				int commentscorecount = 0;
				while(br1.hasNextLine()){
					String[] strarr1 = br1.next().split(" ");
					for(int i=0;i<strarr1.length;i++){
						if(strarr1[i].contains("Score=\"")){
int scor = Integer.parseInt(strarr1[i].substring(strarr1[i].indexOf("=")+2, strarr1[i].indexOf("\"",7)));
							commentscorecount += scor;
						}
					}
				}
				int commentcount = 221292;
				int postcount = 115378;
				long comavg = commentscorecount/commentcount;
				long postavg = scorecount/postcount;
				System.out.println("Difference: "+(postavg-comavg));
				long res = cntt/postcount;
				System.out.println("Answer 2.1 "+res);
			}catch (NullPointerException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
}
