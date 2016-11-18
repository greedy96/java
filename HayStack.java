package agh.cs.lab5;

import agh.cs.lab2.Position;

public class HayStack {
	private Position pozycja;
	
	public HayStack(int x, int y){
		this.pozycja = new Position (x,y);
	}
	
	public Position getPosition(){
		return this.pozycja;
	}
	
	public String toString(){
		return "$";
	}
}
