import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
	int rowNumber = 4;
	int colNumber = 4;
	int[][] map;
	int[][] board;
	Scanner scan = new Scanner(System.in);
	Random rand =new Random();
	MayinTarlasi(int rowNumber,int colNumber){
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.map = new int[rowNumber][colNumber];
		this.board = new int[rowNumber][colNumber];
	}
	public void run() {
		
	}
	public void prepareGame() {
		
	}
}
