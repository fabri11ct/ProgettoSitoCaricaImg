package demo.BlobPaddingTest.repository;



import org.springframework.data.repository.CrudRepository;

import demo.BlobPaddingTest.model.Utente;



public interface UtenteRepository extends CrudRepository<Utente, Integer> {
	Utente findUtenteByEmailAndPassword(String email,String password);
}
