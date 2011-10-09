//ini adalah nama class yang harus sama dengan nama filenya
public class praktikum{

//dibawahini adalah method utama yg akan di eksekusi oleh java
	public static void main(String[] args){

/*dideklarasikan variabel number1=20,number2=10,dan variabel results dengan tipe data integer
dikeklarasikan variebel number dengan tipe data boolean*/
		int number1, number2,results;
		boolean number;
		number1=20;
		number2=10;

//nilai bagi antara variabel number1/number di isikan ke variabel results
		results=number1/number2;
//menampilkan nilai dari variabel result
			System.out.println(results);
			
//nilai dari hasil varibel number1+number2 diisikan kedalam variabel result
		results=(number1+number2);
//menampilkan nilai dari variabel result
			System.out.println(results);

//dimasukkan nilai kebenaran dari pernyataan (apakah 20 tidak sama dengan 10) kedalam variebel number
		number=(20!=10);
//menampilkan nilai kebenaran dari variabel number
			System.out.println(number);
			
//dimasukkan nilai kebenaran dari pernyataan (apakah 20 sama dengan 10) kedalam variebel number
		number=(20==10);
//menampilkan nilai kebenaran dari variabel number
			System.out.println(number);
	}
}