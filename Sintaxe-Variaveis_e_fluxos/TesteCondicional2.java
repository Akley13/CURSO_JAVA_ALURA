public class TesteCondicional2 {
    public static void main(String[] args) {
		System.out.println("TESTANDO CONDICIONAIS");
		int idade = 15;
		int quantidadePessoas = 3;
		if (idade >= 18 || quantidadePessoas >=2) { // ||ou   &&e 
			System.out.println("SEJA BEM-VINDO!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
