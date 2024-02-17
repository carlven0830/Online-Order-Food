package finalassignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.event.*;

public class Coupon {
    private JFrame Coupon;
    static double discount;
    
    public Coupon(){
        Coupon = new JFrame();
        
        JButton btnBack = new JButton("Back"); //Return Button
        btnBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Coupon.dispose();
                new DrinkMenu().setVisible(true);
            }
        });
        btnBack.setBounds(45,35,100,35);
        Coupon.getContentPane().add(btnBack);
        

        JLabel lbCoupon = new JLabel("Coupon (Skip without coupon)"); //Apply Coupon
        lbCoupon.setFont(new Font("Arial Black",Font.BOLD,15));
        lbCoupon.setBounds(170,220,270,30);
        Coupon.getContentPane().add(lbCoupon);
        
        JTextField jtfCoupon = new JTextField("TCXXX");
        jtfCoupon.setBounds(195,260,200,30);
        Coupon.getContentPane().add(jtfCoupon);
        
        JButton btnNext = new JButton("Next"); //Next Button
        btnNext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String textCoupon = jtfCoupon.getText();
                
                if(textCoupon.equals("TC001")){
                    discount = 10;
                }
                else if(textCoupon.equals("TC002")){
                    discount = 8;
                }
                else if(textCoupon.equals("TC003")){
                    discount = 5;
                }
                else{
                    discount = 0;
                }
                
                Coupon.dispose();
                new Amount().setVisible(true);
            }
        });
        btnNext.setBounds(435,490,100,35);
        Coupon.getContentPane().add(btnNext);
        
        JLabel lbWallpaper = new JLabel();
        lbWallpaper.setIcon(new ImageIcon("src/finalassignment/picture/Background.png"));
        lbWallpaper.setBounds(0,0,600,600);
        Coupon.getContentPane().add(lbWallpaper);
        
        Coupon.setSize(600,600);
	Coupon.setVisible(true);
	Coupon.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Coupon.getContentPane().setLayout(null);
    }
    
    public void setVisible(boolean visible){
        if(Coupon != null){
            Coupon.setVisible(visible);
        }
    }
}
