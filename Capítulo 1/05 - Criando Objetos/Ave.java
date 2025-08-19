public class Ave {  
    private String nome = "Falcão";  
    { System.out.println("Setando campo"); }  
    public Ave() {  
        nome = "Pequeno";  
        System.out.println("Setando construtor");  
    }  
    public static void main(String[] args) {  
        Ave ave = new Ave();  
        System.out.println(chick.nome);  
    }  
}


class Cisne {
    int numeroDeOvos; // Variável de instância
    public static void main(String[] args){
        Cisne mae = new Cisne();
        mae.numeroDeOvos = 1; // Define a variável
        System.out.println(mae.numeroDeOvos); // Lê a variável
    }
}

class Nome {  
    String primeiro = "Teodoro";  
    String ultimo = "Alce";  
    String completo = primeiro + ultimo;  
}

class Passaro {  
    public static void main(String[] args) {  
        { System.out.println("Penas"); }  
    }  
    { System.out.println("Nevado"); }  
}

