package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MyFrame extends JFrame implements ActionListener {

    private List<Voucher> vouchers;
    private List<Voucher> ordered;

    MyFrame(List<Voucher> vouchers, List<Voucher> ordered){
        this.vouchers = vouchers;
        this.ordered = ordered;

        ImageIcon image = new ImageIcon("C:\\Users\\xXx\\IdeaProjects\\course\\src\\logo.png");
        Border border = BorderFactory.createLineBorder(Color.GRAY, 5);

        JLabel menu = new JLabel();
        menu.setText("Menu");
        menu.setForeground(Color.WHITE);
        menu.setFont(new Font("Noto Sans", Font.PLAIN, 100));
        menu.setHorizontalAlignment(JLabel.CENTER);
        menu.setBounds(810, 35, 300 ,120);

        JButton list = new JButton();
        list.setText("Voucher list");
        list.setForeground(Color.WHITE);
        list.setFont(new Font("Noto Sans", Font.PLAIN, 30));
        list.setVerticalAlignment(JLabel.CENTER);
        list.setHorizontalAlignment(JLabel.CENTER);
        list.setBackground(new Color(0x0588fa));
        list.setOpaque(true);
        list.setBorder(border);
        list.setBounds(300, 200, 400, 120);
        list.addActionListener(this);
        list.setFocusable(false);
        list.setActionCommand("list");

        JButton byCountry = new JButton();
        byCountry.setText("Choose voucher by country");
        byCountry.setForeground(Color.WHITE);
        byCountry.setFont(new Font("Noto Sans", Font.PLAIN, 30));
        byCountry.setVerticalAlignment(JLabel.CENTER);
        byCountry.setHorizontalAlignment(JLabel.CENTER);
        byCountry.setBackground(new Color(0x0588fa));
        byCountry.setOpaque(true);
        byCountry.setBorder(border);
        byCountry.setBounds(1220, 200, 400, 120);
        byCountry.addActionListener(this);
        byCountry.setFocusable(false);
        byCountry.setActionCommand("byCountry");

        JButton byTransport = new JButton();
        byTransport.setText("Choose voucher by transport");
        byTransport.setForeground(Color.WHITE);
        byTransport.setFont(new Font("Noto Sans", Font.PLAIN, 30));
        byTransport.setVerticalAlignment(JLabel.CENTER);
        byTransport.setHorizontalAlignment(JLabel.CENTER);
        byTransport.setBackground(new Color(0x0588fa));
        byTransport.setOpaque(true);
        byTransport.setBorder(border);
        byTransport.setBounds(1220, 400, 400, 120);
        byTransport.addActionListener(this);
        byTransport.setFocusable(false);
        byTransport.setActionCommand("byTransport");

        JButton byDuration = new JButton();
        byDuration.setText("Choose voucher by duration");
        byDuration.setForeground(Color.WHITE);
        byDuration.setFont(new Font("Noto Sans", Font.PLAIN, 30));
        byDuration.setVerticalAlignment(JLabel.CENTER);
        byDuration.setHorizontalAlignment(JLabel.CENTER);
        byDuration.setBackground(new Color(0x0588fa));
        byDuration.setOpaque(true);
        byDuration.setBorder(border);
        byDuration.setBounds(1220, 600, 400, 120);
        byDuration.addActionListener(this);
        byDuration.setFocusable(false);
        byDuration.setActionCommand("byDuration");

        JButton order = new JButton();
        order.setText("Order the voucher");
        order.setForeground(Color.WHITE);
        order.setFont(new Font("Noto Sans", Font.PLAIN, 30));
        order.setVerticalAlignment(JLabel.CENTER);
        order.setHorizontalAlignment(JLabel.CENTER);
        order.setBackground(new Color(0x0588fa));
        order.setOpaque(true);
        order.setBorder(border);
        order.setBounds(300, 400, 400, 120);
        order.addActionListener(this);
        order.setFocusable(false);
        order.setActionCommand("order");

        JButton orderList = new JButton();
        orderList.setText("Ordered vouchers list");
        orderList.setForeground(Color.WHITE);
        orderList.setFont(new Font("Noto Sans", Font.PLAIN, 30));
        orderList.setVerticalAlignment(JLabel.CENTER);
        orderList.setHorizontalAlignment(JLabel.CENTER);
        orderList.setBackground(new Color(0x0588fa));
        orderList.setOpaque(true);
        orderList.setBorder(border);
        orderList.setBounds(300, 600, 400, 120);
        orderList.addActionListener(this);
        orderList.setFocusable(false);
        orderList.setActionCommand("orderList");

        JButton pExit = new JButton();
        pExit.setText("Exit");
        pExit.setForeground(Color.WHITE);
        pExit.setFont(new Font("Noto Sans", Font.PLAIN, 50));
        pExit.setVerticalAlignment(JLabel.CENTER);
        pExit.setHorizontalAlignment(JLabel.CENTER);
        pExit.setBackground(new Color(0x0588fa));
        pExit.setOpaque(true);
        pExit.setBorder(border);
        pExit.setBounds(810, 800, 300 ,120);
        pExit.addActionListener(this);
        pExit.setFocusable(false);
        pExit.setActionCommand("exit");

        JLabel pic = new JLabel();
        pic.setIcon(image);
        pic.setBounds(810, 310, 300, 300);

        this.setTitle("Coursework vouchers");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        this.setResizable(true);
        this.setSize(1920, 1080);
        this.setLayout(null);
        this.setVisible(true);

        this.add(menu);
        this.add(list);
        this.add(byCountry);
        this.add(byTransport);
        this.add(byDuration);
        this.add(order);
        this.add(orderList);
        this.add(pExit);
        this.add(pic);

        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x92dff0));
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();

        if(command.equals("exit")) System.exit(0);
        if(command.equals("list")) {
            this.dispose();
            new VListFrame(vouchers, ordered);
        }
        if(command.equals("byCountry")) {
            this.dispose();
            new ByCountryFrame(vouchers, ordered);
        }
        if(command.equals("byTransport")) {
            this.dispose();
            new ByTransportFrame(vouchers, ordered);
        }
        if(command.equals("byDuration")) {
            this.dispose();
            new ByDurationFrame(vouchers, ordered);
        }
        if(command.equals("order")) {
            this.dispose();
            new VOrderFrame(vouchers, ordered);
        }
        if(command.equals("orderList")) {
            this.dispose();
            new OrderListFrame(vouchers, ordered);
        }
    }
}
