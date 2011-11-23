public class Employee{
	private String nama;
	private double gaji;
	protected Employee(String n, double g){
		nama = n;
		gaji = g;
	}
	
	protected String getData(){
		return "Nama : "+nama+"\nGaji :"+gaji;
	}
	
	public void cetak(){
		System.out.println("Coba di employee");
	}
}