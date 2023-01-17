package org.launchcode.inventorytrackerspringboot.controller;

import org.launchcode.inventorytrackerspringboot.model.ExampleInventory;
import org.launchcode.inventorytrackerspringboot.repository.ExampleInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ExampleInventoryController {
    @Autowired
    private ExampleInventoryRepository exampleInventoryRepository;

        @CrossOrigin("http://localhost:4200")
    @GetMapping("/inventories")
    public List<ExampleInventory> getAllInventories(){
        return exampleInventoryRepository.findAll();
    }

    @PostMapping("inventories")
    void addExampleInventory(@RequestBody ExampleInventory exampleInventory) {
        ExampleInventory item= new ExampleInventory(item.getId(),
                item.getExItemName(),
                item.getExCategory());
        exampleInventoryRepository.save(item);
    }



}
