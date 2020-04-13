import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;

public class Form3Pokemon extends JFrame {	
	private static UserName player;;
	private int wildPokemon = (int)(Math.random());
	Pikachu pikachu = new Pikachu("PIKACHU");
   
	public Form3Pokemon(){

		// Create Form Frame
		setTitle("Nate");
		setSize(1000, 600);
		setLocation(400, 280);
		
		ImagePanel panel3 = new ImagePanel(new ImageIcon("boll.png").getImage());
    	panel3.setLayout(null);
        panel3.setBounds(160, 300,1000, 600);//x y w h
    	this.getContentPane().add(panel3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	
        //Color
        Color aliceBlue = new Color(255,248,220);
        getContentPane().setBackground(aliceBlue);

        //imageicon tiTLE
        ImageIcon ImageIcon = new ImageIcon("boll.png");
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
		
		gym();
		//Item();
		catchPokemon();
		Berry();
		status();
	}
	
	public void status(){
		pikachu.setEatBerry(50);
		JButton Status = new JButton("Status");
		Status.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Check Checkbox 1
                
					
                    System.out.println("Pikachu");
					player =new UserName("");
					JOptionPane.showMessageDialog(null,
							"Pikachu HP: " + pikachu.getEatBerry()+ "\n"+
							"Name"+player.getUserName()+ "\n"+
							"Level: "+pikachu.getL());            
			}
		});
		Status.setBounds(125, 54, 89, 23);
		getContentPane().add(Status);
    }







	public void catchPokemon(){
		JButton btn = new JButton("catch Pokemon");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Check Checkbox 1
                //ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
                
                if(wildPokemon == 0){
                    //pokemons.add(new Pikachu("Wild Pikachu"));
                    //bag.add(new Pikachu("Pikachu"));
                    System.out.println("Pikachu");
					JOptionPane.showMessageDialog(null,
							"Pikachu" );
                }
				/*if(wildPokemon == 1){
                    //pokemons.add(new Charmender("Wild Charmender"));
                    bag.add(new Pikachu("Charmender"));
                    System.out.println("Charmender");
					JOptionPane.showMessageDialog(null,
							"Charmender" );
                }
                if(wildPokemon == 2){
                    //pokemons.add(new Charmender("Wild test"));
                    bag.add(new Pikachu("TOSAKINTO"));
                    System.out.println("TOSAKINTO");
					JOptionPane.showMessageDialog(null,
							"TOSAKINTO" );
                }*/
			}
		});
		btn.setBounds(125, 154, 89, 23);
		getContentPane().add(btn);
	}

	public void Berry(){
		JButton Berry = new JButton("Berry");
		Berry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Check Checkbox 1
                
                if(wildPokemon == 0){
                    System.out.println("Pikachu");
					
					JOptionPane.showMessageDialog(null,
							"Pikachu HP: " + pikachu.getEatBerry());
					
                }
				/*if(wildPokemon == 1){
                    System.out.println("Charmender");
					JOptionPane.showMessageDialog(null,
							"Charmender HP: " +charmender.eatBerry());
                }
                if(wildPokemon == 2){
                    System.out.println("TOSAKINTO");
					JOptionPane.showMessageDialog(null,
							"TOSAKINTO HP: " +tosakinto.eatBerry());
                }*/
			}
		});
		Berry.setBounds(25, 54, 89, 23);
		getContentPane().add(Berry);
	}

	

	 public void checklevelUp(){
		pikachu.setExp(50);
        int level = pikachu.getExp()/20;
            pikachu.setL(level);
    }






	public void gym(){
		//button Gym
		JButton buttonGym = new JButton("Status");
		buttonGym.setBounds(460, 280, 100, 30);
		buttonGym.setBackground ( Color.BLACK );
		buttonGym.setForeground ( Color.WHITE );
        
		
       try 
		{
		//Font myFont = new Font("Serif", Font.BOLD, 20);
		Font myFont1 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "04B_08__.ttf" ) );
		myFont1 = myFont1.deriveFont ( Font.BOLD, 20f );
		
		buttonGym.setFont(myFont1);
		} 
		catch ( Exception error )
		{

		}
		
        // Create Event for Button
		buttonGym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				 // New Form
				StatusPokemon  form31 = new  StatusPokemon();
				form31.setVisible(true);

				
				 // Hide Current Form
				setVisible(false);
				form31.setResizable(false);
			}
		});		
		getContentPane().add(buttonGym);
	}
	/*public void Item(){
		JButton buttonItem = new JButton("Item");
		buttonItem.setBounds(600, 490, 160, 40);
		buttonItem.setBackground ( Color.BLACK );
		buttonItem.setForeground ( Color.WHITE );

	try 
		{
		//Font myFont = new Font("Serif", Font.BOLD, 20);
		Font myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "04B_08__.ttf" ) );
		 myFont2 =  myFont2.deriveFont ( Font.BOLD, 20f );
		
		buttonItem.setFont( myFont2);
		} 
		catch ( Exception error )
		{

		}
		
        // Create Event for Button
		buttonItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				 // New Form
				 FormBerry formitem = new FormBerry();			 
				 formitem.setVisible(true);
	
				 // Hide Current Form

				 setVisible(false);
				 formitem.setResizable(false);
			}
		});		
		getContentPane().add(buttonItem);
	}*/
}