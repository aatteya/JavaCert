package Game;

public class Board {
	private int size;
	private Tile [][] board;
	
	public Board(int size){
		this.size=size;
		board = new Tile [size][size];
	}
	
	public int getAdjacentNumber(char direction, int x, int y){
		assert(direction == 'u' || direction == 'd' || direction == 'l' || direction == 'r'):"Invalid direction "
				+ "value in getAdjacent Number";
		try{
			switch(direction){
			case 'u': return board[x-1][y].getDown();
			case 'd': return board[x+1][y].getUp();
			case 'l': return board[x][y-1].getRight();
			case 'r': return board[x][y+1].getLeft();
			}
		}
		catch(ArrayIndexOutOfBoundsException aioobe){
			return -1;
		}
		catch(NullPointerException npe){
			return -1;
		}
		return -1;
	}
	
	public void insert(Tile t, int x, int y){
		board[x][y] = t;
	}
	
	public void delete(int x, int y){
		board[x][y] = null;
	}

	public Tile [][] getBoard() {
		return board;
	}

	public void setBoard(Tile [][] board) {
		this.board = board;
	}
	
	@Override
	public String toString(){
		String  s ="";
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				s +="-----";
			}
			s+= "\n";
			for(int j=0;j<size;j++){
				s +="| " + board[i][j].getUp() + " |";
			}
			s+= "\n";
			
			for(int j=0;j<size;j++){
				s +="|" + board[i][j].getLeft() + " " + board[i][j].getRight() + "|";
			}
			s+= "\n";
			
			for(int j=0;j<size;j++){
				s +="| " + board[i][j].getDown() + " |";
			}
			s+= "\n";
			for(int j=0;j<size;j++){
				s +="-----";
			}
			s+= "\n";
		}		
		return s;
	}

}
