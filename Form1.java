import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;
public class Form1 extends JFrame{ 
  
    public Form1(){

		setTitle("Pokemon Game");
	    // Create Form Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		getContentPane().setLayout(null);
         
        //imageicon
        ImageIcon ImageIcon = new ImageIcon("boll.png");
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);


        //Color
        Color aliceBlue = new Color(255,255,255);
        getContentPane().setBackground(aliceBlue);	

        // Create Button
		JButton buttonPlay = new JButton("PLAYGAME");
		buttonPlay.setBounds(430, 440, 180, 60);
		buttonPlay.setBackground ( Color.BLACK );
		buttonPlay.setForeground ( Color.WHITE );

		try 
		{
		//Font myFont = new Font("Serif", Font.BOLD, 20);
			Font myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "04B_08__.ttf" ) );
			myFont = myFont.deriveFont ( Font.BOLD, 20f );
			buttonPlay.setFont(myFont);
		} 
		catch ( Exception error )
		{

		}
		
        // Create Event for Button
		buttonPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				// New Form
				FormCharecter formcharecter = new FormCharecter();
				formcharecter.setVisible(true);

				// Hide Current Form
				setVisible(false);
				formcharecter.setResizable(false);
			}
		});		
		getContentPane().add(buttonPlay);
   }

}


