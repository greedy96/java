package agh.cs.lab2;

public class Position {
	public final int x;
	public final int y;
	
	public Position(int x, int y){
	    this.x = x;
	    this.y = y;
	  }
	
	public String toString(){
		return ("("+this.x+","+this.y+")");
	}
	
	public boolean smaller(Position other){
		return (this.x<=other.x && this.y<=other.y);
	}
	
	public boolean larger(Position other){
		return (this.x>=other.x && this.y>=other.y);
	}
	
	public Position add(Position other){
		return new Position(this.x+other.x,this.y+other.y);
	}
	
	public boolean equals(Position other){
		return (this.x==other.x&&this.y==other.y);
	}
}
		