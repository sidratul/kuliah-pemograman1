package main;

import service.Variabel;
import service.impl.Operasi;

import java.io.*;

  
public class MainCalculator{	
	public static void main(String[] args){
		String pilih;
		int x=0,y=0,z=1;
		boolean ada=false;
		System.out.println("\tProgram kalkulator\n\tdibuat oleh :Muhammad Sidratul Muntaha");
		BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
		Variabel service = new Operasi();
		do{
		try{
			if(ada==true){
				System.out.println("\n-----------------------");
				System.out.println("angka pertama :"+x);
				System.out.println("angka pertama :"+y);
			}
			System.out.println("\n\t=====Menu Pilihan=======");
			System.out.println("\t1.Input data");
			System.out.println("\t2.Penjumlahan");
			System.out.println("\t3.Pengurangan");
			System.out.println("\t4.Perkalian");
			System.out.println("\t5.Pembagian");
			System.out.println("\t6.Pangkat");
			System.out.println("\t7.Akar");
			System.out.println("\t8.Keluar");
			System.out.println("\t--------------------");
			System.out.print("Masukkan pilihan anda :");
			pilih = masuk.readLine();
			z=1;
			if(pilih.equals("1")){
				System.out.println("\tinput data");
				System.out.print("Masukkan angka pertama :");
				x = Integer.parseInt(masuk.readLine());
				System.out.print("Masukkan angka Kedua :");
				y = Integer.parseInt(masuk.readLine());
				ada=true;
			}else if(pilih.equals("2")){
				if(ada==false){
					System.out.println("maaf,anda belum memasukkan data\n");
				}else{
					Integer a= service.tambah(x,y);
					System.out.println(x+" + "+y+"= "+a);
				}
			}else if(pilih.equals("3")){
				if(ada==false){
					System.out.println("maaf,anda belum memasukkan data\n");
				}else{
					Integer a= service.kurang(x,y);
					System.out.println(x+" - "+y+"= "+a);
				}
			}else if(pilih.equals("4")){
				if(ada==false){
					System.out.println("maaf,anda belum memasukkan data\n");
				}else{
					Integer a= service.kali(x,y);
					System.out.println(x+" * "+y+"= "+a);
				}
			}else if(pilih.equals("5")){
				if(ada==false){
					System.out.println("maaf,anda belum memasukkan data\n");
				}else{
					double a= service.bagi(x, y);
					System.out.printf("%d / %d = %.3f\n",x,y,a);
				}
			}else if(pilih.equals("6")){
				if(ada==false){
					System.out.println("maaf,anda belum memasukkan data\n");
				}else{
					double a= service.pangkat(x, y);
					System.out.printf("%d pangkat %d = %.0f\n",x,y,a);
				}
			}else if(pilih.equals("7")){
				if(ada==false){
					System.out.println("maaf,anda belum memasukkan data\n");
				}else{
					double yubah=y;
					yubah=1/yubah;
					
					double a= service.pangkat(x, yubah);
					System.out.format("akar %d dari %d = %.3f\n",y,x,a);
				}
			}else if(pilih.equals("8")){
				z=8;
				System.out.println("--------Terima kasih telah mencoba program ini--------");
			}else{
				throw new Exception("Pilihan anda tidak ada ");
				}	
		}catch(Exception e){
				System.out.println(e.getMessage());
		}
	}while(z!=8);
	}
}

//made by muhammad sidratul muntaha