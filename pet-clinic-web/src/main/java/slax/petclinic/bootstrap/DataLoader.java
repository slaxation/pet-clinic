package slax.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import slax.petclinic.model.*;
import slax.petclinic.services.OwnerService;
import slax.petclinic.services.PetTypeService;

import slax.petclinic.services.SpecialityRepository;
import slax.petclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityRepository specialityService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petService, SpecialityRepository specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petService;
        this.specialityService = specialityService;
    }


    @Override
    public void run(String... args) throws Exception {

        if (petTypeService.findAll().isEmpty()){
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Peter");
        owner1.setLastName("Bornstein");
        owner1.setAddress("Kolej Podoli");
        owner1.setCity("Prague");
        owner1.setTelephone("1234567890");

        Pet petersPet  = new Pet();
        petersPet.setPetType(savedDogPetType);
        petersPet.setOwner(owner1);
        petersPet.setBirthDate(LocalDate.now());
        petersPet.setName("Falco");
        owner1.getPets().add(petersPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jesus");
        owner2.setLastName("Christ");
        owner2.setAddress("Za oblakom");
        owner2.setCity("Nebicko");
        owner2.setTelephone("0912345678");

        Pet jesusPet  = new Pet();
        jesusPet.setPetType(savedCatPetType);
        jesusPet.setOwner(owner2);
        jesusPet.setBirthDate(LocalDate.now());
        jesusPet.setName("Satan");
        owner2.getPets().add(jesusPet);

        ownerService.save(owner2);

        System.out.println("Load owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Dolf");
        vet1.setLastName("Lundgreen");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Satan");
        vet2.setLastName("Vladne");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Load Vets...");
    }
}
