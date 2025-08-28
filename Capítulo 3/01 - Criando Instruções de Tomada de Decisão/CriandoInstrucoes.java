
public class CriandoInstrucoes {
	public static void main(String... args) {
		if(horaDoDia < 11) {
		    System.out.println("Bom Dia");
		} else System.out.println("Boa Tarde");
	}

	void comparaInteiros(Number numero) {
    	if(numero instanceof Integer) {
       		Integer dado = (Integer)numero;
       		System.out.print(dado.compareTo(5));
    	}
	}

	void comparaInteiros(Number numero) {
		if(numero instanceof Integer dado) {
	   		System.out.print(dado.compareTo(5));
		}
	}

	void imprimeInteirosMaioresQue5(Number numero) {
    	if(numero instanceof Integer dado && dado.compareTo(5) > 0)
       		System.out.print(dado);
	}
}