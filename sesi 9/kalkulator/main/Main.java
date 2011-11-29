package main;

import javax.swing.JOptionPane;
import service.Variabel;
import service.impl.Operasi;

import java.io.*;
public class Main{	
	public static void main(String[] args){
		String pilih;
		int x=0,y=0,z=1;
		boolean ada=false;
		
		Variabel service = new Operasi();
		
		JOptionPane.showMessageDialog(null,"Program Kalkulator\nMade By Muhammad Sidratul Muntaha");
		do{
		if(ada==true){
				JOptionPane.showMessageDialog(null,"angka pertama :"+x+"\nangka kedua :"+y);
			}
		z=1;
		pilih =JOptionPane.showInputDialog("\n\t=====Menu Pilihan=======\n\t1.Input data\n\t2.Penjumlahan\n\t3.Pengurangan\n\t4.Perkalian\n\t5.Pembagian\n\t6.Pangkat\n\t7.Akar\n\t8.Keluar\n\t-------------------------\nMasukkan pilihan anda :");
		
		if(pilih.equals("1")){
			String in = JOptionPane.showInputDialog("\tinput data\nMasukkan bilangan pertama");
			x=Integer.parseInt(in);
			String msk=JOptionPane.showInputDialog("\tinput data\nMasukkan bilangan kedua");
			y=Integer.parseInt(msk);
			ada=true;
		}else if(pilih.equals("2")){
			if(ada==false){
				JOptionPane.showMessageDialog(null,"maaf,anda belum memasukkan data\n");
			}else{
				Integer a= service.tambah(x,y);
				JOptionPane.showMessageDialog(null,x+" + "+y+" = "+a);
			}
		}else if(pilih.equals("3")){
			if(ada==false){
				JOptionPane.showMessageDialog(null,"maaf,anda belum memasukkan data\n");
			}else{
				Integer a= service.kurang(x,y);
				JOptionPane.showMessageDialog(null,x+" - "+y+" = "+a);
			}
		}else if(pilih.equals("4")){
			if(ada==false){
				JOptionPane.showMessageDialog(null,"maaf,anda belum memasukkan data\n");
			}else{
				Integer a= service.kali(x,y);
				JOptionPane.showMessageDialog(null,x+" * "+y+" = "+a);
			}
		}else if(pilih.equals("5")){
			if(ada==false){
				JOptionPane.showMessageDialog(null,"maaf,anda belum memasukkan data\n");
			}else{
				double a= service.bagi(x,y);
				JOptionPane.showMessageDialog(null,x+" / "+y+" = "+a);
			}
		}else if(pilih.equals("6")){
			if(ada==false){
				JOptionPane.showMessageDialog(null,"maaf,anda belum memasukkan data\n");
			}else{
				double a= service.pangkat(x,y);
				JOptionPane.showMessageDialog(null,x+" pangkat "+y+" = "+a);
			}
		}else if(pilih.equals("7")){
			if(ada==false){
				JOptionPane.showMessageDialog(null,"maaf,anda belum memasukkan data\n");
			}else{
				double yubah=y;
				yubah=1/yubah;
				double a= service.pangkat(x,yubah);
				JOptionPane.showMessageDialog(null,"akar "+y+" dari "+x+" = "+a);
			}
		}else if(pilih.equals("8")){
			z=8;
			JOptionPane.showMessageDialog(null,"--------Terima kasih telah mencoba program ini--------");
		}else{
			JOptionPane.showMessageDialog(null,"Pilihan anda tidak ada ");
		}
		}while(z!=8);
		
	}
}