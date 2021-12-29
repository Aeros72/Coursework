package com.company;

import java.util.ArrayList;
import java.util.List;

public class Agency {

    List<Voucher> vouchers = new ArrayList<>();

    public List<Voucher> createList(){
        vouchers.add(new Vacation(17, 4000, 15, "France", "Radisson", "Plane", "All inclusive"));
        vouchers.add(new Shopping(3, 1900, 2, "Italy", "Parndorf", "Bus", "Moncler, Levi`s"));
        vouchers.add(new Excursion(27, 1200, 1, "Austria", "Belvedere palace", "Bus", "Frank Anderson", "German"));
        vouchers.add(new Vacation(6, 2600, 8, "Poland", "Hilton", "Train", "Breakfast + Pool"));

        return vouchers;
    }
}
