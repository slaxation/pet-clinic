package slax.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import slax.petclinic.model.Owner;
import slax.petclinic.model.Vet;
import slax.petclinic.services.OwnerService;
import slax.petclinic.services.VetService;
import slax.petclinic.services.map.OwnerServiceMap;
import slax.petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Peter");
        owner1.setLastName("Bornstein");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Jesus");
        owner1.setLastName("Christ");

        ownerService.save(owner2);

        System.out.println("Load owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Dolf");
        vet1.setLastName("Lundgreen");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jesus");
        vet2.setLastName("Christ");

        vetService.save(vet2);

        System.out.println("Load Vets...");


    }
}
