package service.impl;
import service.Variabel;

public class Operasi implements Variabel{

	@Override
	public Integer tambah(int bil1, int bil2){
		return bil1+bil2;
	}
	@Override
	public Integer kurang(int bil1, int bil2){
		return bil1- bil2;
	}
	@Override
	public Integer kali(int bil1, int bil2){
		return bil1*bil2;
	}
	@Override
	public double bagi(double bil1, double bil2){
		return bil1/bil2;
	}	
	@Override
	public double pangkat(double bil1, double bil2){
		return Math.pow(bil1,bil2);
	}
}