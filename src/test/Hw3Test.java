package test;

import java.util.ArrayList;
import java.util.Random;

import api.Direction;
import api.Move;
import hw3.Game;
import hw3.GameUtil;
import ui.ConsoleUI;

public class Hw3Test {

	public static void main(String[] args) {
//		int[][] game = {{1,1,1},{1,1,0}};
//		int[][] prevGame = {{1,1,1},{1,1,1}};
//		System.out.println(java.util.Arrays.deepEquals(game, prevGame));
		
//		Game g = new Game(4, new GameUtil(), new Random(42));
//		int[][] test =
//		{
//		{0, 2, 3, 1},
//		{0, 3, 2, 4},
//		{0, 2, 3, 0},
//		{0, 3, 3, 0}
//		};
//		for (int row = 0; row < test.length; row += 1)
//		{
//		for (int col = 0; col < test[0].length; col += 1)
//		{
//		g.setCell(row, col, test[row][col]);
//		}
//		}
//		System.out.println("Before: ");
//		ConsoleUI.printGrid(g);
//		g.shiftGrid(Direction.UP);
//		System.out.println("After: ");
//		ConsoleUI.printGrid(g);
		
//		int[] temp= {1,2,1,2};
//		GameUtil g = new GameUtil();
//		System.out.println(g.shiftArray(temp) + Arrays.toString(temp));
		
//		int[][] test =
//			{
//			{0, 2, 3, 1},
//			{0, 1, 3, 2},
//			{0, 2, 3, 0},
//			{0, 1, 2, 0}
//			};
//			GameUtil util = new GameUtil();
//			 TilePosition tp =
//			 util.generateRandomTilePosition(test, new Random(), Direction.LEFT);
//			System.out.println(tp); // expected Position (2, 3) value 0
//		}
		
//		GameUtil util = new GameUtil();
//		System.out.println(util.getScoreForValue(1)); // expected 0
//		System.out.println(util.getScoreForValue(2)); // expected 0
//		System.out.println(util.getScoreForValue(3)); // expected 3
//		System.out.println(util.getScoreForValue(6)); // expected 9
//		System.out.println(util.getScoreForValue(48));// expected 243
		
//		GameUtil util = new GameUtil();
//		int[] test = {3, 1, 2, 0, 4};
//		ArrayList<Move> result = util.shiftArray(test);
//		System.out.println(Arrays.toString(test)); 
//		System.out.println(result);
		
		Game g = new Game(4, new GameUtil(), new Random(42));
		int[][] test =
		{
		{0, 2, 3, 1},
		{0, 1, 3, 2},
		{0, 2, 3, 0},
		{0, 1, 2, 0}
		};
		for (int row = 0; row < test.length; row += 1)
		{
		for (int col = 0; col < test[0].length; col += 1)
		{
		g.setCell(row, col, test[row][col]);
		}
		}
		ArrayList<Move> moves = g.shiftGrid(Direction.DOWN);
		System.out.println(moves);
	}
}
	

