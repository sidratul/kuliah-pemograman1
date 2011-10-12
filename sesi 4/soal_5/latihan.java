//ini adalah nama class yang harus sama dengan nama filenya
public class latihan{

//dibawahini adalah method utama yg akan di eksekusi oleh java
	public static void main(String args[]){
		//dideklarasikan variabel test=5 dengan tipe data integer
		int test=5;
		
		//menampilakan nilai test++(5)
		System.out.println("test : "+ test++);
		//test=5+1
		//menampilakn "(ganti baris)test++"dan nlai test(6)
		System.out.println("\ntest++");
		System.out.println(test+"\n");
		
		//menampilkan "test :" dan nilai test-- (6)
		System.out.println("test :"+ test--);
		//test=6-1
		//menampilkan "(ganti baris)test--" dan nilai dari test(5)
		System.out.println("\ntest--");
		System.out.println("test : "+ test);
	}
}