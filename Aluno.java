package heranca_pessoa;
public class Aluno extends Pessoa{ //herança para diferença... especialização de pessoa
          private int matricula;
          private String curso;
          
          public void pagarMensalidade(){//se tivesse um metodo final antes de void, ele n poderia ser sobreposto,
                    System.out.println("pagando mensalidade de aluno " +this.nome); // se a classe pessoa n tivesse com os atributos em 'protect' e sim 'privado', não daria pra colocar nome, e sim getNome
          }

          public int getMatricula() {
                    return matricula;
          }

          public void setMatricula(int matricula) {
                    this.matricula = matricula;
          }

          public String getCurso() {
                    return curso;
          }

          public void setCurso(String curso) {
                    this.curso = curso;
          }
          

          public String statusAluno() {
                    return "Aluno{" + "matricula=" + matricula + ", curso=" + curso +"\n------------------------------------------------------------"+'}';
          }
          
          
          
          
}
