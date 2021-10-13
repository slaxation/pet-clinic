package slax.petclinic.services;

import slax.petclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
