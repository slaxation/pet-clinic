package slax.petclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import slax.petclinic.model.Speciality;
import slax.petclinic.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityService specialityService;

    public SpecialitySDJpaService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }


    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityService.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityService.findById(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityService.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityService.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityService.deleteById(aLong);
    }
}
