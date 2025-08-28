
public class AplicandoSwitch {
	public static void main(String[] args) {
		int mes = 5;
		switch mes { // Não compila
		    case 1: System.out.print("Janeiro");
		}
		switch(mes) // Não compila
		    case 1: System.out.print("Janeiro");
		switch(mes) {
		    case 1: 2: System.out.print("Janeiro"); // Não compila
		}

		int peixe = 5;
		int tamanho = 12;
		var nome = switch(peixe) {
		    case 1 -> "Nemo";
		    case 2 -> {yield "Dori";}
		    case 3 -> {
		        if(tamanho > 10) yield "Baiacu";
		        else yield "Verde";
		    }
		    default -> "Tubarão";
		};

enum Estacao {INVERNO, PRIMAVERA, VERAO, OUTONO}
String getTempo(Estacao valor) {
    return switch(valor) {
        case INVERNO -> "Frio";
        case PRIMAVERA -> "Chuvoso";
        case VERAO -> "Quente";
        case OUTONO -> "Ameno";
    };
}


	}

	public void imprimeDiaDaSemana(int dia) {
	    if(dia == 0)
	        System.out.print("Domingo");
	    else if(dia == 1)
	        System.out.print("Segunda-feira");
	    else if(dia == 2)
	        System.out.print("Terça-feira");
	    else if(dia == 3)
	        System.out.print("Quarta-feira");
	}

	final int getBiscoitos() { return 4; }
	void alimentarAnimais() {
	    final int bananas = 1;
	    int macas = 2;
	    int numeroDeAnimais = 3;
	    final int biscoitos = getBiscoitos();
	    switch(numeroDeAnimais) {
	        case bananas:
	        case macas: // Não compila
	        case getBiscoitos(): // Não compila
	        case biscoitos: // Não compila
	        case 3 * 5:
	    }
	}


}