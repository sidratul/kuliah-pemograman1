package src;

public class Krs{
	private String nama;
	private String npm;
	private Integer smester;
	private double ipk;
	//private Integer totalSksOk;
	//private Integer versi;
	
	public void ubahNama(String nama){
		this.nama=nama;
	}
	public String ambilNama(){
		return nama;
	}
	
	public void ubahNpm(String npm){
		this.npm=npm;
	}
	public String ambilNpm(){
		return npm;	
	}
	
	public void ubahSmstr(Integer smester){
		this.smester=smester;
	}
	public Integer ambilSmstr(){
		return smester;
	}
	
	public void ubahIpk(double ipk){
		this.ipk=ipk;
	}
	public double ambilIpk(){
		return ipk;
	}
	
	public Integer totalSks(){
		return 0;
	}
}