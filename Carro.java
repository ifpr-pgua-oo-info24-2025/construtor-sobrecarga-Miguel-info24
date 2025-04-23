class Carro {
	private String marca;
	private String placa;
	private String modelo;
	private int ano;
	private Condutor condutor;
	private Motor motor;

	public Carro(String marca, String placa, String modelo, int ano, Condutor condutor, Motor motor) {
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.condutor = condutor;
		this.motor = motor;

	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getMarca() {
		return marca;
	}

	public Condutor getCondutor() {
		return condutor;
	}

	public Motor getMotor() {
		return motor;
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

	public void setCondutor(Condutor novoCondutor) {
		this.condutor = novoCondutor;
	}

	public void setMotor(Motor novoMotor) {
		this.motor = novoMotor;
	}

	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}

}