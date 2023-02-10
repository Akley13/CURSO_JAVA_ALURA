public class TesteCondicional {
    public static void main(String[] args) {
		System.out.println("TESTANDO CONDICIONAIS");
		int idade = 15;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
			System.out.println("SEJA BEM-VINDO!");
		} else {
			if (quantidadePessoas <= 2) {
				System.out.println("Você não tem 18, mas está acompanhado, pode entrar.");
			} else {
				System.out.println("Infelizmente você não pode entrar.");
			}
		}
	}
}
