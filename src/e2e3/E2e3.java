
package e2e3;
public class E2e3 {
    public static void main(String[] args) {
        // ALUNOS FATEC INICIO //
        AlunoFatecSJC[] Alu = new AlunoFatecSJC[3];
        Alu[0] = new AlunoFatecSJC("Mateus Senne", 0001, 10, "Banco de Dados", true);
        Alu[1] = new AlunoFatecSJC("Benito M.", 0002, 9, "Adm", true);
        Alu[2] = new AlunoFatecSJC("Carlos", 0003, 0, "Sociologia", false);
        // ALUNOS FATEC FIM //
        
        // CALÇADOS INICIO //
        Calçado[] Cal = new Calçado[3];
        Cal[0] = new Calçado("Social", 42, "Preto", "Prada", 300.00);
        Cal[1] = new Calçado("Chinelo", 38, "Branco", "Havaianas", 5000.01);
        Cal[2] = new Calçado("Tênis", 44, "Colorido", "Mizuno", 10.20);
        // CALÇADOS FIM //
        
        // INSTRUMENTOS INICIO //
        InstrumentoMusical[] Inst = new InstrumentoMusical[3];
        Inst[0] = new InstrumentoMusical("Cordas", "Violão", "Grande", 10.00, "Preto");
        Inst[1] = new InstrumentoMusical("Sopro", "Flauta", "Pequena", 1.00, "Branco");
        Inst[2] = new InstrumentoMusical("Percusão", "Bateria", "Muito Grande", 30.00, "Azul");
        // INSTRUMENTOS FIM //
        
        // LUGARES INICIO ///
        Lugares[] Lug = new Lugares[3];
        Lug[0] = new Lugares("Cascatinha", "Quente", true, "Brasil", "Portugues");
        Lug[1] = new Lugares("Predappio", "Frio", true, "Itália", "Italiano");
        Lug[2] = new Lugares("Havana", "Quente", false, "Cuba", "Castelhano");
        // LUGARES FIM ///
        
        // PESSOA INICIO ///
        Pessoa[] Pes = new Pessoa[3];
        Pes[0] = new Pessoa("Codreanu", 25, "Romeno", "Casado", true);
        Pes[1] = new Pessoa("Arthur", 30, "Inglês", "Viúvo", true);
        Pes[2] = new Pessoa("Setim", 25, "Brasileiro", "Solteiro", false);
        // PESSOA FIM ///
        
        // PROFISSIONAL INICIO ///
        Profissional[] Prof = new Profissional[3];
        Prof[0] = new Profissional("Jailson","Empresário",40,"Auto Peças DLC", 8000.00);
        Prof[1] = new Profissional("Guina","Mecânico",34,"Oficina Qualy", 10.00);
        Prof[2] = new Profissional("Bia","E-Atleta",20,"NCDOSQAME", 99999.99);
        // PROFISSIONAL FIM ///
    }
    
}
