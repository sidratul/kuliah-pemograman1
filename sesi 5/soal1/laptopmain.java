import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class laptopmain{
	public static void main(String[] agrs){
		File file=new File("C:/Users/Muhammad Sidratul M/Documents/UP/muhammad sidratul muntaha/smester 3/programan1/pemograman 1/sesi 5/soal1/laptop.txt");
		FileInputStream fis = null;
		BufferedInputStream bis=null;
		DataInputStream dis =null;
		List<laptop> listlaptop = new ArrayList<laptop>();
		
		try{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			while(dis.available()!=0){
				//memecah text perbaris menjadi beberapa kolom sesuai dengan pemisah koma
				String line = dis.readLine();
				String[] data = line.split(",");
				
				laptop l = new laptop();
				l.setMerk(data[0]);
				l.setProcessor(data [1]);
				l.setHarga(data[2]);
				
				listlaptop.add(l);
			}
		}
		
		catch(IOException ex){
			System.out.println("File" + file.getName()+"tidak ketemu !");
			System.out.println("Exception : "+ex.getMessage());
		}
		
		for(laptop lp : listlaptop){
			System.out.println("========================");
			System.out.println("merk : "+lp.getMerk());
			System.out.println("Processor : "+lp.getProcessor());
			System.out.println("Harag : "+lp.getHarga());
		}
	}	
}