package heranca_pessoa;

public class Professor extends Pessoa{
          private String especialidade;
          private int salario;
          
          public void receberSalario(int r){
                    this.setSalario(this.getSalario() +r);
                    System.out.println("seu salario é: "+(salario - r));
                    System.out.println("voce vai receber no salario a mais: "+ r);
          }

          public String getEspecialidade() {
                    return especialidade;
          }

          public void setEspecialidade(String especialidade) {
                    this.especialidade = especialidade;
          }

          public int getSalario() {
                   return salario;
          }

          public void setSalario(int salario) {
                    this.salario = salario;
          }

          public String statusProfessor() {
                    return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario +"\n------------------------------------------------------------"+'}';
          }
          
          
          
}
