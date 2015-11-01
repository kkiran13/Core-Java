
public class NestedInterfaceClassA implements Showable,Showable.Message{

	@Override
	public void show() {
		System.out.println("Show");	
	}

	@Override
	public void message() {
		System.out.println("Message");
	}

	
}
