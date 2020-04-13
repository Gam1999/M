import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.FileInputStream;

public class FormCharecter extends JFrame {	
	private static UserName player;
	private Container gameUI;
	private JPanel status;
	//TestName player = new TestName();
	//Container gameUI = new Container();
	public FormCharecter() {
		// Create Form Frame
		setTitle("Form2");
		setSize(1000, 600);
		setLocation(400, 280);
		ImagePanel panel5 = new ImagePanel(new ImageIcon("man.png").getImage());
    	panel5.setLayout(null);
        panel5.setBounds(500, 15, 600, 500);//x y w h
    	this.getContentPane().add(panel5);
		
		ImagePanel panel6 = new ImagePanel(new ImageIcon("wumen.png").getImage());
    	panel6.setLayout(null);
        panel6.setBounds(250, 95, 950, 1000);//x y w h
    	this.getContentPane().add(panel6);
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
        //Color
        Color aliceBlue = new Color(255,248,220);
        getContentPane().setBackground(aliceBlue);

        //imageicon tiTLE
        ImageIcon ImageIcon = new ImageIcon("boll.png");
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
		


		// Create text
		JLabel label = new JLabel("CHARECTER");
		label.setBounds(400, 30, 300, 60);
		getContentPane().add(label);

		try 
		{
		//Font myFont = new Font("Serif", Font.BOLD, 20);
		Font myFont3 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "Savage.ttf" ) );
		myFont3 = myFont3.deriveFont ( Font.BOLD, 40f );
		
		label.setFont(myFont3);
		} 
		catch ( Exception error )
		{

		}

		//button next page
		JButton buttonToko = new JButton("Toko");
		buttonToko.setBounds(250, 490, 160, 40);
		buttonToko.setBackground ( Color.BLACK );
		buttonToko.setForeground ( Color.WHITE );
        
		
       try 
		{
		//Font myFont = new Font("Serif", Font.BOLD, 20);
		Font myFont1 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "04B_08__.ttf" ) );
		myFont1 = myFont1.deriveFont ( Font.BOLD, 20f );
		
		buttonToko.setFont(myFont1);
		} 
		catch ( Exception error )
		{

		}
		
        // Create Event for Button
		buttonToko.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				 // New Form
				Form3Pokemon form3pokemon = new Form3Pokemon();

				//Enter you character name
				gameUI = form3pokemon.getContentPane();
        		gameUI.setLayout(new BorderLayout());

				player = new UserName(JOptionPane.showInputDialog("Enter you character name"));

				JLabel namelb = new JLabel("NAME: "+player.getUserName().toUpperCase());
			
				status = new JPanel();
				status.setBounds(223, 67, 133, 92);
				status.setLayout(new BoxLayout(status,BoxLayout.Y_AXIS));
        		namelb.setFont(new Font("Serif",Font.PLAIN,20));
				
				status.add(namelb);gameUI.add(status,BorderLayout.NORTH);
				gameUI.add(status,BorderLayout.NORTH);
				form3pokemon.setVisible(true);
				 
				// Hide Current Form
				setVisible(false);
				form3pokemon.setResizable(false);
			}
		});		
		getContentPane().add(buttonToko);

		JButton buttonNate = new JButton("Nate");
		buttonNate.setBounds(600, 490, 160, 40);
		buttonNate.setBackground ( Color.BLACK );
		buttonNate.setForeground ( Color.WHITE );

	try 
		{
		//Font myFont = new Font("Serif", Font.BOLD, 20);
		Font myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "04B_08__.ttf" ) );
		 myFont2 =  myFont2.deriveFont ( Font.BOLD, 20f );
		
		buttonNate.setFont( myFont2);
		} 
		catch ( Exception error )
		{

		}
		
        // Create Event for Button
		buttonNate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				 // New Form
				Form3Pokemon form3pokemon = new Form3Pokemon();	
				
				//Enter you character name
				gameUI = form3pokemon.getContentPane();
        		gameUI.setLayout(new BorderLayout());

				player = new UserName(JOptionPane.showInputDialog("Enter you character name"));

				JLabel namelb = new JLabel("NAME: "+player.getUserName().toUpperCase());

				status = new JPanel();
				status.setBounds(223, 67, 133, 92);
				status.setLayout(new BoxLayout(status,BoxLayout.Y_AXIS));
        		namelb.setFont(new Font("Serif",Font.PLAIN,20));
				
				status.add(namelb);gameUI.add(status,BorderLayout.NORTH);
				gameUI.add(status,BorderLayout.NORTH);
				form3pokemon.setVisible(true);
	
				 // Hide Current Form
				setVisible(false);
				form3pokemon.setResizable(false);
			}
		});		
		getContentPane().add(buttonNate);
	}	 

}