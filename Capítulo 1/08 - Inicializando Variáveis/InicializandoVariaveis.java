
public class InicializandoVariaveis {
	public int valido() {
	    int y = 10;
	    // x é declarada aqui
	    int x; 
		// x é inicializada aqui
	    x = 3; 
		// z é declarada aqui, mas nunca inicializada ou usada
	    int z; 

	    int resposta = x + y;
	    return resposta;
	}

	public void encontraResposta(boolean check) {
	    int resposta;
	    int outraResposta;
	    int apenasUmaRamificacao;
	    if (check) {
	        apenasUmaRamificacao = 1;
	        resposta = 1;
	    } else {
	        resposta = 2;
	    }
	    System.out.println(resposta);
	    System.out.println(apenasUmaRamificacao); // Não compila
	}

	public void checaResposta() {
	    boolean valor;
	    encontraResposta(valor); // NÃO COMPILA
	}

	public void reatribuicao() {
		var numero = 7;
		numero = 4;
		numero = "cinco"; // Não compila
	}
}
