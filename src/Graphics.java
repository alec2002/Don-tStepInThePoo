import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Graphics {
	private JFrame frame;
	private JPanel panel;
	private JButton[][] mines;
	static private Graphics instance = null;
	private Graphics(){
		
	}
	
void initialize(int width, int height){
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
		}
	}
	frame.pack();
	
}
public static Graphics getInstance(){
	if (instance == null) {
		instance = new Graphics();
	}
	return instance;
}
}
