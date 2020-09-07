
package e2e3;

public class Pessoa {
    public String nome;
    public int idade;
    public String nacionalidade;
    private String estadoCivil;
    public boolean vivo;

    public void cumprimentar(){
        
    }
    
    public void conversar(){
        
    }
    
    public void expulsar(){
        
    }
    
    public void conhecer(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    
    
    public Pessoa(String nome, int idade, String nacionalidade, String estadoCivil, boolean vivo) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.estadoCivil = estadoCivil;
        this.vivo = vivo;
    }
    
    
}

