/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookieclick;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author coolDawg1234
 */
public class CookieClick extends JFrame
{
    
    int cookies;
    JPanel jp = new JPanel();
    JButton jb = new JButton();
    
    
    public CookieClick() 
        {
        this.cookies = 0;
        setTitle("Cookie Clicker");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jb.setIcon(new ImageIcon("C:\\Users\\coolDawg1234\\Downloads\\cookie.jpg"));
        jp.add(jb);
        add(jp);
        
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
		cookies += 1;
               
                
                if (cookies >= 50){cookies += 2;}
                
			
            
                if (cookies >=100) {cookies += 4;}
                
                
                System.out.println(cookies + " cookies");
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
		});
        
        validate();
        
        }
    
    public static void main(String[] args) {
    
    CookieClick c = new CookieClick();
    }
    
}
