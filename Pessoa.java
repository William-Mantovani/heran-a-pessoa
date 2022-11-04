package heranca_pessoa;

public abstract class  Pessoa { //com os tipos de visibilidade protegido, somente os herdados podem mexer
          protected String nome;
          protected int idade;
          protected String sexo;
          
          public void fazerAniv(){
                    this.idade++;
          }

          public String getNome() {
                    return nome;
          }

          public void setNome(String nome) {
                    this.nome = nome;
          }

          public int getIdade() {
                    return idade;
          }

          public void setIdade(int idade) {
                    this.idade = idade;
          }

          public String getSexo() {
                    return sexo;
          }

          public void setSexo(String sexo) {
                    this.sexo = sexo;
          }
          public String statusGeral() {
                    return "Cadastro: " + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
          }
          
          
}
