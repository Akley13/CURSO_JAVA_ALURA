public class TesteCondicional2 {
    public static void main(String[] args) {
		System.out.println("TESTANDO CONDICIONAIS");
		int idade = 18;

        
        boolean  acompanhado = true; // boolean só aceita true or false
		if (idade >= 18 && acompanhado) { // ||ou   &&e 
			System.out.println("SEJA BEM-VINDO!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
