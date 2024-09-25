package Setembro25;

public class Automovel extends Veículo{
	
	private int numeroPortas;
	private String motor;
	
	public Automovel(String marca, String modelo, String cor, int ano, int numeroPortas, String motor) {
		super(marca, modelo, cor, ano);
		this.numeroPortas = numeroPortas;
		this.motor = motor;
	}

	  public String getMotor() {
	    	return motor;
	    }
	    public void setMotor(String motor) {
	    	this.motor = motor;
	    }
		public int getNumeroPortas() {
			return numeroPortas;
		}
		public void setNumeroPortas(int numeroPortas) {
			this.numeroPortas = numeroPortas;
		}
}