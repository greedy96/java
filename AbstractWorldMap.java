package agh.cs.lab5;

import java.util.ArrayList;
import java.util.List;

import agh.cs.lab2.MoveDirection;
import agh.cs.lab2.Position;
import agh.cs.lab4.Car;

public abstract class AbstractWorldMap {
	private List<Car> cars = new ArrayList<>();
	
	public void run(MoveDirection[] directions) {
		int a = cars.size();
		for(int x = 0; x < directions.length;x++){
			cars.get(x%a).move(directions[x]);
		}
	}
	
	public boolean isOccupied(Position position) {
		for(Car c: cars){
			if(c.getPosition().equals(position))
				return true;
		}
		return false;
	}

	public Object objectAt(Position position) {
		for(Car c: cars){
			if(c.getPosition().equals(position))
				return c;
		}
		return null;
	}
	
}
