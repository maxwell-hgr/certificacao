
public class BlocoDeTexto {
	String bloco = """
		 "camelo\"\"\"
		 \"dromedário\"""
		""";
	public static void main(String[] args){
		System.out.println("*" + new BlocoDeTexto().bloco + "*");
	}
}