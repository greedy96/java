package agh.cs.lab4;

import java.util.ArrayList;
import java.util.List;

import agh.cs.lab2.MoveDirection;
import agh.cs.lab2.Position;
	
public class RectangularMap implements IWorldMap {

	public final int width;
	public final int height;
	private final Position SWBound = new Position(0,0);
    private final Position NEBound;	
    private List<Car> cars = new ArrayList<>();
    
	public RectangularMap(int height, int width){
		this.NEBound = new Position(width,height);
		this.width=width;
		this.height=height;
	}
	@Override
	public boolean canMoveTo(Position position) {
		return (position.smaller(NEBound)&&position.larger(SWBound)&&!isOccupied(position));
	}

	@Override
	public boolean add(Car car) {
		if(this.canMoveTo(car.getPosition())){
			this.cars.add(car);
			return true;
		}
		return false;
	}

	@Override
	public void run(MoveDirection[] directions) {
		int a = cars.size();
		for(int x = 0; x < directions.length;x++){
			cars.get(x%a).move(directions[x]);
		}
	}

	@Override
	public boolean isOccupied(Position position) {
		for(Car c: cars){
			if(c.getPosition().equals(position))
				return true;
		}
		return false;
	}

	@Override
	public Object objectAt(Position position) {
		for(Car c: cars){
			if(c.getPosition().equals(position))
				return c;
		}
		return null;
	}
	
	@Override
	public String toString(){
		MapVisualizer mv = new MapVisualizer();
		return mv.dump(this, this.SWBound, this.NEBound);
	}

}
