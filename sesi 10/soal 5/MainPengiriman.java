import javax.swing.JOptionPane;

public class MainPengiriman extends Paket{
	public MainPengiriman(){

	}
	public static void main(String[] args){
		MainPengiriman kir = new MainPengiriman();
		
		String pengirim = JOptionPane.showInputDialog("Biaya Pengiriman Paket"+"\nInput nama pengirim");
		kir.setPengirim(pengirim);
		
		String tujuan= JOptionPane.showInputDialog("biaya Pengiriman paket : Bali| Surabaya|Jakarta|Bandung");
		kir.setTujuan(tujuan);
		
		String br =JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\nInputkan berat paket :");
		
		int berat=Integer.parseInt(br);
		kir.setBerat(berat);
		kir.biayaPerKg();
		
		kir.Bayar();
		
		JOptionPane.showMessageDialog(null,"keterangan Paket anda :"+"\nNama Pengirim : "+kir.getPengirim()+"\nTujuan Paket : "+kir.getTujuan()+"\nBerat Paket: "+kir.getBerat()+"kg"+"\nBiaya per kilogram : Rp"+kir.biayaPerKg()+"\nTotal Biaya : Rp"+kir.Bayar()+"\n\tTerimakasih ");
	}
}