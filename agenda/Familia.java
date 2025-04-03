package agenda;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class Familia extends Contato{
    private ArrayList<Familia> contatos;

    // Construtor sem parâmetros
    public Familia() {
        this.contatos = new ArrayList<>();
    }

    //com parametros
    public Familia(String nome, String fone, String email) {
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
        Familia novoContato = new Familia(nome, fone, email);
        contatos.add(novoContato);
        System.out.println("Contato adicionado com sucesso!");
    }
    
    public void removerContato(int num){
        int pos = num - 1;
        contatos.remove(pos);
        System.out.println("Contato removido com sucesso!");
    }
    public void editarContato(int num, String nome, String fone, String email) {
        Familia novoContato = new Familia(nome, fone, email);
        contatos.add(num, novoContato);
        int pos = num - 1;
        contatos.remove(pos);
        System.out.println("Contato editado com sucesso!");
    }
    
    public void verLista() {
        if (contatos.isEmpty()){
            System.out.println("A lista de contatos está vazia.");
        } else {
            int i = 1;
            for (Familia contato : contatos) {
                System.out.print((i++) + " - ");
                System.out.println(contato);
            }
        }
    }
    
    public String exibirJSON() {
        JSONArray jsonArray = new JSONArray();
        for (Familia contato : contatos) {
            JSONObject jsonContato = new JSONObject();
            jsonContato.put("nome", contato.getNome());
            jsonContato.put("fone", contato.getFone());
            jsonContato.put("email", contato.getEmail());
            jsonArray.put(jsonContato);
        }
        return jsonArray.toString(4); 
    }   

}
