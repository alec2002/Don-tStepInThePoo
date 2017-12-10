import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameGraphics {
	private JFrame frame;
	private JPanel panel;
	private JButton[][] mines;
	static private GameGraphics instance = null;
	public GameGraphics(ActionListener al, int width, int height){
		frame = new JFrame();
		panel = new JPanel(new GridLayout(width, height));
		mines = new JButton[width][height];
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < mines.length; i++) {
			for (int j = 0; j < mines[0].length; j++) {
				mines[i][j] = new JButton();
				panel.add(mines[i][j]);
				mines[i][j].addActionListener(al);
			}
		}
		frame.pack();
	}
	public int[] getMineLocation(ActionEvent e){
		JButton b = (JButton) e.getSource();
		int[] location = new int[2];
		for (int i = 0; i < mines.length; i++) {
			for (int j = 0; j < mines[0].length; j++) {
				if (b == mines[i][j]) {
					location[0] = i;
					location[1] = j;
				}
				
			}
			
		}
		return location;
	}
	


}
