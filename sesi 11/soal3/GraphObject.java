abstract class GraphObject{
	int x,y;
	void pindah(int xbaru,int ybaru){
		x=xbaru;
		y=ybaru;
	}
	abstract void gmbrBentuk();
	abstract void ubahUkuran();
	
}