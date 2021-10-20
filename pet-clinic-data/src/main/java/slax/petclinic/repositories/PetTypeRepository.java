package slax.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import slax.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
