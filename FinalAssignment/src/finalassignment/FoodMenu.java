package finalassignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.event.*;

public class FoodMenu{
    private JFrame Menu;
    private int widthImage = 125;
    private int heightImage = 85;
    static double totalFood;
    private double foodNS;
    private double foodNG;
    private double foodCR;
    private double foodChick;
    
    public FoodMenu(){
        Menu = new JFrame("Carlven Restaurant");  
        
        JButton btnBack = new JButton("Back"); //Return Button
        btnBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Menu.dispose();
                new MainPage().setVisible(true);
            }
        });
        btnBack.setBounds(45,35,100,35);
        Menu.getContentPane().add(btnBack);
            
        JLabel lbNasiLemak = new JLabel(""); //Nasi Lemak
        ImageIcon imgNS = new ImageIcon("src/finalassignment/picture/NasiLemak.jpg");
        imgNS.setImage(imgNS.getImage().getScaledInstance(widthImage,heightImage,Image.SCALE_DEFAULT));
        lbNasiLemak.setIcon(imgNS);
        lbNasiLemak.setSize(widthImage,heightImage);
        lbNasiLemak.setBounds(100,120,125,85);
        Menu.getContentPane().add(lbNasiLemak);
        
        JCheckBox chkNS = new JCheckBox(" ");
        chkNS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(chkNS.isSelected()){
                    foodNS = 24;
                    totalFood = foodNS + foodNG + foodCR + foodChick; 
                }
                else{
                    foodNS = 0;
                    totalFood = foodNS + foodNG + foodCR + foodChick;
                }
            }
        });
        chkNS.setBounds(90,210,20,20);
        Menu.getContentPane().add(chkNS);
        
        JLabel lbNS = new JLabel("Nasi Lemak (RM 24)");
        lbNS.setBounds(120,212,140,15);
        Menu.getContentPane().add(lbNS);
        
        JLabel lbNasiGoreng = new JLabel(""); //Nasi Goreng
        ImageIcon imgNG = new ImageIcon("src/finalassignment/picture/NasiGoreng.jpg");
        imgNG.setImage(imgNG.getImage().getScaledInstance(widthImage,heightImage,Image.SCALE_DEFAULT));
        lbNasiGoreng.setIcon(imgNG);
        lbNasiGoreng.setSize(widthImage,heightImage);
        lbNasiGoreng.setBounds(350,120,125,85);
        Menu.getContentPane().add(lbNasiGoreng);
        
        JCheckBox chkNG = new JCheckBox(" ");
        chkNG.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(chkNG.isSelected()){
                    foodNG = 30;
                    totalFood = foodNG + foodNS + foodCR + foodChick;
                }
                else{
                    foodNG = 0;
                    totalFood = foodNG + foodNS + foodCR + foodChick;
                }
            }
        });
        chkNG.setBounds(340,210,20,20);
        Menu.getContentPane().add(chkNG);
        
        JLabel lbNG = new JLabel("Nasi Goreng (RM 30)");
        lbNG.setBounds(370,212,140,15);
        Menu.getContentPane().add(lbNG);
        
        JLabel lbChickenRice = new JLabel(""); //Chicken Rice
        ImageIcon imgCR = new ImageIcon("src/finalassignment/picture/ChickenRice.jpg");
        imgCR.setImage(imgCR.getImage().getScaledInstance(widthImage,heightImage,Image.SCALE_DEFAULT));
        lbChickenRice.setIcon(imgCR);
        lbChickenRice.setSize(widthImage,heightImage);
        lbChickenRice.setBounds(100,320,125,85);
        Menu.getContentPane().add(lbChickenRice);
        
        JCheckBox chkCR = new JCheckBox(" ");
        chkCR.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(chkCR.isSelected()){
                    foodCR = 27;
                    totalFood = foodCR + foodNS + foodNG + foodChick; 
                }
                else{
                    foodCR = 0;
                    totalFood = foodCR + foodNS + foodNG + foodChick;
                }
            }
        });
        chkCR.setBounds(90,410,20,20);
        Menu.getContentPane().add(chkCR);
        
        JLabel lbCR = new JLabel("Chicken Rice (RM 27)");
        lbCR.setBounds(120,412,140,15);
        Menu.getContentPane().add(lbCR);
        
        JLabel lbChicken = new JLabel(""); //Chicken
        ImageIcon imgChick = new ImageIcon("src/finalassignment/picture/Chicken.jpg");
        imgChick.setImage(imgChick.getImage().getScaledInstance(widthImage,heightImage,Image.SCALE_DEFAULT));
        lbChicken.setIcon(imgNG);
        lbChicken.setSize(widthImage,heightImage);
        lbChicken.setBounds(350,320,125,85);
        Menu.getContentPane().add(lbChicken);
        
        JCheckBox chkChick = new JCheckBox(" ");
        chkChick.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(chkChick.isSelected()){
                    foodChick = 15;
                    totalFood = foodChick + foodNG + foodNS + foodCR;
                }
                else{
                    foodChick = 0;
                    totalFood = foodChick + foodNG + foodNS + foodCR;
                }
            }
        });
        chkChick.setBounds(340,410,20,20);
        Menu.getContentPane().add(chkChick);
        
        JLabel lbChick = new JLabel("Chicken Fried (RM 15)");
        lbChick.setBounds(370,412,140,15);
        Menu.getContentPane().add(lbChick);
        
        JButton btnNext = new JButton("Next"); //Next Button
        btnNext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Menu.dispose();
                new DrinkMenu().setVisible(true);
            }
        });
        btnNext.setBounds(435,490,100,35);
        Menu.getContentPane().add(btnNext);
        
        JLabel lbWallpaper = new JLabel();
        lbWallpaper.setIcon(new ImageIcon("src/finalassignment/picture/Background.png"));
        lbWallpaper.setBounds(0,0,600,600);
        Menu.getContentPane().add(lbWallpaper);
        
        Menu.setSize(600,600);
	Menu.setVisible(true);
	Menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Menu.getContentPane().setLayout(null);
    }
    
    public void setVisible(boolean visible){
        if(Menu != null){
            Menu.setVisible(visible);
        }
    }

}
