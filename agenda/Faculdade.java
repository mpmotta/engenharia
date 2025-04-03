package agenda;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class Faculdade extends Contato{
    private ArrayList<Faculdade> alunos;

    // Construtor sem parâmetros
    public Faculdade() {
        this.alunos = new ArrayList<>();
    }

    //com parametros
    public Faculdade(String nome, String fone, String email) {
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
        Faculdade novoContato = new Faculdade(nome, fone, email);
        alunos.add(novoContato);
        System.out.println("Contato adicionado com sucesso!");
    }
    
    public void removerContato(int num){
        int pos = num - 1;
        alunos.remove(pos);
        System.out.println("Contato removido com sucesso!");
    }
    public void editarContato(int num, String nome, String fone, String email) {
        Faculdade novoContato = new Faculdade(nome, fone, email);
        alunos.add(num, novoContato);
        int pos = num - 1;
        alunos.remove(pos);
        System.out.println("Contato editado com sucesso!");
    }
    
    public void verLista() {
        if (alunos.isEmpty()){
            System.out.println("A lista de contatos está vazia.");
        } else {
            int i = 1;
            for (Faculdade aluno : alunos) {
                System.out.print((i++) + " - ");
                System.out.println(aluno);
            }
        }
    }
    
    public String exibirJSON() {
        JSONArray jsonArray = new JSONArray();
        for (Faculdade aluno : alunos) {
            JSONObject jsonContato = new JSONObject();
            jsonContato.put("nome", aluno.getNome());
            jsonContato.put("fone", aluno.getFone());
            jsonContato.put("email", aluno.getEmail());
            jsonArray.put(jsonContato);
        }
        return jsonArray.toString(4); 
    }   

}
