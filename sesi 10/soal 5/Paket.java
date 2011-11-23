public class Paket implements Harga{
	private String pengirim;
	private String tujuan;
	private int biayaPerKg;
	private int berat;
	private double bayar;
	public Paket(){
	}
	
	public String getPengirim(){
		return pengirim;
	}
	
	public void setPengirim(String temp){
		pengirim = temp;
	}
	
	public String getTujuan(){
		return tujuan;
	}
	
	public void setTujuan(String temp){
		tujuan = temp;
	}
	
	public int getBerat(){
		return berat;
	}
	
	public void setBerat(int temp){
		berat = temp;
	}

	public double biayaPerKg(){
	if(tujuan.equalsIgnoreCase("bali")){
		biayaPerKg = 10000;
		return biayaPerKg;
	}else if(tujuan.equalsIgnoreCase("surabaya")){
		biayaPerKg = 15000;
		return biayaPerKg;
	}else if(tujuan.equalsIgnoreCase("jakarta")){
		biayaPerKg = 20000;
		return biayaPerKg;
	}else{
		biayaPerKg = 25000;
		return biayaPerKg;
	}
	}
	
	public double Bayar(){
		bayar = berat*biayaPerKg;
		return bayar;
	}
}