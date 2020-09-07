
package e2e3;

public class InstrumentoMusical {
    public String tipo;
    public String nome;
    public String tamanho;
    public double peso;
    public String cor;

    
    public void tocar(){
    
    }
    
    public void afinar(){
    
    }
    
    private void vender(){
    
    }
    
    public void limpar(){
    
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    
    public InstrumentoMusical(String tipo, String nome, String tamanho, double peso, String cor) {
        this.tipo = tipo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.peso = peso;
        this.cor = cor;
    }

    
    


}