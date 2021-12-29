package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Agency agency = new Agency();
        List<Voucher> vouchers = agency.createList();
        List<Voucher> ordered = new ArrayList<>();

        new MyFrame(vouchers, ordered);
    }
}
