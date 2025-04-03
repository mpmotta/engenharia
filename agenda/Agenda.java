package agenda;

public class Agenda {
    public static void main(String[] args) {
        Familia familia = new Familia();
        familia.adicionarContato("João da Silva", "84074070", "jsilva@gmail.com");
        familia.adicionarContato("Maria dos Santos", "99666668", "marias@gmail.com");
        familia.adicionarContato("Pedro Pedreira", "98754466", "ppedreira@gmail.com");
        familia.verLista();
       
        
     System.out.println(familia.exibirJSON());
     
     
        Trabalho trabalho = new Trabalho();
        trabalho.adicionarContato("Julio Carnevale", "32666669", "jcar@senacrs.edu.br");
        trabalho.verLista();
        
        System.out.println(trabalho.exibirJSON());
        
        
        Faculdade faculdade = new Faculdade();
        faculdade.adicionarContato("Marcio Motta", "36547888", "marcio@outlook.com");
     
        faculdade.verLista();
        
        System.out.println(faculdade.exibirJSON());
    }
}
