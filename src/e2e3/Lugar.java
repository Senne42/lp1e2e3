
package e2e3;

public class Lugar {
    public String nome;
    private String clima;
    public boolean disponibilidade;
    public String pais;
    public String idioma;
    
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    // FIM ATRIBUTOS // 

    public Lugar(String nome, String clima, boolean disponibilidade, String pais, String idioma) {
        this.nome = nome;
        this.clima = clima;
        this.disponibilidade = disponibilidade;
        this.pais = pais;
        this.idioma = idioma;
    }
   
    
    
}
