package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VOrderFrame extends JFrame implements ActionListener {

    private List<Voucher> vouchers;
    private List<Voucher> ordered;
    JTextField tf;
    JButton submit;
    JButton order;
    Voucher voucher;

    VOrderFrame(List<Voucher> vouchers, List<Voucher> ordered){
        this.vouchers = vouchers;
        this.ordered = ordered;

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

        submit = new JButton();
        submit.setText("Submit");
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Noto Sans", Font.PLAIN, 50));
        submit.setVerticalAlignment(JLabel.CENTER);
        submit.setHorizontalAlignment(JLabel.CENTER);
        submit.setBackground(new Color(0x0588fa));
        submit.setOpaque(true);
        submit.setBorder(border);
        submit.setBounds(1400, 75, 250 ,90);
        submit.addActionListener(this);
        submit.setFocusable(false);
        submit.setActionCommand("submit");

        order = new JButton();
        order.setText("Order");
        order.setForeground(Color.WHITE);
        order.setFont(new Font("Noto Sans", Font.PLAIN, 50));
        order.setVerticalAlignment(JLabel.CENTER);
        order.setHorizontalAlignment(JLabel.CENTER);
        order.setBackground(new Color(0x0588fa));
        order.setOpaque(true);
        order.setBorder(border);
        order.setBounds(205, 875, 250 ,80);
        order.addActionListener(this);
        order.setFocusable(false);
        order.setActionCommand("order");

        tf = new JTextField();
        tf.setPreferredSize(new Dimension(1200, 100));
        tf.setBounds(150, 60, 1200, 120);
        tf.setFont(new Font("Noto Sans", Font.PLAIN, 50));
        tf.setBackground(new Color(0xfcf0e3));

        this.setTitle("Coursework vouchers");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        this.setResizable(true);
        this.setSize(1920, 1080);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x92dff0));
        this.add(back);
        this.add(tf);
        this.add(submit);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();

        if(command.equals("back")) {
            this.dispose();
            MyFrame menu = new MyFrame(vouchers, ordered);
        }
        if(command.equals("submit")) {
            for(Voucher v : vouchers){
                if(Integer.toString(v.getId()).equals(tf.getText())){
                    voucher = v;
                    JLabel label;
                    label = v.getLabel();
                    label.setBounds(180, 250, 300, 600);
                    this.add(label);
                    this.add(order);
                    this.validate();
                    this.repaint();
                }
            }
        }
        if(command.equals("order")){
            ordered.add(voucher);

            String url = "jdbc:sqlserver://DESKTOP-H5SBC41\\SQLEXPRESS;databaseName = orders";
            String user = "Aeros";
            String password = "1234";


            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                String sql = "INSERT INTO orders (id) VALUES (" + voucher.getId() + ")";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }

        }
    }

}