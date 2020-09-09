
package e2e3;
public class E2e3 {
    public static void main(String[] args) {
        // ALUNOS FATEC INICIO //
        AlunoFatecSJC[] Alu = new AlunoFatecSJC[5];
        Alu[0] = new AlunoFatecSJC("Mateus Senne", 0001, 10, "Banco de Dados", true);
        Alu[1] = new AlunoFatecSJC("Benito M.", 0002, 9, "Adm", true);
        Alu[2] = new AlunoFatecSJC("Karl M.", 0003, 0, "Sociologia", false);
        Alu[3] = new AlunoFatecSJC("Luciano H.", 0004, 7.6, "Publicidade", true);
        Alu[4] = new AlunoFatecSJC("Ayrton S.", 0005, 10, "Mecânica", true);
        // ALUNOS FATEC FIM //
        
        // CALÇADOS INICIO //
        Calçado[] Cal = new Calçado[5];
        Cal[0] = new Calçado("Sapato", 42, "Preto", "Prada", 300.00);
        Cal[1] = new Calçado("Chinelo", 38, "Branco", "Havaianas", 5000.01);
        Cal[2] = new Calçado("Tênis", 44, "Colorido", "Mizuno", 10.20);
        Cal[3] = new Calçado("Chinelo", 35, "Verde", "Pé de Moça", 100.0);
        Cal[4] = new Calçado("Tênis", 44, "Branco", "Jordan", 10.20);
        // CALÇADOS FIM //
        
        // INSTRUMENTOS INICIO //
        InstrumentoMusical[] Inst = new InstrumentoMusical[5];
        Inst[0] = new InstrumentoMusical("Cordas", "Violão", "Grande", 10.00, "Preto");
        Inst[1] = new InstrumentoMusical("Sopro", "Flauta", "Pequena", 1.00, "Branco");
        Inst[2] = new InstrumentoMusical("Percussão", "Bateria", "Muito Grande", 30.00, "Azul");
        Inst[3] = new InstrumentoMusical("Sopro", "Clarinete", "Médio", 5.00, "Dourado");
        Inst[4] = new InstrumentoMusical("Percussão", "Bumbo", "Grande", 8.00, "Verde");
        // INSTRUMENTOS FIM //
        
        // LUGARES INICIO ///
        Lugar[] Lug = new Lugar[5];
        Lug[0] = new Lugar("Cascatinha", "Quente", true, "Brasil", "Portugues");
        Lug[1] = new Lugar("Predappio", "Frio", true, "Itália", "Italiano");
        Lug[2] = new Lugar("Havana", "Quente", false, "Cuba", "Castelhano");
        Lug[3] = new Lugar("Taubaté", "Frio", true, "Brasil", "Portugues");
        Lug[4] = new Lugar("Acre", "Quente", false, "Brasil", "Portugues");
        // LUGARES FIM ///
        
        // PESSOA INICIO ///
        Pessoa[] Pes = new Pessoa[5];
        Pes[0] = new Pessoa("Codreanu", 25, "Romeno", "Casado", true);
        Pes[1] = new Pessoa("Arthur", 30, "Inglês", "Viúvo", true);
        Pes[2] = new Pessoa("Setim", 25, "Brasileiro", "Solteiro", false);
        Pes[3] = new Pessoa("Ana", 22, "Brasileiro", "Solteiro", true);
        Pes[4] = new Pessoa("Clayton", 32, "Sul-Africano", "Solteiro", true);
        // PESSOA FIM //        
        // PROFISSIONAL INICIO //
        Profissional[] Prof = new Profissional[5];
        Prof[0] = new Profissional("Jailson","Empresário",40,"Auto Peças DLC", 8000.00);
        Prof[1] = new Profissional("Guina","Mecânico",34,"Oficina Qualy", 10.00);
        Prof[2] = new Profissional("Bia","E-Atleta",20,"NCDSQAME", 99999.99);
        Prof[3] = new Profissional("Augusto","Sorveteiro",14,"Gela Boca", 101.00);
        Prof[4] = new Profissional("Maria","Medica",33,"Hospital Bom Retiro", 1031.00);
        // PROFISSIONAL FIM //        
        // TESTES INICIO //
        //TESTE ALUNO INICIO//
        System.out.println("-- Alunos --");
        for(int i=0;i <5; i++){
            System.out.println("O aluno " + Alu[i].getNome() + " é do curso de " + Alu[i].getCurso() + " ficou com média: " + Alu[i].getNota());
        }
        //TESTE ALUNO FIM //        
        //TESTE CALÇADO INICIO//
        System.out.println("-- Calçados --");
        for(int i=0;i <5; i++){
            System.out.println("O " + Cal[i].getModelo() + " é da marca " + Cal[i].getMarca() + " e seu tamanho é " + Cal[i].getTamanho() );
        }
        //TESTE CALÇADO FIM //        
        //TESTE INSTRUMENTO E PESSOA INICIO//
        System.out.println("-- Instrumentos & Pessoa --");
        for(int i=0;i <5; i++){
            System.out.println(Pes[i].getNome() + " toca um " + Inst[i].getNome() + " " + Inst[i].getCor() );
        }
        //TESTE INSTRUEMNTO E PESSOA FIM //
        // TESTE LUGAR E PROFISSÃO INICIO //
        System.out.println("-- Profissionais e Lugares --");
        for(int i=0;i <5; i++){
            System.out.println(Prof[i].getNome() + " é " + Prof[i].getCargo() + " e trabalha na empresa " + Prof[i].getEmpresa() + " na cidade de " + Lug[i].getNome());
        }
        // TESTE LUGAR E PROFISSÃO FIM //
        // TESTE FIM//
    
    
    
    
    
    }
}
