
package e2e3;

public class AlunoFatecSJC {
    public String nome;
    public int ra;
    public double nota;
    public String curso;
    public boolean aprovado;

    // ----------------------------------------------------- //
    
    private void matricular(){
        
    }
    
    private void expulsar(){
        
    }
   
    public void aprovar(){
        
    }
    
    public void transferir(){
        
    }
 
    // ----------------------------------------------------- //
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    // ----------------------------------------------------- //

    public AlunoFatecSJC(String nome, int ra, double nota, String curso, boolean aprovado) {
        this.nome = nome;
        this.ra = ra;
        this.nota = nota;
        this.curso = curso;
        this.aprovado = aprovado;
    }
    
}
