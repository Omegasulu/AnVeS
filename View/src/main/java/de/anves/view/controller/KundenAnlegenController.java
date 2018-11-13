package de.anves.view.controller;

import de.anves.Kunde;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class KundenAnlegenController {



/*
    @GetMapping("/KundenAnlegen")
    public String kundenAnlegenForm(Model model) {
        model.addAttribute("KundenAnlegen", new Kunde());
        return "KundenAnlegen";
    }
*/


    @PostMapping("/KundenAnlegen")
    public String kundenAnlegenSubmit(@ModelAttribute Kunde kunde) {
        return "result";
    }

}
