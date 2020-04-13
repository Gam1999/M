import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PokemonGame{
    
    public static void main(String[] args){ 
        //FormGUI
        EventQueue.invokeLater(new Runnable() {
			public void run() {
                Form1 form = new Form1();
	            form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                form.setSize(1000, 600); 

				
                //image
				ImagePanel panel = new ImagePanel(new ImageIcon("ProPokemon.jpg").getImage());
                panel.setLayout(null);
                panel.setBounds(120, 0, 950, 950);//x y w h
    			form.getContentPane().add(panel);
    		
                //config windowcom
                //image background 
                Dimension screenSize = Toolkit.getDefaultToolkit ( ).getScreenSize ( );
                int x = ( screenSize.width - form.getWidth ( ) ) / 2;
                int y = ( screenSize.height - form.getHeight ( ) ) / 2;
		        form.setVisible(true);
                form.setLocation(x, y);
		        form.setResizable(false);
            }
		});
        
        //Hello Pokemon
        System.out.println("Hello Pokemon");
        System.out.println();

        /*Status status = new Status();
        status.statusPikachu();
        status.statusCharmender();
        status.statusTosakinto();*/
        //catchANDbag
        //CatchAndBag catchpokemon = new CatchAndBag();
       // catchpokemon.catchandbag();

    }
}