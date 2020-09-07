
package e2e3;

public class Calçado {
    public String modelo;
    public int tamanho;
    public String cor;
    public String marca;
    public double valor;
    
    // COMEÇO METODOS //
    
    public void calçar(){
        
    }    
    public void comprar(){
        
    }   
    private void limpar(){
        
    }
    public void vender(){
        
    } 
    // FIM METODOS // 
    //////////////////////////////////////////////////////
    // COMEÇO ATRIBUTOS//
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public int getTamanho() {
        return tamanho;
    }   
    public void setTamanho(int t){
        this.tamanho = t;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public String getMarca() {
        return marca;
    }    
    public void setMarca(String ma){ 
        this.marca = ma;
    }   

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    

    public Calçado(String modelo, int tamanho, String cor, String marca, double valor) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
        this.valor = valor;
    }
    
}