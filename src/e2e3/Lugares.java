
package e2e3;

public class Lugares {
    public String nome;
    private String clima;
    public boolean disponibilidade;
    public String pais;
    
    // COMEÇO METODOS //
    
    public void viajar(){
        
    }    
    public void alugar(){
        
    }   
    private void comprar(){
        
    }
    public void conhecer(){
        
    } 
    // FIM METODOS // 
    //////////////////////////////////////////////////////
    // COMEÇO ATRIBUTOS//
    public String getNome() {
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getClima() {
        return clima;
    }   
    public void setClima(String c){
        this.clima = c;
    }
    public boolean getDisponibilidade() {
        return disponibilidade;
    }
        public void setDisponibilidade(boolean d){
        this.disponibilidade = d;
    }
    public String getPais() {
        return pais;
    }    
    public void setPais(String p){ 
        this.pais = p;
    }
    
    
    public void status(){
        System.out.println("A cidade de " + this.getNome() );
        System.out.print("Está disponivel? " + this.getDisponibilidade() + " ");
        
    }    
    // FIM ATRIBUTOS // 


}
