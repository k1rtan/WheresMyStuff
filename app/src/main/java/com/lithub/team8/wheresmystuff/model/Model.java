package com.lithub.team8.wheresmystuff.model;

import java.util.ArrayList;

/**
  * Created by Kirtan on 6/29/2017.
  */

public class Model {

    /**
     *
     */
    private static final Model _instance = new Model();

    /**
     *
     */
    private static ArrayList<Item> items;

    /**
     *
     */
    public static Model getInstance() { return _instance; }

    /**
     *
     */
    private Model() {
        items = new ArrayList<>();
    }

    /**
     *
     */
    public static ArrayList<Item> getItems() {
        return items;
    }

    /**
     *  adds an item object
     * @param item one item object
     */
    public void add(Item item) {
        items.add(item);
    }

    /**
     *
     */
    public int size() {
        return items.size();
    }

    /**
     *
     * @param index looks for item at that index
     * @return item at index
     */
    public Item get(int index) {
        return items.get(index);
    }

    /**
     *
     */
    public static void setItems(ArrayList<Item> items) {
        Model.items = items;
    }
}