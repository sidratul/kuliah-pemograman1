package cls;

import java.util.List;
import java.util.ArrayList;

public class Pertemuan {
    private String tanggal;
    private String ruangan;
    
    private List<Kehadiran> daftarKehadiran 
        = new ArrayList<Kehadiran>();
    private Dosen dosen;
    private Batch batch;
    
    public Integer hitungJumlahHadir(){
        Integer hasil = 0;
        for(Kehadiran k : daftarKehadiran){
            if("Hadir".equalsIgnoreCase(k.getStatus())){
                hasil++;
            }
        }
        return hasil;
    }
	
	public Integer hitungJumlahSakit(){
		Integer sakit =0;
		for(Kehadiran k : daftarKehadiran){
			if("Sakit".equalsIgnoreCase(k.getStatus())){
				sakit++;
			}
		}
		return sakit;
	}
	
	public Integer hitungJumlahIzin(){
		Integer izin =0;
		for(Kehadiran k : daftarKehadiran){
			if("Ijin".equalsIgnoreCase(k.getStatus())){
				izin++;
			}
		}
		return izin;
	}
    
    public Integer jumlahSakit(){
        return 0;
    }
    
    public List<Kehadiran> getDaftarKehadiran(){
        return daftarKehadiran;
    }
 
    public void setBatch(Batch b){
        this.batch = b;
    }
    
    public Batch getBatch(){
        return batch;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(String t){
        this.tanggal = t;
    }
}