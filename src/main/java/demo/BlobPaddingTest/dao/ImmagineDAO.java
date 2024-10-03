package demo.BlobPaddingTest.dao;

import java.util.List;

import demo.BlobPaddingTest.model.Immagine;

public interface ImmagineDAO {
	public Immagine inserisci(Immagine img);

	public Immagine visualizzaImmagine(Integer id);
	
	public List<Immagine> visualizzaImmagini(Integer idutente);
	
	List<Immagine> selezionaImmagini();
}
