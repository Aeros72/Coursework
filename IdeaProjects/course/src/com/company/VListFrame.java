package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VListFrame extends JFrame implements ActionListener{

    private List<Voucher> vouchers;
    private List<Voucher> ordered;

    VListFrame(List<Voucher> vouchers, List<Voucher> ordered){

        this.vouchers = vouchers;
        this.ordered = ordered;

        JLabel vlist = new JLabel();
        vlist.setText("Voucher list");
        vlist.setForeground(Color.WHITE);
        vlist.setFont(new Font("Noto Sans", Font.PLAIN, 75));
        vlist.setHorizontalAlignment(JLabel.CENTER);
        vlist.setBounds(710, 60, 500 ,120);

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
        this.add(vlist);

        int x = 180;

        for(Voucher v : vouchers){
            JLabel label;
            label = v.getLabel();
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
