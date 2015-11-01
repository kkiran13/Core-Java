

public class RunnerSuperChild {
	
	public static void main(String[] args){
		Parent p = new Child();
		try {
			p.msg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
