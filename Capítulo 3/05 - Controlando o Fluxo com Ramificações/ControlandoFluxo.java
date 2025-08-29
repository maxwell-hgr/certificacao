
public class ControlandoFluxo {
	public static void main(String... args){
		int hipopotamoComRaiva = 8;
		while(hipopotamoComRaiva>0) {
			do {
		        hipopotamoComRaiva -= 2;
		    } while (hipopotamoComRaiva>5);
		    hipopotamoComRaiva--;
		    System.out.print(hipopotamoComRaiva+", ");
		}
		int[][] arrayComplexo = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		LOOP_EXTERNO: for(int[] arraySimples : arrayComplexo) {
			LOOP_INTERNO: for(int i=0; i<arraySimples.length; i++) {
		        System.out.print(arraySimples[i]+"\t");
		    }
		    System.out.println();
		}
	}
}