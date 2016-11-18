package agh.cs.lab3;

import agh.cs.lab2.MapDirection;
import agh.cs.lab2.MoveDirection;
import agh.cs.lab2.Position;

public class Car {
	private MapDirection kierunek=MapDirection.North;
	private Position pozycja = new Position(2,2);

    private final static Position SWBound = new Position(0,0);
    private final static Position NEBound = new Position(4,4);	
	
	public String toString(){
		return ("("+pozycja.x+","+pozycja.y+") kierunek: "+kierunek);
	}
	
	public void move(MoveDirection direction){
		switch (direction){
		case Forward:
			run(1);
			break;
		case Backward:
			run(-1);
			break;
		case Right:
			kierunek=kierunek.next();
			break;
		case Left:
			kierunek=kierunek.previous();
			break;
		}
	}

	private void run(int i) {
		Position newpozycja = new Position(0,0);
		switch(kierunek){
		case North:
			newpozycja=pozycja.add(new Position(i,0));
			break;
		case East:
			newpozycja=pozycja.add(new Position(0,i));
			break;
		case South:
			newpozycja=pozycja.add(new Position(-i,0));
			break;
		case West:
			newpozycja=pozycja.add(new Position(0,-i));
			break;
		}
		if (newpozycja.larger(SWBound) && newpozycja.smaller(NEBound)) pozycja=newpozycja;
		
	}
}
