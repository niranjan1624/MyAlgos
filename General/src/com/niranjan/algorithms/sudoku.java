package com.niranjan.algorithms;

public class sudoku {
	static int count = 0;
	public static void main(String[] args) {
		int[][] s_box = new int[9][9];
		s_box[0][0] = 9 ;
	      s_box[0][4] = 2 ;
	      s_box[0][6] = 7 ;
	      s_box[0][7] = 5 ;

	      s_box[1][0] = 6 ;
	      s_box[1][4] = 5 ;
	      s_box[1][7] = 4 ;

	      s_box[2][1] = 2 ;
	      s_box[2][3] = 4 ;
	      s_box[2][7] = 1 ;

	      s_box[3][0] = 2 ;
	      s_box[3][2] = 8 ;

	      s_box[4][1] = 7 ;
	      s_box[4][3] = 5 ;
	      s_box[4][5] = 9 ;
	      s_box[4][7] = 6 ;

	      s_box[5][6] = 4 ;
	      s_box[5][8] = 1 ;

	      s_box[6][1] = 1 ;
	      s_box[6][5] = 5 ;
	      s_box[6][7] = 8 ;

	      s_box[7][1] = 9 ;
	      s_box[7][4] = 7 ;
	      s_box[7][8] = 4 ;

	      s_box[8][1] = 8 ;
	      s_box[8][2] = 2 ;
	      s_box[8][4] = 4 ;
	      s_box[8][8] = 6 ;
		sudokuSolver(s_box);
	}

	public static void sudokuSolver(int[][] s_box) {
		try {
			auxSolver(0,0,s_box);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void auxSolver(int row, int col, int[][] s_box) throws Exception{
		String x = "";
		if (row == 9) {
			if(count != 0)
				 throw new Exception( "Solution found" ) ;
			count++;
			//System.out.println("start");
			for(int i=0;i<9;i++) {
				for (int j=0;j<9;j++) {
					x = x + " " + s_box[i][j];
				}
				System.out.println(x);
				x="";
			}
			return;
		}
			if(s_box[row][col] != 0) {	
				next(row, col, s_box);
			} else {
				for(int val = 1;val<=9;val++){
					if(valid(row,col,val,s_box)){ 
						s_box[row][col] = val;
						
						next(row, col, s_box);
					}
				}
				s_box[row][col] = 0;
				
			}
		}
	
public static void next(int row,int col,int[][] s_box) throws Exception {
	if(col<8)
		auxSolver(row, col+1, s_box);
	else
		auxSolver(row+1, 0, s_box);
}
	private static boolean valid(int row, int col, int val, int[][] s_box) {
		for(int i =0; i<9;i++){
			if(s_box[i][col] == val)
				return false;
			if(s_box[row][i] == val)
				return false;
		}
		int start_row = (row/3)*3;
		int start_col = (col/3)*3;
		for(int sr = 0; sr<3;sr++){
			for(int sc=0;sc<3;sc++){
				if(s_box[sr+start_row][sc+start_col]==val)
					return false;
			}
		}
		return true;
	}
}
