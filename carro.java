import java.util.Scanner;
class Carro {

	private String placa;
	private String modelo;
	private int ano;
	private int vel = 0;
	private int capMaxComb = 200;
	private int quantComb = capMaxComb;

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public int getVel() {
		return vel;
	}

	public int getComb() {
		return quantComb;
	}

	public int getMax() {
		return capMaxComb;
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

	public void setVel(int novaVel) {
		this.vel = novaVel;
	}

	public void setComb(int novoQuantComb) {
		this.quantComb = novoQuantComb;
	}

	public void setMax(int novoMax) {
		this.capMaxComb = novoMax;
	}

	public void acelerar(Scanner scan) {
		int aceleracao = 10, comb = 10;
        System.out.println("digite a velocidade.");
        aceleracao = scan.nextInt();
		aceleracao *= 0.1;
        int vel = getVel();
        vel += aceleracao;
		setVel(vel);
		comb = getComb();
		int aux = comb;
        aux /= 0.01;
        comb -= aux;
		setComb(comb);
	}

	public void freiar(Scanner scan) {
		int freio = 0;
        System.out.println("digite o valor da frenagem.");
		freio *= -0.1;
		int vel = getVel();
        vel -= freio;
        setVel(vel);
	}

	public void abastecer() {
		int comb;
		comb = getMax();
		setComb(comb);
	}

}