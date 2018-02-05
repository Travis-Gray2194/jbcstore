//package me.travisgray.DataLoader;
//
//import me.travisgray.Models.CleaningItems;
//import me.travisgray.Models.Cosmetics;
//import me.travisgray.Models.JBCStore;
//import me.travisgray.Models.Snacks;
//import me.travisgray.Repositories.CleaningItemsRepository;
//import me.travisgray.Repositories.CosmeticsRepository;
//import me.travisgray.Repositories.JBCStoreRepository;
//import me.travisgray.Repositories.SnacksRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
//
//    @Autowired
//    CleaningItemsRepository cleaningItemsRepository;
//
//    @Autowired
//    SnacksRepository snacksRepository;
//
//    @Autowired
//    JBCStoreRepository jbcStoreRepository;
//
//    @Autowired
//    CosmeticsRepository cosmeticsRepository;
//
//
//    @Override
//    public void run(String...strings)throws Exception {
//
//
////        Saving all Models to Database for Thymeleaf Testing
//
//        JBCStore jbcStore = new JBCStore("jbcstore",9,11);
//        jbcStoreRepository.save(jbcStore);
//
//        Cosmetics cosmetics = new Cosmetics(2,"Mac Lipstick",20.00,"Five",20);
//        cosmeticsRepository.save(cosmetics);
//
//
//        Snacks snacks = new Snacks("Hard","Snickers",50);
//        snacksRepository.save(snacks);
//
//        CleaningItems cleaningItems = new CleaningItems("Strong","Bleach",25.00,25);
//        cleaningItemsRepository.save(cleaningItems);
//
//
//    }
//
//}
