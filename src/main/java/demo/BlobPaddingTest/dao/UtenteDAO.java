package demo.BlobPaddingTest.dao;

import java.util.List;

import demo.BlobPaddingTest.model.Utente;



public interface UtenteDAO {
	void inserisciUtente(Utente u);
	Utente selezionaUtente(Integer id);
	void eliminaUtente(Utente u);
	void cancellaUtente(Integer id);
	void aggiornaInfo(Utente u, Integer id);
	List<Utente> selezionaUtenti();
	Utente selezionaUtenteEmail(String email, String password);
	
}
