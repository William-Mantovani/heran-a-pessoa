package heranca_pessoa;
public class Bolsista extends Aluno{ // mas tambem extends pessoa //herança para diferença... especialização de aluno
          private int bolsa;
          
          public void renovarBolsa(){
                    System.out.println("renovando bolsa de " +this.nome);
          }
          @Override
          public void pagarMensalidade(){
                    System.out.println(this.nome +" é bolsita, pagamento facilitado da mensalidade");
          }

          public int getBolsa() {
                    return bolsa;
          }

          public void setBolsa(int bolsa) {
                    this.bolsa = bolsa;
          }

          public String statusBolsista() {
                    return "Bolsista{" + "bolsa=" + bolsa + "\n------------------------------------------------------------"+'}';
          }
          
          
          
}
