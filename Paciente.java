package projeto3a;

public class Paciente {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	public Paciente() {
		
	}

	public Paciente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		return "\nNome: " + nome +"\nCPF: " + cpf +"\nEnderešo: "+ endereco +"\n---------------";
	}
	
}
