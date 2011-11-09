package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employe;
import model.Student;

public class InheritanceMain{
	public static void main(String[] args)throws ParseException{
		Student s=new Student();
		s.setNim("4510210013");
		s.setNama("Muhammad Sidratul Muntaha");
		s.setAlamat("jl. R.A kartinin no 47");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("04-05-1991"));
		s.setNoHp("08999904444");
		
		Employe e=new Employe();
		e.setNip("4411210011");
		e.setNama("Muhammad Fajri");
		e.setAlamat("jl. R.A. Kartini no 47");
		e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("19-06-1993"));
		e.setNoHp("085777000444");
		
		showData(s);
		System.out.println("\n===========================\n");
		showData(e);
	}
	
	static void showData(Student s){
		System.out.println("Class Student");
		System.out.println("NIM : " + s.getNim());
		System.out.println("NAMA : "+ s.getNama());
		System.out.println("ALAMAT : "+ s.getAlamat());
		System.out.println("TGL LAHIR : " +new SimpleDateFormat("dd MMMMM yyyy").format(s.getTglLahir()));
		System.out.println("NO HP : "+s.getNoHp());
	}
	
	static void showData(Employe e){
		System.out.println("Class Employe");
		System.out.println("NIM : " + e.getNip());
		System.out.println("NAMA : "+ e.getNama());
		System.out.println("ALAMAT : "+e.getAlamat());
		System.out.println("TGL LAHIR : " +new SimpleDateFormat("dd MMMMM yyyy").format(e.getTglLahir()));
		System.out.println("NO HP : "+e.getNoHp());
	}
}