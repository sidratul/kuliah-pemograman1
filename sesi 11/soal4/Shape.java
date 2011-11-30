abstract class Shape{
	public String warna;
	public Shape(){
	}
	
	public void setWarna(String c){
		warna=c;
	}
	
	public String getWarna(){
		return warna;
	}
	
	abstract public double area();
}