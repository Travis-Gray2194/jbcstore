package me.travisgray.Controller;

import me.travisgray.Models.Cosmetics;
import me.travisgray.Repositories.CleaningItemsRepository;
import me.travisgray.Repositories.CosmeticsRepository;
import me.travisgray.Repositories.JBCStoreRepository;
import me.travisgray.Repositories.SnacksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by ${TravisGray} on 2/5/2018.
 */

@Controller
public class JBCStoreController {



    @Autowired
    CleaningItemsRepository cleaningItemsRepository;

    @Autowired
    SnacksRepository snacksRepository;

    @Autowired
    JBCStoreRepository jbcStoreRepository;

    @Autowired
    CosmeticsRepository cosmeticsRepository;

    @RequestMapping("/")
    public String showHomepage(Model model){

        model.addAttribute("snackslist",snacksRepository.findAll());
        model.addAttribute("cleaningitemslist",cleaningItemsRepository.findAll());
        model.addAttribute("cosmeticsrepositroy",cosmeticsRepository.findAll());
        model.addAttribute("jbcstore",jbcStoreRepository.findAll());

        return "index";
    }



    @GetMapping("/AddCosmetics")
    public String addCosmetics(Model model){

        Cosmetics cosmetics = new Cosmetics();
        model.addAttribute("cosmetics", new Cosmetics());

        return "addcosmeticsform";

    }

    @PostMapping("/AddCosmetics")
    public String saveCosmetics(@Valid @ModelAttribute("cosmetic") Cosmetics cosmetics, BindingResult result){

        {

            if (result.hasErrors()) {

                return "addcosmeticsform";

            }

            cosmeticsRepository.save(cosmetics);
            return "cosmeticslist";

        }


    }



}
