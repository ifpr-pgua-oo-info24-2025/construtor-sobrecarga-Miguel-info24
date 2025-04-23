import java.util.Scanner;

public class MainCarro {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Carro carro = new Carro( "fiat", "aaa1111", "unoMille", 1996, null, null);
		int op = 0;
		while (op != 3) {
			Menu();
			op = scan.nextInt();
			scan.nextLine();
			op_menu(op, carro);

		}
		scan.close();

	}

	public static void Menu() {
		System.out.println("1 - cadastrar carro");
		System.out.println("2 - imprimir carro");
		System.out.println("3 - sair");
	}

	public static void op_menu(int op, Carro carro) {
		switch (op) {
			case 1:
				cadastrar();
				break;
			case 2:
				
				print(carro);
			case 3:
				alterar(carro);
				break;
			case 4:
				System.out.println("saindo");
				break;
			default:
				System.out.println("opcao invalida");
		}
	}

	public static void cadastrar() {
		Condutor condutor = new Condutor("miguel", 1234);
		Motor motor = new Motor("de 15", 100);
		Carro carro = new Carro("fiat", "aaa1111", "unoMille", 1996, condutor, motor);
		
		System.out.println("cadastrando carro");


		System.out.println("digite a marca do carro");
		String marca = scan.next();
		carro.setMarca(marca);

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


		System.out.println("Condutor:");
		String nome = scan.next();
		condutor.setNome(nome);

		System.out.println("CNH:");
		int cnh = scan.nextInt();
		condutor.setCnh(cnh);


		System.out.println("Motor:");
		String tipo = scan.next();
		motor.setTipo(tipo);

		System.out.println("Potencia:");
		int potencia = scan.nextInt();
		motor.setPotencia(potencia);


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
	public static void alterar(Carro carro)
	{

	}
}