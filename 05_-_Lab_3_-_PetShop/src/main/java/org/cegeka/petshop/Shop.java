package org.cegeka.petshop;

import com.google.common.collect.ImmutableSet;

import java.util.*;

public class Shop {

    private Set<String> itemList = new HashSet<String>();

    public void addItem(String item) {
        itemList.add(item);
    }

    public Set<String> getItemsInStock() {
        return ImmutableSet.copyOf(itemList);
    }
}
