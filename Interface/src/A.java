
public interface A {
 void b();
}

abstract class B implements A{
	public void b(){
		System.out.println("In b");
		}
}
