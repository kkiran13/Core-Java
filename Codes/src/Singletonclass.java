/*Singleton class means you can create only one object for the given class. You can 
 * create a singleton class by making its constructor as private, so that you can restrict
 *  the creation of the object. Provide a static method to get instance of the object, 
 *  wherein you can handle the object creation inside the class only. In this example we 
 *  are creating object by using static block.*/

/*A practical example would be a logging system where you'll require a logger object to 
 * write application logs to disk. You would need only one instance of logger throughout 
 * the application right? Otherwise you'll be creating logger objects in each and every 
 * class which is a waste of memory and resources. This is one real time example*/

public class Singletonclass {
	private static Singletonclass myobj;
    
    static{
    	myobj = new Singletonclass();
    } // Similar to (private static Singletonclass myobj = new Singletonclass();)
     
    private Singletonclass(){
     
    }
     
    public static Singletonclass getInstance(){
        return myobj;
    }
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
    	Singletonclass ms = getInstance();
        ms.testMe();
    }
}
