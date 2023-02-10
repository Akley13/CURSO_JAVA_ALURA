public class TesteEscopo {
	public static void main(String[] args) {
		System.out.println("TESTANDO CONDICIONAIS");
		int idade = 19;
		int quantidadePessoas = 2;

        boolean acompanhado;
        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("Valor da Companhia: " + acompanhado);

        if (idade >= 18) {
            System.out.println("AUTORIZADO para ENTRAR!");
        }

		if (idade >= 18 && acompanhado) {
			System.out.println("Autorizado para ENTRAR!");
			System.out.println("SEJA BEM-VINDO!");
		} else {
			if (idade < 18 && quantidadePessoas > 1) {
				System.out.println("Você não tem 18, mas está acompanhado, pode entrar.");
			} else {
                if (idade < 18 && quantidadePessoas == 1) {
				    System.out.println("Infelizmente você não pode entrar.");
                }
			}
		}
	}
}