import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class IO {
	int[][] mines;
	private int maximummines = 0;
	private int width;
	private int height;
	Random rr;

	public IO(int width, int height) {
this.width = width;
this.height = height;
		mines = new int[width][height];

		rr = new Random();
		maximummines = width * height - 1;
	}

	public void InitializeMines(int totalMines, int[] location) {
		
		int maxMine = (width * height) - 1;
		
		if (totalMines > maxMine) {
			totalMines = maxMine;
		} else if (totalMines < 1) {
			totalMines = 1;
		}
		ArrayList<Integer> mineLocationList = new ArrayList<Integer>();
		
		int ctr = 0;
		
		while (totalMines > 0) {
			int r = rr.nextInt(width * height);
			while (mineLocationList.contains(r)) {
				r = rr.nextInt(width * height);
				System.out.println(r);
			}
			mineLocationList.add(r);
			totalMines--;
		}
		
	}

}
