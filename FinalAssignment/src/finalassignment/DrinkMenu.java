package finalassignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.event.*;

public class DrinkMenu{   
    private JFrame DrinkMenu;
    private int widthImage = 125;
    private int heightImage = 85;
    static double totalDrink;
    private double drinkCola;
    private double drinkSprite;
    private double drinkLemonTea;
    private double drinkCoffee;
    
    public DrinkMenu(){
        DrinkMenu = new JFrame("Carlven Restaurant");  
        
        JButton btnBack = new JButton("Back"); //Return Button
        btnBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DrinkMenu.dispose();
                new FoodMenu().setVisible(true);
            }
        });
        btnBack.setBounds(45,35,100,35);
        DrinkMenu.getContentPane().add(btnBack);
            
        JLabel lbCola = new JLabel(""); //Cola
        ImageIcon imgCola = new ImageIcon("src/finalassignment/picture/Cola.jpg");
        imgCola.setImage(imgCola.getImage().getScaledInstance(widthImage,heightImage,Image.SCALE_DEFAULT));
        lbCola.setIcon(imgCola);
        lbCola.setSize(widthImage,heightImage);
        lbCola.setBounds(100,120,125,85);
        DrinkMenu.getContentPane().add(lbCola);
        
        JCheckBox chkCola = new JCheckBox(" ");
        chkCola.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(chkCola.isSelected()){
                    drinkCola = 7;
                    totalDrink = drinkCola + drinkSprite + drinkLemonTea + drinkCoffee;
                }
                else{
                    drinkCola = 0;
                    totalDrink = drinkCola + drinkSprite + drinkLemonTea + drinkCoffee;
                }
            }
        });
        chkCola.setBounds(95,210,20,20);
        DrinkMenu.getContentPane().add(chkCola);
        
        JLabel lbC = new JLabel("Cola (RM 7)");
        lbC.setBounds(125,212,140,15);
        DrinkMenu.getContentPane().add(lbC);
            
        JLabel lbSprite = new JLabel(""); //Sprite
        ImageIcon imgSprite = new ImageIcon("src/finalassignment/picture/Sprite.jpg");
        imgSprite.setImage(imgSprite.getImage().getScaledInstance(widthImage,heightImage,Image.SCALE_DEFAULT));
        lbSprite.setIcon(imgSprite);
        lbSprite.setSize(widthImage,heightImage);
        lbSprite.setBounds(350,120,125,85);
        DrinkMenu.getContentPane().add(lbSprite);
        
        JCheckBox chkSprite = new JCheckBox(" ");
        chkSprite.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(chkSprite.isSelected()){
                    drinkSprite = 10;
                    totalDrink = drinkSprite + drinkCola + drinkLemonTea + drinkCoffee;
                }
                else{
                    drinkSprite=0;
                    totalDrink = drinkSprite + drinkCola + drinkLemonTea + drinkCoffee;
                }
            }
        });
        chkSprite.setBounds(345,210,20,20);
        DrinkMenu.getContentPane().add(chkSprite);
        
        JLabel lbSP = new JLabel("Sprite (RM 10)");
        lbSP.setBounds(375,212,140,15);
        DrinkMenu.getContentPane().add(lbSP);
        
        JLabel lbLemonTea = new JLabel(""); //Lemon Tea
        ImageIcon imgLT = new ImageIcon("src/finalassignment/picture/LemonTea.jpg");
        imgLT.setImage(imgLT.getImage().getScaledInstance(widthImage,heightImage,Image.SCALE_DEFAULT));
        lbLemonTea.setIcon(imgLT);
        lbLemonTea.setSize(widthImage,heightImage);
        lbLemonTea.setBounds(100,320,125,85);
        DrinkMenu.getContentPane().add(lbLemonTea);
        
        JCheckBox chkLT = new JCheckBox(" ");
        chkLT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(chkLT.isSelected()){
                    drinkLemonTea = 12;
                    totalDrink = drinkLemonTea + drinkCola + drinkSprite + drinkCoffee;
                }
                else{
                    drinkLemonTea = 0;
                    totalDrink = drinkLemonTea + drinkCola + drinkSprite + drinkCoffee;
                }
            }
        });
        chkLT.setBounds(90,410,20,20);
        DrinkMenu.getContentPane().add(chkLT);
        
        JLabel lbLT = new JLabel("Lemon Tea (RM 12)");
        lbLT.setBounds(120,412,140,15);
        DrinkMenu.getContentPane().add(lbLT);
        
        JLabel lbCofee = new JLabel(""); //Coffee
        ImageIcon imgCF = new ImageIcon("src/finalassignment/picture/Coffee.jpg");
        imgCF.setImage(imgCF.getImage().getScaledInstance(widthImage,heightImage,Image.SCALE_DEFAULT));
        lbCofee.setIcon(imgCF);
        lbCofee.setSize(widthImage,heightImage);
        lbCofee.setBounds(350,320,125,85);
        DrinkMenu.getContentPane().add(lbCofee);
        
        JCheckBox chkCF = new JCheckBox(" ");
        chkCF.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(chkCF.isSelected()){
                    drinkCoffee = 8;
                    totalDrink = drinkCoffee + drinkLemonTea + drinkCola + drinkSprite;
                }
                else{
                    drinkCoffee = 0;
                    totalDrink = drinkCoffee + drinkLemonTea + drinkCola + drinkSprite;
                }
            }
        });
        chkCF.setBounds(345,410,20,20);
        DrinkMenu.getContentPane().add(chkCF);
        
        JLabel lbCF = new JLabel("Cofee (RM 8)");
        lbCF.setBounds(375,412,140,15);
        DrinkMenu.getContentPane().add(lbCF);
        
        JButton btnNext = new JButton("Next"); //Next Button
        btnNext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DrinkMenu.dispose();
                new Coupon().setVisible(true);
            }
        });
        btnNext.setBounds(435,490,100,35);
        DrinkMenu.getContentPane().add(btnNext);
        
        JLabel lbWallpaper = new JLabel();
        lbWallpaper.setIcon(new ImageIcon("src/finalassignment/picture/Background.png"));
        lbWallpaper.setBounds(0,0,600,600);
        DrinkMenu.getContentPane().add(lbWallpaper);
        
        DrinkMenu.setSize(600,600);
	DrinkMenu.setVisible(true);
	DrinkMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        DrinkMenu.getContentPane().setLayout(null);
    } 
    
    public void setVisible(boolean visible){
        if(DrinkMenu != null){
            DrinkMenu.setVisible(visible);
        }
    }
}
