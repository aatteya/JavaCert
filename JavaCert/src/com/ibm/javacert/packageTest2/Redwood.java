package com.ibm.javacert.packageTest2;

public class Redwood extends Tree {

	public void go(){
		go2(new Tree(), new Redwood());
		go2((Redwood) new Tree(), new Redwood());
	}
	
	public void go2(Tree t1, Redwood r1){
		Redwood r2 = (Redwood) t1;
		Tree t2 = (Tree) r1;
	}
}

class Tree{}