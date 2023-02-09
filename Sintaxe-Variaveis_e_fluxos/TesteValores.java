public class TesteValores {
    public static void main(String[] args) {
        int primeiro = 5;
		int segundo = 10;
		segundo = primeiro;
		primeiro = 10;
		
		// quanto vale o segundo ?
		
		System.out.print(segundo); // vale 5


		
		//PODEMOS CONCATENAR STRINGS COM INT OU OUTRAS VARIÁVEIS.
		int ano = 2023;
		String frase = "Hello World ";
		System.out.print(frase + ano + "!");
    }
}
