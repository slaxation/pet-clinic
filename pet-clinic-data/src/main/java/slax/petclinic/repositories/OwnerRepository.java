package slax.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import slax.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
