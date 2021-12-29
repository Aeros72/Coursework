package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class OrderListFrame extends JFrame implements ActionListener{

    private List<Voucher> vouchers;
    private List<Voucher> ordered;

    OrderListFrame(List<Voucher> vouchers, List<Voucher> ordered){

        this.vouchers = vouchers;
        this.ordered = ordered;

        JLabel olist = new JLabel();
        olist.setText("Ordered vouchers list");
        olist.setForeground(Color.WHITE);
        olist.setFont(new Font("Noto Sans", Font.PLAIN, 75));
        olist.setHorizontalAlignment(JLabel.CENTER);
        olist.setBounds(585, 60, 750 ,120);

        Border border = BorderFactory.createLineBorder(Color.GRAY, 5);

        JButton back = new JButton();
        back.setText("Back");
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Noto Sans", Font.PLAIN, 50));
        back.setVerticalAlignment(JLabel.CENTER);
        back.setHorizontalAlignment(JLabel.CENTER);
        back.setBackground(new Color(0x0588fa));
        back.setOpaque(true);
        back.setBorder(border);
        back.setBounds(1600, 900, 250 ,80);
        back.addActionListener(this);
        back.setFocusable(false);
        back.setActionCommand("back");

        this.setTitle("Coursework vouchers");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        this.setResizable(true);
        this.setSize(1920, 1080);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x92dff0));
        this.add(back);
        this.add(olist);

        int x = 180;

        for(Voucher o : ordered){
            JLabel label;
            label = o.getLabel();
            label.setBounds(x, 250, 300, 600);
            this.add(label);
            x+=420;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();

        if(command.equals("back")) {
            this.dispose();
            new MyFrame(vouchers, ordered);
        }
    }

}
