import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class IO implements ActionListener{
	JButton[][] buttons;
	boolean[][] mines;
	private int maximummines = 0;
	private int width;
	private int height;
public IO(JButton[][] buttons, int totalmines){
	this.buttons = buttons;
	mines = new boolean[buttons.length][buttons[0].length];
   width = buttons.length;
	height = buttons[0].length;
	maximummines = width * height -1;
}
	
private void handleClick(int x, int y){
	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	
}
}
