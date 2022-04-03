public class Quarto {
	
	private String nome;
	private String email;
	private int numero_quarto;
	
	public Quarto(String nome, String email, int numero_quarto) {
		this.nome = nome;
		this.email = email;
		this.numero_quarto = numero_quarto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumero_quarto() {
		return numero_quarto;
	}
	public void setNumero_quarto(int numero_quarto) {
		this.numero_quarto = numero_quarto;
	} 

}