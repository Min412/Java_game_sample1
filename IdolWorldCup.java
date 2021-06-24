
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IdolWorldCup {
	static JPanel panelNorth;
	static JPanel panelCenter;
	static JLabel labelMessage;
	static JLabel labelVs;
	static JButton buttonLeft;
	static JButton buttonRight;
	static String[] images= {
		"Idol01.jpg","Idol02.jpg","Idol03.jpg","Idol04.jpg",	
		"Idol05.jpg","Idol06.jpg","Idol07.jpg","Idol08.jpg",	
		"Idol09.jpg","Idol10.jpg","Idol11.jpg","Idol12.jpg",
		"Idol13.jpg","Idol14.jpg","Idol15.jpg","Idol16.jpg"	
	};
	static int imageIndex = 2; 
	
	static ImageIcon changeImage(String filename) {
		ImageIcon icon = new ImageIcon("./"+filename);
		Image originImage = icon.getImage();
		Image changedImage = originImage.getScaledInstance(200,200,Image.SCALE_SMOOTH);
		ImageIcon icon_new = new ImageIcon(changedImage);
		return icon_new;
	}
	
	static class MyFrame extends JFrame implements ActionListener{
		public MyFrame(String title) {
			super(title);
			
			//ui init
			this.setSize(450, 250);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panelNorth = new JPanel();
			labelMessage = new JLabel("Find Your Idol");
			labelMessage.setFont(new Font("Arial", Font.BOLD,20));
			panelNorth.add(labelMessage);
			this.add("North", panelNorth);
			
			panelCenter= new JPanel();
			labelVs= new JLabel("vs");
			labelVs.setFont(new Font("Arial", Font.BOLD,20));
			
			buttonLeft = new JButton("LeftButton");
			buttonLeft.setIcon(changeImage("idol01.jpg"));
			buttonLeft.setPreferredSize(new Dimension(200, 200));
			
			buttonRight = new JButton("RightButton");
			buttonRight.setIcon(changeImage("idol02.jpg"));
			buttonRight.setPreferredSize(new Dimension(200, 200));
			
			buttonLeft.addActionListener(this);
			buttonRight.addActionListener(this);
			panelCenter.add(buttonLeft);
			panelCenter.add(labelVs);
			panelCenter.add(buttonRight);
			this.add("Center", panelCenter);
			
			this.pack();
		}
		
		//button click 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

	public static void main(String[] args) {
		new MyFrame("Idol World Cup");

	}

}
