package com.company;

public class Vacation extends Voucher{

    private String services;

    Vacation(int id, int price, int duration, String country, String establishment, String transport, String services){
        super(id, price, duration, country, establishment, transport);
        this.services = services;
    }
    @Override
    public String info(){
        String str = "<html>Vacation<br>" + "ID - " + getId()
                + "<br>Price - " + getPrice() + "<br>Duration - " + getDuration()
                + "<br>Country - " + getCountry() + "<br>Hotel - " + getEstablishment()
                + "<br>Transport - " + getTransport() + "<br>Services - " + services;

        return str;
    }



}
