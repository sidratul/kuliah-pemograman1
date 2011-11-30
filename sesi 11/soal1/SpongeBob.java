class SpongeBob extends Hewan implements Manusia{
	public SpongeBob(){
		super("Sponge Bob Square Pants",2,false);
	}
	
	public void bersuara(){
		System.out.println("\nHallo petric");
	}
	public void menyanyi(){
		System.out.println("la la la la la");
	}
	public void ketawa(){
		System.out.println("ngeheheheh ngeheheh");
	}
	public static void makan(){
		System.out.println("ehmmm yummy enaak");
	}
	public void makan2(){
		super.makan();
	}
	public static void main(String[] args){
		SpongeBob s=new SpongeBob();
		s.idHewan();
		s.bersuara();
		s.menyanyi();
		s.ketawa();
		s.makan2();
		Hewan.makan();
		makan();
	}
}

