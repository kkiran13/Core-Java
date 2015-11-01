import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class countwords {
	
	public void filedirprocess(File[] listoffiles) throws FileNotFoundException{
		for (File file:listoffiles){
			if (file.isFile()) {
				System.out.println();
				String filename = file.getName();
				String path = file.getParent();
			String filecategory = path.substring(path.lastIndexOf("/")+1,path.length());
				System.out.println(filename+" and "+filecategory);
		        @SuppressWarnings("resource")
				Scanner scan = new Scanner(new File(file.getAbsolutePath()));
		        while(scan.hasNext()){
		        	System.out.println(scan.nextLine());
		        }
		    }
		}
	}
	
	public void fileprocess(File file) throws FileNotFoundException{
		System.out.println();
		String filename = file.getName();
		String path = file.getParent();
		String filecategory = path.substring(path.lastIndexOf("/")+1,path.length());
		System.out.println(filename+" and "+filecategory);
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(new File(file.getAbsolutePath()));
        while(scan.hasNext()){
        	System.out.println(scan.nextLine());
        }
	}
	
	public static void main(String[] args) throws IOException{
		countwords cw = new countwords();
		//HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		File folder = new File("/home/karthik/Documents/IR/IR_infiles");		
		File[] listoffiles = folder.listFiles();
	    for(File file:listoffiles){
	    	System.out.println(file);
	    	if(file.isDirectory()){
	    		File[] listfile = file.listFiles();
	    		cw.filedirprocess(listfile);
	    	}else if(file.isFile()){
	    		cw.fileprocess(file);
	    	}
	    }	   
	}
}
