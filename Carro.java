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

	public Carro(String marca, String placa, String modelo, int ano, Motor motor) {
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.motor = motor;
	}
	
	public Carro(String marca, String placa, String modelo, int ano, Condutor condutor) {
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.condutor = condutor;
	}

	public Carro(String marca, String placa, String modelo, int ano) {
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
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

	public String toString() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa +
			   "\nMotor: " + (motor != null ? motor.getTipo() + " " + motor.getPotencia() : "Sem motor") +
			   "\nCondutor: " + (condutor != null ? condutor.getNome()+ " " + condutor.getCnh() : "Sem condutor");
	}
}