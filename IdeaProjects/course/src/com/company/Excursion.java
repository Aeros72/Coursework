package com.company;

public class Excursion extends Voucher{

    private String guide;
    private String language;

    Excursion (int id, int price, int duration, String country, String establishment, String transport, String guide, String language){
        super(id, price, duration, country, establishment, transport);
        this.guide = guide;
        this.language = language;
    }

    public String info(){
        String str = "<html>Excursion<br>" + "ID - " + getId()
                + "<br>Price - " + getPrice() + "<br>Duration - " + getDuration()
                + "<br>Country - " + getCountry() + "<br>Places - " + getEstablishment()
                + "<br>Transport - " + getTransport() + "<br>Guide - " + guide + "<br>Language - " + language;

        return str;
    }
}
