class Sapi extends Hewan{
	public Sapi(){
		super("sapi",4,false);
	}
	
	public void bersuara(){
		System.out.println("\nngooooooo  ngoowwww");
	}
	
	public static void main(String[] args){
		Sapi s=new Sapi();
		s.idHewan();
		s.bersuara();
	}
}