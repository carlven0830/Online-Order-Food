package finalassignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.event.*;

public class MainPage{
    private JFrame MainPage;
    
    public MainPage(){
        MainPage = new JFrame("Carlven Restaurant");
        
        JLabel lbTopic = new JLabel("Welcome to Carlven Restaurant");
        lbTopic.setForeground(Color.darkGray);
        lbTopic.setFont(new Font("Matura MT Script Capitals",Font.BOLD,21));
        lbTopic.setBounds(155,190,330,29);
        MainPage.getContentPane().add(lbTopic);
        
        JButton btnOrder = new JButton("Order");
        btnOrder.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                MainPage.dispose();
                new FoodMenu().setVisible(true);
            }
        });
        btnOrder.setBounds(225,250,140,45);
        MainPage.getContentPane().add(btnOrder);
        
        JLabel lbWallpaper = new JLabel();
        lbWallpaper.setIcon(new ImageIcon("src/finalassignment/picture/Background.png"));
        lbWallpaper.setBounds(0,0,600,600);
        MainPage.getContentPane().add(lbWallpaper);
        
        MainPage.setSize(600,600);
	MainPage.setVisible(true);
	MainPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
        MainPage.getContentPane().setLayout(null);
    }
    
    public void setVisible(boolean visible){
        if(MainPage != null){
            MainPage.setVisible(visible);
        }
    }
    
    public static void main(String[] args){
        new MainPage();
    }
}
