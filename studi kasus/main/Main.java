package main;

import src.Krs;
import src.Dosen;
import src.KrsDetail;
import src.MataKuliah;

public class Main{
	public static void main(String[] args){
		Krs krsA=new Krs();
		Krs krsB=new Krs();
		
		//krs
		krsA.ubahNama("Muhammad Sidratul Muntaha");
		krsA.ubahNpm("4510210013");
		krsA.ubahSmstr(3);
		krsA.ubahIpk(3.67);
		System.out.println("Nama : "+krsA.ambilNama());
		System.out.println("Npm : "+krsA.ambilNpm());
		System.out.println("Smester : "+krsA.ambilSmstr());
		System.out.println("Ipk : "+krsA.ambilIpk());

		krsB.ubahNama("Muhammad Fajri");
		krsB.ubahNpm("4411210013");
		krsB.ubahSmstr(1);
		krsB.ubahIpk(3.88);
		System.out.println("Nama : "+krsB.ambilNama());
		System.out.println("Npm : "+krsB.ambilNpm());
		System.out.println("Smester : "+krsB.ambilSmstr());
		System.out.println("Ipk : "+krsB.ambilIpk());		
		
		//matakuliah
		MataKuliah matkul1=new MataKuliah();
		MataKuliah matkul2=new MataKuliah();
		MataKuliah matkul3=new MataKuliah();
		
		matkul1.ubahKode("P1");
		matkul1.ubahNama("Pemograman 1");
		matkul1.ubahSks(3);		
		System.out.println("Kode MataKuliah : "+matkul1.ambilKode());
		System.out.println("MataKuliah : "+matkul1.ambilNama());
		System.out.println("jumlah Sks : "+matkul1.ambilSks());
		
		matkul2.ubahKode("P2");
		matkul2.ubahNama("Pemograman 2");
		matkul2.ubahSks(3);
		System.out.println("Kode MataKuliah : "+matkul2.ambilKode());
		System.out.println("MataKuliah : "+matkul2.ambilNama());
		System.out.println("jumlah Sks : "+matkul2.ambilSks());
		
		matkul3.ubahKode("BD1");
		matkul3.ubahNama("Basis data 1");
		matkul3.ubahSks(3);
		System.out.println("Kode MataKuliah : "+matkul3.ambilKode());
		System.out.println("MataKuliah : "+matkul3.ambilNama());
		System.out.println("jumlah Sks : "+matkul3.ambilSks());
		
		//dosen
		Dosen dosen1=new Dosen();
		Dosen dosen2=new Dosen();
		
		dosen1.ubahDosen("Endy muhardin");
		dosen2.ubahDosen("Iman Prayudi");
		System.out.println("Dosen 1 : "+dosen1.ambilDosen());
		System.out.println("Dosen 2 : "+dosen2.ambilDosen());
		
		//krsDetail
		KrsDetail det1=new KrsDetail();
	}
}