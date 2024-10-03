package demo.BlobPaddingTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.BlobPaddingTest.repository.ImmagineRepository;
import demo.BlobPaddingTest.dao.ImmagineDAO;
import demo.BlobPaddingTest.model.Immagine;
@Service
public class ImmagineService implements ImmagineDAO {

	@Autowired
	ImmagineRepository repository;
	
	@Override
	public Immagine inserisci(Immagine img) {
		return repository.save(img);
	}

	@Override
	public Immagine visualizzaImmagine(Integer id) {
		Immagine img= repository.findById(id).get();
		return img;
	}

	@Override
	public List<Immagine> visualizzaImmagini(Integer idutente) {
		return repository.findAllByIdutente(idutente);
	}

	@Override
	public List<Immagine> selezionaImmagini() {
		List<Immagine> lista= (List<Immagine>) repository.findAll();
		return lista;
	}

}
