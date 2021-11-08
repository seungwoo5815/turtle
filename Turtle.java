import java.awt.*;
import javax.swing.*;

import java.util.Arrays;
import java.util.Random;

public class Turtle {

	private static final int FRAME_WIDTH = 690;
	private static final int FRAME_HEIGHT = 650;
	private static int pacmanH, pacmanW, enemyH, enemyW, numOfDot, where, start;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frame = new JFrame();

		final ImageIcon wall = new ImageIcon("wall.png");
		final ImageIcon empty = new ImageIcon("empty.png");
		final ImageIcon pacman = new ImageIcon("pacman.png");
		final ImageIcon stop = new ImageIcon("1108.png");
		

		pacmanH=12;  pacmanW=7;
		
		
		final JLabel[][] f = new JLabel[14][14];
		
		int[][] array = new int[14][14];
		
		Random r = new Random();
		int temp = 0;
		
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 14; j++) {
					temp = (int)r.nextInt(100);
					if (temp >= 0 && temp < 60) {
						array [i][j] = 0;
					}
					
					else if (temp >= 60 && temp <75) {
						array [i][j] = 1;
					}
					
					else if (temp >= 75 && temp < 85) {
						array [i][j] = 2;
					}
					
					else if (temp >= 85 && temp < 100) {
						array [i][j] = 3;
					}
			}
		}
		
		
		for (int i=0; i<14; i++) {
			for(int j=0; j<14; j++) {
				f[i][j] = new JLabel();
			}
		}

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(14,14));
		frame.requestFocus();


		for(int i=0; i<14; i++) {
			for(int j=0; j<14; j++) {
					f[i][j].setIcon(wall);
					panel.add(f[i][j]);
				
			}
		}
		
		for(int i=1; i<13; i++) {
			for(int j=1; j<13; j++) {
				
	
				if (array[i][j] == 0)
					f[i][j].setIcon(empty);
				else if (array[i][j] == 1)
					f[i][j].setIcon(pacman);
				else if (array[i][j] == 2)
					f[i][j].setIcon(stop);
				else if (array[i][j] == 3)
					f[i][j].setIcon(empty);
				
				
					
					frame.add(panel);
				
			}
		}
		
		f[12][7].setIcon(pacman);
		
		
		
		frame.setTitle("TurtleGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
		
	}
