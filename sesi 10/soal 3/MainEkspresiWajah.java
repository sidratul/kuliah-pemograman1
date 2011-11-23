class MainEkspresiWajah{
	public static void main(String[] args){
		EkspresiWajah eks= new EkspresiWajah();
		Gembira g=new Gembira();
		Sedih s=new Sedih();
		Marah m=new Marah();
		
		EkspresiWajah[] arrEkspresi = new EkspresiWajah[4];
		arrEkspresi[0]= eks;
		arrEkspresi[1]= g;
		arrEkspresi[2]= s;
		arrEkspresi[3]= m;
		
		System.out.println("Ekspresi [0] :" + arrEkspresi[0].respons());
		System.out.println("Ekspresi [1] :" + arrEkspresi[1].respons());
		System.out.println("Ekspresi [2] :" + arrEkspresi[2].respons());
		System.out.println("Ekspresi [3] :" + arrEkspresi[3].respons());
	}
}