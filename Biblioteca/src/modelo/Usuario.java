package modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Usuario {
	

    private String nome;

    private long cpf;

    private String endereco;

    
    private ArrayList<Livro> objetosADevolver =  new ArrayList<>();

    public Usuario(String nome, long cpf) {

        this.nome = nome;

        this.cpf = cpf;
    }

    public long getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        return;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
        return;
    }

    public void devolverLivro( Livro livro) {
        objetosADevolver.remove(livro);
        return;
    }

    public void emprestarLivro (Livro livro) {
        objetosADevolver.add(livro);
        return;
    }

    public boolean possuiObjeto (Object obj){
        if(objetosADevolver.contains(obj)){
            return true;
        }else{
            return false;
        }
    }
     public int getObjetosDevido() {
    	 return objetosADevolver.size();
    	 
 
    }
}
