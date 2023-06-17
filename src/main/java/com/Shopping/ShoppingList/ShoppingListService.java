package com.Shopping.ShoppingList;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.Set;

@Service
@SessionScope
public class ShoppingListService {
    private final Set<Integer> items;
    public ShoppingListService (Set<Integer> items){
        this.items = items;
    }
    public void add(Set<Integer> ids){
        items.addAll(ids);
    }
    public Set<Integer> get(){
        return items;
    }
}
