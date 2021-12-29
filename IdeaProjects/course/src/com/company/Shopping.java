package com.company;

public class Shopping extends Voucher{

    private String shopList;

    Shopping (int id, int price, int duration, String country, String establishment, String transport, String shopList){
        super(id, price, duration, country, establishment, transport);
        this.shopList = shopList;
    }

    public String info(){
        String str = "<html>Shopping<br>" + "ID - " + getId()
                + "<br>Price - " + getPrice() + "<br>Duration - " + getDuration()
                + "<br>Country - " + getCountry() + "<br>Store - " + getEstablishment()
                + "<br>Transport - " + getTransport() + "<br>Shop list - " + shopList;

        return str;
    }
}
