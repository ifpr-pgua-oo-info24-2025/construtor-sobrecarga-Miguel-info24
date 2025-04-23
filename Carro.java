import java.util.Scanner;

class Carro {

	private String placa;
	private String modelo;
	private int ano;
	private Condutor pessoa;
	private Motor motor;

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setPlaca(String novaPlaca) {
		this.placa = novaPlaca;
	}

	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}

	public void setAno(int novoAno) {
		this.ano = novoAno;
	}

	public Carro(String placa, String modelo, int ano, Condutor pessoa, Motor motor)
	{

	}
}