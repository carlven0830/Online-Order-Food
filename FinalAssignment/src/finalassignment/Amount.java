package finalassignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.event.*;

public class Amount {
    private JFrame Amount;
    private FoodMenu FM;
    private DrinkMenu DM;
    private Coupon DC;
    private Context context;
    double totalAmount;
    double afterDisAmount;
    
    public Amount(){
        Amount = new JFrame("Carlven Restaurant");  
        
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Amount.dispose();
                new Coupon().setVisible(true);
            }
        });
        btnBack.setBounds(45,35,100,35);
        Amount.getContentPane().add(btnBack);
        
        FM = new FoodMenu();
        JLabel lbFood = new JLabel("Food Amount: RM " + FM.totalFood);
        lbFood.setFont(new Font("Arial Black",Font.BOLD,17));
        lbFood.setBounds(170,150,270,30);
        Amount.getContentPane().add(lbFood);
        
        DM = new DrinkMenu();
        JLabel lbDrink = new JLabel("Drink Amount: RM " + DM.totalDrink);
        lbDrink.setFont(new Font("Arial Black",Font.BOLD,17));
        lbDrink.setBounds(170,190,270,30);
        Amount.getContentPane().add(lbDrink);
        
        context = new Context(new AddOperation());
        totalAmount = context.executeStrategy(FM.totalFood, DM.totalDrink);
        JLabel lbTotal = new JLabel("Total Amount: RM " + totalAmount);
        lbTotal.setFont(new Font("Arial Black",Font.BOLD,17));
        lbTotal.setBounds(170,230,270,30);
        Amount.getContentPane().add(lbTotal);
        
        DC = new Coupon();
        JLabel lbCoupon = new JLabel("Discount: RM " + DC.discount);
        lbCoupon.setFont(new Font("Arial Black",Font.BOLD,17));
        lbCoupon.setBounds(170,270,270,30);
        Amount.getContentPane().add(lbCoupon);
        
        context = new Context(new MinusOperation());
        afterDisAmount = context.executeStrategy(totalAmount, DC.discount);
        JLabel lbAfterDis = new JLabel("Total After Discount: RM " + afterDisAmount);
        lbAfterDis.setFont(new Font("Arial Black",Font.BOLD,17));
        lbAfterDis.setBounds(140,310,350,30);
        Amount.getContentPane().add(lbAfterDis);
        
        JLabel lbWallpaper = new JLabel();
        lbWallpaper.setIcon(new ImageIcon("src/finalassignment/picture/Background.png"));
        lbWallpaper.setBounds(0,0,600,600);
        Amount.getContentPane().add(lbWallpaper);
        
        Amount.setSize(600,600);
	Amount.setVisible(true);
	Amount.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Amount.getContentPane().setLayout(null);
    }
    
    public void setVisible(boolean visible){
        if(Amount != null){
            Amount.setVisible(visible);
        }
    }
}
