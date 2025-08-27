
public class ComparandoValores {
	boolean macaco = true == 3; // Não compila
	boolean simio = false != "César"; // Não compila 
	boolean gorila = 10.2 == "Chico"; // Não compila

	public void abreZoo(Number hora) {
	    if (hora instanceof Integer)
	        System.out.print((Integer)hora + " em ponto!");
	    else
	        System.out.print(hora);

		if(pato != null && pato.getIdade() < 5) {
			// Faça algo
		}
	}
}