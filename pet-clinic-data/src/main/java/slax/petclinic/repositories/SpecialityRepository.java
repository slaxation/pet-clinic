package slax.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import slax.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
