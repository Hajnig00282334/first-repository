public class ReturnMethods{

	public static void main(String[] args){
		ReturnMethods m = new ReturnMethods();
		int number = m.method1();
		System.out.println("Method returned "+number+" via method1 and method2");
	}


	public int method1(){
		System.out.println("No problem. Method 2, can you ask method 3 for a number and return it to me?");
		return method2();
}
public int method2(){
	System.out.println("Of course I can method 1. Method 3, can you please send me a number.");
	return method3();
}
public int method3(){
	System.out.println("Yes method 2, I will return a number to you now");
	return 5;
		}
	}
