package agenda;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class Trabalho extends Contato{
    private ArrayList<Trabalho> colegas;

    // Construtor sem parâmetros
    public Trabalho() {
        this.colegas = new ArrayList<>();
    }

    //com parametros
    public Trabalho(String nome, String fone, String email) {
        super.nome = nome;
        super.fone = fone;
        super.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + " - Telefone: " + fone + " - Email: " + email;
    }
    
    // Métodos personalizados
    public void adicionarContato(String nome, String fone, String email) {
        Trabalho novoContato = new Trabalho(nome, fone, email);
        colegas.add(novoContato);
        System.out.println("Contato adicionado com sucesso!");
    }
    
    public void removerContato(int num){
        int pos = num - 1;
        colegas.remove(pos);
        System.out.println("Contato removido com sucesso!");
    }
    public void editarContato(int num, String nome, String fone, String email) {
        Trabalho novoContato = new Trabalho(nome, fone, email);
        colegas.add(num, novoContato);
        int pos = num - 1;
        colegas.remove(pos);
        System.out.println("Contato editado com sucesso!");
    }
    
    public void verLista() {
        if (colegas.isEmpty()){
            System.out.println("A lista de contatos está vazia.");
        } else {
            int i = 1;
            for (Trabalho colega : colegas) {
                System.out.print((i++) + " - ");
                System.out.println(colega);
            }
        }
    }
    
    public String exibirJSON() {
        JSONArray jsonArray = new JSONArray();
        for (Trabalho colega : colegas) {
            JSONObject jsonContato = new JSONObject();
            jsonContato.put("nome", colega.getNome());
            jsonContato.put("fone", colega.getFone());
            jsonContato.put("email", colega.getEmail());
            jsonArray.put(jsonContato);
        }
        return jsonArray.toString(4); 
    }   

}
