package demo.BlobPaddingTest.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "immagine")
public class Immagine {
 	
	@Column(name="idimmagine")
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 	private int id;
	
	@Column(name="img")
	@Lob
	private Blob immagine;
	
	@Column(name="idutente")
	private int idutente;
	




	public Immagine(int id, Blob immagine, int idutente) {
		
		this.id = id;
		this.immagine = immagine;
		this.idutente= idutente;
		
	}

	public Immagine(Blob immagine, int idutente) {
		
		this.immagine = immagine;
		this.idutente=idutente;
		
	}

	public Immagine() {
	
	}

	public int getIdutente() {
		return idutente;
	}

	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Blob getImmagine() {
		return immagine;
	}

	public void setImmagine(Blob immagine) {
		this.immagine = immagine;
	}

	
	@Override
	public String toString() {
		return "Immagine [id=" + id + ", immagine=" + immagine + ", idutente=" + idutente + "]";
	}
	
	

}
