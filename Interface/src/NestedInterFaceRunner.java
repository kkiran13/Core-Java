
public class NestedInterFaceRunner {
	public static void main(String[] args){
		Showable ss = new NestedInterfaceClassA();
		ss.show();
		Showable.Message sm = new NestedInterfaceClassA();
		sm.message();
	}
}
