abstract class Hewan{
	protected String nama;
	protected int jumKaki;
	protected boolean bsTerbang =false;
	
	public Hewan(String nama, int kaki, boolean fly){
		this.nama= nama;
		jumKaki = kaki;
		bsTerbang = fly;
	}
	public abstract void bersuara();
	
	public static void makan(){
		System.out.println("nyamm nyaaam (:9)");
	}
	
	public void idHewan(){
		System.out.println("nama : "+nama);
		System.out.println("jumlah kaki : "+jumKaki);
		System.out.println("bisa terbang : "+bsTerbang);
	}
}