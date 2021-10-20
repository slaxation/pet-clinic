package slax.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import slax.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
