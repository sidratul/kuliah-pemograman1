class Perkutut extends Hewan{
	public Perkutut(){
		super("Perkutut",2,true);
	}
	
	public void bersuara(){
		System.out.println("\ncuit cuuit cu'uuit");
	}
	
	public static void main(String[] args){
		Perkutut p=new Perkutut();
		p.idHewan();
		p.bersuara();
	}
}