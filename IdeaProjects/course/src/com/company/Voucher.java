package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Voucher {
    private int id;
    private int price;
    private int duration;
    private String country;
    private String establishment;
    private String transport;

    Voucher(){
        id = price = duration = 0;
        country = establishment = transport = "unknown";
    }

    Voucher(int id, int price, int duration, String country, String establishment, String transport){
        this.id = id;
        this.price = price;
        this.duration = duration;
        this.country = country;
        this.establishment = establishment;
        this.transport = transport;
    }

    public String info(){
        return "Unknown information";
    }

    public int getId(){return id;}
    public int getPrice(){return price;}
    public int getDuration(){return duration;}
    public String getCountry(){return country;}
    public String getEstablishment(){return establishment;}
    public String getTransport(){return transport;}

    public JLabel getLabel(){
        JLabel label = new JLabel();

        String path;

        if(this instanceof Vacation) path = "C:\\Users\\xXx\\IdeaProjects\\course\\src\\vacation.png";
        else if(this instanceof Excursion) path = "C:\\Users\\xXx\\IdeaProjects\\course\\src\\excursion.png";
        else if(this instanceof Shopping) path = "C:\\Users\\xXx\\IdeaProjects\\course\\src\\shopping.png";
        else path = "unknown";

        ImageIcon image = new ImageIcon(path);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

        label.setText(this.info());
        label.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setBorder(border);

        return label;
    }
}
