package demo.BlobPaddingTest.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.BlobPaddingTest.dao.UtenteDAO;
import demo.BlobPaddingTest.model.Utente;
import demo.BlobPaddingTest.repository.UtenteRepository;
@Service
public class UtenteService implements UtenteDAO {
	
	@Autowired
	UtenteRepository repository;
	
	@Override
	public void inserisciUtente(Utente u) {
		repository.save(u);
		
	}

	@Override
	public Utente selezionaUtente(Integer id) {
		Utente u= repository.findById(id).get();
		return u;
	}

	@Override
	public void eliminaUtente(Utente u) {
		repository.delete(u);
		
	}

	@Override
	public void cancellaUtente(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void aggiornaInfo(Utente u, Integer id) {
		Utente utenteRecuperato=this.selezionaUtente(id);
		if(utenteRecuperato !=null) {
			utenteRecuperato.setNome(u.getNome());
			utenteRecuperato.setCognome(u.getCognome());
			utenteRecuperato.setEmail(u.getEmail());
			utenteRecuperato.setPassword(u.getPassword());
			repository.save(utenteRecuperato);
		}else {
			//lo stampiamo soltanto sulla console per vedere se è tutto ok
			System.out.println("L'utente non esiste.");
		}
		
	}

	@Override
	public List<Utente> selezionaUtenti() {
		   List<Utente> lista= (List<Utente>) repository.findAll();
	        return lista;
	}

	@Override
	public Utente selezionaUtenteEmail(String email, String password) {
		String pEmail = repository.findUtenteByEmailAndPassword(email,password).getEmail();
		String pPassword = repository.findUtenteByEmailAndPassword(email,password).getPassword();
		Utente p = repository.findUtenteByEmailAndPassword(pEmail,pPassword);
		return p;
    
	}

}
