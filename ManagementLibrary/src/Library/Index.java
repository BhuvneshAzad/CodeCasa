/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class  Index extends JFrame implements ActionListener {
    
    
    JLabel l1,l2,l3;
    JButton bt1,bt2;
    JPanel p1, p3;
    Font f, f1;
    JTextField tf1, tf2;
    
    
    
    
    Index(){
        
        super("Login Page");
        setLocation(500,350);
        setSize(500,200);
        
        
        f = new Font("Arial",Font.BOLD,25);
        f1 = new Font("Arial",Font.BOLD,20);
        
        l1 =new JLabel("ADMIN LOGIN");
        l2 =new JLabel("LIBRARIAN LOGIN");
        l3 =new JLabel("LIBRARY MANAGEMENT");
        
        bt1 = new JButton("Login");
        bt2 = new JButton("Login");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        
        l1.setFont(f1);
        l2.setFont(f1);
        
        l3.setFont(f);
        bt1.setFont(f1);
        bt1.setFont(f1);
        bt2.setFont(f1);
        
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(Color.WHITE);
        
        
       p1 = new JPanel();
       p1.setLayout(new GridLayout(2,2,10,10));
       p1.add(l1);
       p1.add(bt1);
       p1.add(l2);
       p1.add(bt2);
       
      
       
       
       
       
       
       
       
       p3 = new JPanel()
;
       p3.setLayout(new GridLayout(1,1,10,10));
       p3.add(l3);
       p3.setBackground(Color.BLUE);
       
               
               
               
      
       
       
       
       
       
       
       setLayout(new BorderLayout(10,10));
       add(p3,"North");
       add(p1,"Center");
        
        
        
        
        
        
                
        
    }
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource()==bt1){
            
            System.out.println("admin lodin");
            new Admin().setVisible(true);
            this.setVisible(false);
            
        }
        if(e.getSource()==bt2){
            
           new Librarian().setVisible(true);
            this.setVisible(false);
            
        
        }
        
        
    }   
    

    public static void main (String[] args){
        new Index().setVisible(true);
        
    }
}