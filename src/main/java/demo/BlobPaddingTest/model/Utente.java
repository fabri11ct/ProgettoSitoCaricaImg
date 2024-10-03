package demo.BlobPaddingTest.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="utente")
public class Utente {
	@Column(name="idutente")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int idutente;
	 
	@Column(name="nome")
	private String nome;
	 
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password") 
	private String password;
	

	
	/*@OneToMany(mappedBy="utente",cascade= CascadeType.ALL )
	private List<Documento> documenti = new ArrayList<>();*/
	 
	 public Utente(int idutente, String nome, String cognome, String email, String password) {
		super();
		this.idutente = idutente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;

	}


	public Utente(String nome, String cognome, String email, String password) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		
		
	}
	
	//serve per i metodi elimina e seleziona
	public Utente() {}

	public int getIdutente() {
		return idutente;
	}


	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}





	@Override
	public int hashCode() {
		return Objects.hash(cognome, email, idutente, nome, password);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(email, other.email)
				&& idutente == other.idutente && Objects.equals(nome, other.nome)
				&& Objects.equals(password, other.password);
	}


	@Override
	public String toString() {
		return "Utente [idutente=" + idutente + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
				+ ", password=" + password + "]";
	}
	 
	 
}