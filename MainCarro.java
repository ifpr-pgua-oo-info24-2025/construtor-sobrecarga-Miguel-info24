import java.util.Scanner;

public class MainCarro {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Carro carro = new Carro();
		int op = 0;

		System.out.println("cadastrando carro");
		System.out.println("digite a placa do carro");
		String placa = scan.next();
		carro.setPlaca(placa);
		System.out.println("Modelo:");
		String modelo = scan.next();
		carro.setModelo(modelo);
		System.out.println("Ano:");
		int Ano = scan.nextInt();
		scan.nextLine();
		carro.setAno(Ano);
		System.out.println("Capacidade maxima de combustivel");
		int capMaxComb = scan.nextInt();
		carro.setMax(capMaxComb);

		while (op != 4) {
			Menu();
			op = scan.nextInt();
			scan.nextLine();
			opMenu(op, carro);
			print(carro);
		}

		scan.close();
	}

	public static void Menu() {
		System.out.println("1 - acelerar");
		System.out.println("2 - freiar");
		System.out.println("3 - abastecer");
		System.out.println("4 - sair");
	}

	public static void opMenu(int op, Carro carro) {
		System.out.println("entrou2");

		switch (op) {
		case 1:
			carro.acelerar(scan);
			break;
		case 2:
			carro.freiar(scan);
			break;
		case 3:
			carro.abastecer();
			break;
		case 4:
			System.out.println("saindo...");
			System.exit(0);
            break;
		default:
			System.out.println("erro!!!");
			break;
		}
	}

	public static void print(Carro carro) {

		String placa, modelo;
		int ano, maxComb, combDisp, vel;
		modelo = carro.getModelo();
		placa = carro.getPlaca();
		ano = carro.getAno();
		maxComb = carro.getMax();
		combDisp = carro.getComb();
		vel = carro.getVel();
		System.out.println("carro: " + modelo);
		System.out.println("placa: " + placa);
		System.out.println("ano: " + ano);
		System.out.println("Maximo de Combustivel: " + maxComb);
		System.out.println("combustivel disponivel: " + combDisp);
		System.out.println("velocidade: " + vel);

	}
}

