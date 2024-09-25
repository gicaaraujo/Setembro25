package Setembro25;

public class Principal2 {

	public static void main(String[] args) {
		
	//Criando Veículo
		Veículo veiculo = new Veículo("Jeep Compass", "Jeep", "Preto", 2023);
		System.out.println("Veículo: ");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Cor: " + veiculo.getCor());
		System.out.println("Ano: " + veiculo.getAno());
		
		
		//Criando Automovel
		Automovel automovel = new Automovel("Jeep Compass", "Jeep", "Preto", 2023, 4, "2.0");
		System.out.println("\nAutomovel: ");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Número de portas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		
		//Criando Moto
		Moto moto = new Moto("Jeep Compass", "Jeep", "Preto", 2023, 400);
		System.out.println("\nMoto: ");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cilindrada: " + moto.getCilindrada());
	}}