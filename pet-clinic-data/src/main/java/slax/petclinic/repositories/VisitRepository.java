package slax.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import slax.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
