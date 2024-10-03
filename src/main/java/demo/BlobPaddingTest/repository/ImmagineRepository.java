package demo.BlobPaddingTest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demo.BlobPaddingTest.model.Immagine;

public interface ImmagineRepository extends CrudRepository<Immagine, Integer>{

	List<Immagine> findAllByIdutente(Integer idutente);

}
