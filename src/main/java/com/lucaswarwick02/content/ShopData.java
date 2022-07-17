package com.lucaswarwick02.content;

import org.json.JSONArray;

public class ShopData {
    public JSONArray dailyDeals;
    public JSONArray voidTraders;
    public JSONArray flashSales;

    public ShopData (JSONArray dailyDeals, JSONArray voidTraders, JSONArray flashSales) {
        this.dailyDeals = dailyDeals;
        this.voidTraders = voidTraders;
        this.flashSales = flashSales;
    }

    @Override
    public String toString () {

        return this.dailyDeals.toString() +
                "\n\n" +
                this.voidTraders.toString() +
                "\n\n" +
                this.flashSales.toString();
    }
}
