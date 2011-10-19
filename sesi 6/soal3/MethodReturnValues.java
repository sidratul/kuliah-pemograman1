public class MethodReturnValues{
	public static void main(String[] args){
		myMethod();
		int a=0;
		System.out.println(a);
		a=myMethod();
		System.out.println(a);
	}
	
	static int myMethod(){
		System.out.println("this compputer is lagging!");
		return 4;
	}
}