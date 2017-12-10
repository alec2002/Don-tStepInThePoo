import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MineSweeper implements ActionListener {
	GameGraphics g;
    IO logic;
    private boolean gamestart = false;
public static void main(String[] args) {
	
	MineSweeper m = new MineSweeper();
	m.startGame();
}
void startGame(){
 g = new GameGraphics(this, 10, 10);
 logic = new IO(10, 10);
}
@Override
public void actionPerformed(ActionEvent e) {
	int[] loc = g.getMineLocation(e);
	System.out.println(loc[0] + "_" + loc[1]);
	if (gamestart == false) {
		gamestart = true;
		logic.InitializeMines(10, loc);
	}
}
}
