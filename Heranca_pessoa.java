package heranca_pessoa;
public class Heranca_pessoa {

          public static void main(String[] args) {
//                    Pessoa p1 = new Pessoa();             não pode ser instanciado pq é uma classe abstrata
                    Visitante v1 = new Visitante();
                    Aluno a1 = new Aluno();
                    Bolsista b1 = new Bolsista();
                    Professor p1 = new Professor();
                    Tecnico t1 = new Tecnico();
                    
                    v1.nome = "fernando"; v1.idade = 15; v1.sexo = "M";
                    
                    a1.nome = "William"; a1.idade = 25; a1.sexo = "M"; a1.pagarMensalidade(); a1.setMatricula(1212); a1.setCurso("TI");
                    System.out.println(a1.statusAluno());
                    
                    b1.nome = "Larissa"; b1.idade = 24; b1.sexo = "F"; b1.setBolsa(350); b1.renovarBolsa(); b1.pagarMensalidade();
                    System.out.println(b1.statusBolsista());
                    
                    p1.nome = "Tony"; p1.idade = 45; p1.sexo = "Emafrodita"; p1.setEspecialidade("prof TI"); p1.setSalario(2000); 
                    p1.receberSalario(250);
                    System.out.println(p1.statusProfessor());
                    
                    t1.nome = "Wesley"; t1.idade = 30; t1.sexo = "M"; t1.setRegistroProfissional(2424); t1.pratica();
                    System.out.println(t1.statusTecnico());
                    
                    System.out.println(v1.statusGeral());
                    System.out.println(a1.statusGeral());
                    System.out.println(b1.statusGeral());
                    System.out.println(p1.statusGeral());
                    System.out.println(t1.statusGeral());
                    
                    
                    
                    
                    

          }
          
}
