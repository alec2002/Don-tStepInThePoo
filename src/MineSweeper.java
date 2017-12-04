
public class MineSweeper {
	Graphics g;
public static void main(String[] args) {
	
	MineSweeper m = new MineSweeper();
	m.startGame();
}
void startGame(){
	g = Graphics.getInstance();
	g.initialize(10, 10);
}
}
