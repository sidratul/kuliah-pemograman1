import java.util.Scanner;
public class method{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		tuna tunaObject=new tuna();
		
		System.out.println("masukkan namamu disini : ");
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
	}
}