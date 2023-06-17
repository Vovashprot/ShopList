package com.Shopping.ShoppingList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping()
public class ShoppingListController {
    private final ShoppingListService service;

    public ShoppingListController(ShoppingListService service){
        this.service = service;
    }
    @GetMapping("/add")
    public void add(@RequestParam("id") Set<Integer> ids){
        service.add(ids);
    }

    @GetMapping("/get")
    public void get(){
        service.get();
    }
}
