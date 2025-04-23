import java.util.Scanner;

public class MainCarro {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Carro carro = new Carro("aaa1111", "unoMille", 1996, pessoa.nome, motor.potencia);
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
		scan.close();
	}

	public static void Menu() {
		System.out.println("1 - acelerar");
		System.out.println("2 - freiar");
		System.out.println("3 - abastecer");
		System.out.println("4 - sair");
	}


	public static void print(Carro carro) {

		String placa, modelo;
		int ano;
		modelo = carro.getModelo();
		placa = carro.getPlaca();
		ano = carro.getAno();
		System.out.println("carro: " + modelo);
		System.out.println("placa: " + placa);
		System.out.println("ano: " + ano);

	}
}

