import java.io.*;

public class TryCatchException{
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args){
		try{
			System.out.println("choose one of the options,(1-3)"+"\n\t1.) Steak" +"\n\t2.)Lobster"+"\n\t3.)Cheseburger");
			System.out.print("Masukkan pilihan anda : ");
			String choose = input.readLine();
			if(choose.equals("1")){
				System.out.println("anda memilih steak :9\n");
			}else if(choose.equals("2")){
				System.out.println("anda memilih lobster :)\n");
			}else if(choose.equals("3")){
				System.out.println("anda memilih Cheseeburger :0\n");
			}else{
				throw new Exception("Maaf, pilihan anda tidak ada !"); 
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}