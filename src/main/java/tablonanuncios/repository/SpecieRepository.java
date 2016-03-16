package tablonanuncios.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tablonanuncios.model.Specie;


public interface SpecieRepository extends JpaRepository<Specie, Long> {

	Specie findByName(String name);
	List<Specie> findAllByOrderByNameAsc();
	//Falta por Tipo entre animal,vegetal o hongos
}
