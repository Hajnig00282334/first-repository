public class Arithmethic{
	public static void main(String[] arg){
	Arithmethic a = new Arithmethic();
	System.out.println("2 + 3 = "+a.addNumbers(2,3));
	System.out.println("2 + 3 + 5 = "+a.addNumbers(2,3,5));
	Index.main(null);

	}
	public int addNumbers(int x, int y){
		return x + y;
	}
	public int addNumbers(int x, int y, int z){
		return x + y + z;
	}


}