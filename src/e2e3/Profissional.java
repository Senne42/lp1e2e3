
package e2e3;

public class Profissional {
    public String nome;
    private String cargo;
    public int idade;
    public String empresa;
    private double salario;
    

    public void contratar(){
        
    }

    public void demitir(){
        
    }
    
    public void promover(){
        
    }
    
    public void transferir(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Profissional(String nome, String cargo, int idade, String empresa, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.empresa = empresa;
        this.salario = salario;
    }
    
    
}



