public class Manager extends Employee{
	private String bidang;
	public Manager(String nama,double gaji,String bid){
		super(nama, gaji);
		bidang=bid;
	}
	
	public String getBidang(){
		return bidang;
	}
	
	public String getData(){
		return super.getData()+"\nDepartemen : "+getBidang();
	}
	
	public void cetak(){
		System.out.println("Coba di manager");
	}
}