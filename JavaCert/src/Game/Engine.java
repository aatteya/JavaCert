package Game;

public class Engine {
	private int size;
	private Board b, bTiles;
	
	public Engine(int size){
		setB(new Board(size));
		setbTiles(new Board(size));
		this.setSize(size);
	}
	
	public boolean Play(Tile t, int x, int y){
		int u,d,l,r;
		u=t.getUp();
		d=t.getDown();
		l=t.getLeft();
		r=t.getRight();
		int uAdj=b.getAdjacentNumber('u', x, y);
		int dAdj=b.getAdjacentNumber('d', x, y);
		int lAdj=b.getAdjacentNumber('l', x, y);
		int rAdj=b.getAdjacentNumber('r', x, y);
		if((uAdj<0 || uAdj == u) && (dAdj<0 || dAdj == d) && (lAdj<0 || lAdj==l) && (rAdj<0 || rAdj==r)){
			b.insert(t,x,y);
			return true;
		}
		return false;
		
	}
	
	public void generateTiles(){
		for(int i=0;i<3;i++){
			for(int j=0; j<3;j++){
				int u,l,r,d;
				u=(int) (Math.random()*9.0);
				d=(int) (Math.random()*9.0);
				r=(int) (Math.random()*9.0);
				l=(int) (Math.random()*9.0);
				bTiles.insert(new Tile(u,d,l,r), i, j);
				
			}
		}
	}
	
	public void move(){
		//move a tile from one board to another
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Board getB() {
		return b;
	}

	public void setB(Board b) {
		this.b = b;
	}

	public Board getbTiles() {
		return bTiles;
	}

	public void setbTiles(Board bTiles) {
		this.bTiles = bTiles;
	}
	
	

}
