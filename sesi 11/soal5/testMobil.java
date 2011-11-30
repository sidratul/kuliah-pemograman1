public class testMobil{
	public static void main(String[] args){
		Mobil car=new Mobil(){
			public void injakPedalGas(){
				System.out.println("Mobil berjalan ...");
			}
		};
	
	Kijang kijang=new Kijang();
	BMW bmw = new BMW();
	
	car.injakPedalGas();
	
	car=kijang;
	car.injakPedalGas();
	
	car=bmw;
	car.injakPedalGas();
	}
}