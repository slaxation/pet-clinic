package slax.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import slax.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
