//ini adalah nama class yang harus sama dengan nama filenya
public class praktikum{
	//dibawahini adalah method utama yg akan di eksekusi oleh java
	public static void main(String[] args){
/* dideklarasikan variabel a=4 dan b=6 bertipe integer
dideklarasikan variabel num = a(4) atau num=b(6) karena nilai b terbesar maka num=b*/
		int a=4,b=6;
		int num=a|b;
		
		//dilakukan selection, apakah num==6
		if(num==6)
		//jika ya maka tampilkan ""value is 4"
			System.out.println("value is 4");
		//jika tidak akan dilakukan pemilihan apakah num=5
		else if(num==5)
		//jika iya maka akan menampilkan"value is 5"
			System.out.println("value is 5");
		//jika tidak akan dilakukan pemilihan apakah num=6
		else if(num==4)
		//jika iya maka akan menampilkan"value is 6"
			System.out.println("value is 6");
		//jika tidak akan dilakukan pemilihan apakah num=7
		else if(num==7)
		//jika iya maka akan menampilkan"value is 7"
			System.out.println("value is 7");
	}
//pemilihan selesai
}