package tablonanuncios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tablonanuncios.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {
	Person findByName(String name);
	Person findByLastname(String lastname);
	List<Person> findAllByOrderByNameAsc();
	List<Person> findAllByOrderByLastnameAsc();
	//Falta por Tipo de trabajo
}
