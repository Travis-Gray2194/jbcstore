package me.travisgray.Controller;

import me.travisgray.Models.Cosmetics;
import me.travisgray.Models.Snacks;
import me.travisgray.Repositories.CleaningItemsRepository;
import me.travisgray.Repositories.CosmeticsRepository;
import me.travisgray.Repositories.JBCStoreRepository;
import me.travisgray.Repositories.SnacksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

        model.addAttribute("snacks",snacksRepository.findAll());
        model.addAttribute("cleaningitems",cleaningItemsRepository.findAll());
        model.addAttribute("cosmetics",cosmeticsRepository.findAll());
        model.addAttribute("jbcstore",jbcStoreRepository.findAll());

        return "index";
    }



    @GetMapping("/AddCosmetics")
    public String addCosmetics(Model model){

        Cosmetics cosmetics = new Cosmetics();
        model.addAttribute("cosmetics", new Cosmetics());

        return "addcosmeticsform";

    }

    @PostMapping("/ProcessCosmetics")
    public String saveCosmetics(@Valid @ModelAttribute("cosmetics") Cosmetics cosmetics, BindingResult result,Model model){

        {

            if (result.hasErrors()) {

                return "addcosmeticsform";

            }

            cosmeticsRepository.save(cosmetics);
//            Getting all Cosmetic Entries from Repository for Thymeleaf View to Display all previous entries nessecary
            model.addAttribute("cosmetics",cosmeticsRepository.findAll());
            return "cosmeticslist";

        }



    }

    @RequestMapping("/update/{id}")
    public String showallcosmetics(@PathVariable("id") long id, Model model){
        model.addAttribute("cosmetics",cosmeticsRepository.findOne(id));
        return "cosmeticslist";

    }

    @GetMapping("/AddSnacks")
    public String addSnacks(Model model){

        Snacks snacks = new Snacks();
        model.addAttribute("snacks",new Snacks());

        return "addsnacksform";

    }

    @PostMapping("/ProcessSnacks")
    public String saveSnacks(@Valid @ModelAttribute("snacks") Snacks snacks, Model model, BindingResult result ){

        {

            if (result.hasErrors()) {

                return "addsnacksform";

            }

            snacksRepository.save(snacks);
            model.addAttribute("snacks",snacksRepository.findAll());
            return "snackslist";

        }

    }







}
