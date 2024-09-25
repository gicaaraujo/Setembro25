package Setembro25;

public class Moto extends Veículo{
	
	private int cilindrada;
	
	public Moto(String marca, String modelo, String cor, int ano, int cilindrada) {
		super(marca, modelo, cor, ano);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}}