//ini adalah nama class yang harus sama dengan nama filenya
public class Belajar{
	//dideklarasikan variebl global nama dengantipe data string
	private String nama;
	//dibawah ini adalah method utama yg akan di eksekusi oleh java
	public static void main(String[] args){
	
		Belajar test;
		test = new Belajar();
		//memanggil method set nama dan mengirimkan nilai test("andi") ke method tersebut
		test.setNama("andi");
		//dideklarasikan b=100 dengan tipe data byte 
		byte b =100;
		//dideklarasikan variebel s=100 dengan tipe data short
		short s=100;
		
		//dideklarasikan belajar variebel =test
		Belajar belajarVariabel=test;
		belajarVariabel.setNama("belajar variabel");
		
		//menampilkan nilai dari variabel(b+s)
		System.out.println(b+s);
		//menampilkan "nama :" dan memanggil method get.Nama seta menampilkan nilai dari variebel b  
		System.out.println("nama : " +test.getNama()+" " + b);
	}
	//method setNama 
	public void setNama(String aNama){
		this.nama = aNama;
	}
	
	//method getNama
	public String getNama(){
		return this.nama;
	}
}