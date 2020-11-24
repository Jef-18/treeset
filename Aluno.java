public class Aluno {
	
	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return " [ " + this.nome + " , " + this.cpf + " ] ";
	}

  //Tree set depende do compareTo :

  @Override
  public compareto(Aluno outro_obj) {
    return this.nome.compareTo(outro_ob.nome);
  }

}
