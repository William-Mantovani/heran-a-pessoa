package heranca_pessoa;

public class Tecnico extends Aluno{
          private int registroProfissional;
          
          public void pratica(){
                    System.out.println("pratica de ferramenta");
          }

          public int getRegistroProfissional() {
                    return registroProfissional;
          }

          public void setRegistroProfissional(int registroProfissional) {
                    this.registroProfissional = registroProfissional;
          }

          public String statusTecnico() {
                    return "Tecnico{" + "registroProfissional=" + registroProfissional + "\n------------------------------------------------------------"+'}';
          }
          
          
          
}
