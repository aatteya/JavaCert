package Game;

public class Tile {
	private int up, down, left, right;
	public Tile(int up, int down, int left, int right){
		this.up = up;
		this.down = down;
		this.right = right;
		this.left = left;
	}
	

	public int getDown() {
		return down;
	}

	public void setDown(int down) {
		this.down = down;
	}

	public int getUp() {
		return up;
	}

	public void setUp(int up) {
		this.up = up;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}
	
	@Override
	public String toString(){
		String s = "-----\n";
		s+= ("| " + this.up + " |\n");
		s+= ("|" + this.left + " " + this.right + "|\n");
		s+= ("| " + this.down + " |\n");
		s+= "-----\n";
		return s;
				
	}

	public void setRight(int right) {
		this.right = right;
	}

}
