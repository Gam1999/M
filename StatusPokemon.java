import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.io.FileInputStream;

public class StatusPokemon extends JFrame {
	private static UserName player ;
	private Container gameUI;
	private JPanel status;
	Pikachu pikachu = new Pikachu("PIKACHU");
	public StatusPokemon(){

		// Create Form Frame
		setTitle("StatusPokemon");
		setSize(1000, 600);
		setLocation(400, 280);
	
        //Color
        Color aliceBlue = new Color(255,248,220);
        getContentPane().setBackground(aliceBlue);

        //imageicon tiTLE
        ImageIcon ImageIcon = new ImageIcon("boll.png");
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
        statuspokemon();
		BackForm3();
	}

    public void statuspokemon(){
		// Button
		JButton Status = new JButton("Status");
		Status.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Check Checkbox 1
                    System.out.println("Pikachu");
					player =new UserName("");
					JOptionPane.showMessageDialog(null,
							"Pikachu HP: " + pikachu.getEatBerry()+ "\n"+
							"Name"+player.getUserName());            
			}
		});
		Status.setBounds(25, 54, 89, 23);
		getContentPane().add(Status);
    }





	  public void BackForm3(){
		JButton buttonBackForm3 = new JButton("Back");
		buttonBackForm3.setBounds(600, 490, 160, 40);
		buttonBackForm3.setBackground ( Color.BLACK );
		buttonBackForm3.setForeground ( Color.WHITE );

	try 
		{
		//Font myFont = new Font("Serif", Font.BOLD, 20);
		Font myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "04B_08__.ttf" ) );
		 myFont2 =  myFont2.deriveFont ( Font.BOLD, 20f );
		
		buttonBackForm3.setFont( myFont2);
		} 
		catch ( Exception error )
		{

		}
		
        // Create Event for Button
		buttonBackForm3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				// New Form
				Form3Pokemon form3pokemon = new Form3Pokemon();	
				 		 
				form3pokemon.setVisible(true);
	
				// Hide Current Form

				setVisible(false);
				form3pokemon.setResizable(false);
			}
		});		
		getContentPane().add(buttonBackForm3);
	}
}