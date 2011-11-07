package main;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

public class MainClass{
	public static void main(String[] agrs){
		CalculatorService service = new CalculatorServiceImpl();
		
		Integer a= service.tambah(200,4);
		Integer b= service.kurang(200,4);
		Integer c= service.kali(200,4);
		Integer d= service.bagi(200,4);

		System.out.println("output");
		System.out.println("Nilai a : "+a);
		System.out.println("NIlai b : "+b);
		System.out.println("Nilai c : "+c);
		System.out.println("NIlai d : "+d);
	}
}