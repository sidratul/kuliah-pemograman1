//ini adalah nama class yang harus sama dengan nama filenya
public class belajar{
	//dibawahini adalah method utama yg akan di eksekusi oleh java
	public static void main(String[] args){
	//dideklarasikan variabel test1=1 dengan tipe data byte 
		byte test1 = 1;
	//dideklarasikan variabel test2=2 dengan tipe data short
		short test2 = 2;
	//dideklarasikan variabel test3=3 dengan tipe data integer
		int test3 = 3;
	//dideklarasikan variabel test4=4 dengan tipe data long
		long test4 =4;
	//dideklarasikan variabel test5=5 dengan tipe data float
		float test5=5;
	//dideklarasikan variabel test6=6 dengan tipe data double
		double test6=6;
	//dideklarasikan variabel value dengan nilai true dengan tipe data boolean
		boolean value =true;
	//dideklarasikan variabel a=test variabel dengan tipe data string
		String a="tes variabel :";
		
	//menampilkan nilai dari test1
		System.out.println(test1);
	//menampilkan nilai dari test2
		System.out.println(test2);
	//menampilkan nilai dari test3
		System.out.println(test3);
	//menampilkan nilai dari test4
		System.out.println(test4);
	//menampilkan nilai dari test5
		System.out.println(test5);
	//menampilkan nilai dari test6
		System.out.println(test6);
	//menampilkan isi string a dan nilai dari test1 + test2 + test3 + test4+test5+test6
		System.out.println(a + " = " + (test1 + test2 + test3 + test4+test5+test6));
	//menampilkan nilai kebenaran dari variabel value
		System.out.println(value);
	}
}