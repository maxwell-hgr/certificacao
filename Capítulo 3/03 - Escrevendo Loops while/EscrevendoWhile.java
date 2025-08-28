
public class EscrevendoWhile {
	
	public static void main(String[] args){
		int contador = 0;
		while (contador < 10) {
		    double preco = contador * 10;
		    System.out.println(preco);
		    contador++;
		}

		for (var contador = 4; contador >= 0; contador--) {
		   System.out.print(contador + " ");
		}
	}

	int espacoNaBarriga = 5;
	public void comerQueijo(int pedacosDeQueijo) {
	    while (pedacosDeQueijo > 0 && espacoNaBarriga > 0) {
	        pedacosDeQueijo--;
	        espacoNaBarriga--;
	    }
	    System.out.println(pedacosDeQueijo 
	    	+ " pedaços de queijo restantes");
	}
}
