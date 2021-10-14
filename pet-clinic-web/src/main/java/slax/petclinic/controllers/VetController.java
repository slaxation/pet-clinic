package slax.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import slax.petclinic.services.VetService;


@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService ownerService) {
        this.vetService = ownerService;
    }

    @RequestMapping({"/vets", "/", "/vets/index", "/vets/index.html"})
    public String listVets(Model model) {

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";

    }
}
