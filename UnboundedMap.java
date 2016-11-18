package agh.cs.lab5;

import java.util.ArrayList;
import java.util.List;

import agh.cs.lab2.MoveDirection;
import agh.cs.lab2.Position;
import agh.cs.lab4.Car;
import agh.cs.lab4.IWorldMap;
import agh.cs.lab4.MapVisualizer;

public class UnboundedMap extends AbstractWorldMap implements IWorldMap  {
	
	private List<Car> cars = new ArrayList<>();
	private List<HayStack> stacks = new ArrayList<>();
	
	private int S,W,E,N;
    
	
	public void addStack(HayStack stack){
		this.stacks.add(stack);
	}
	
	public void bound(){
		for(Car c: cars)
			saveBound(c.getPosition());
		
		for(HayStack s: stacks)
			saveBound(s.getPosition());
	}
	
	public void saveBound(Position posit){
		if(posit.x<this.S)
			this.S=posit.x;
		
		if(posit.y<this.W)
			this.W=posit.y;
		
		if(posit.x>this.N)
			this.N=posit.x;
		
		if(posit.y>this.E)
			this.E=posit.y;
		}
		
	@Override
	public boolean canMoveTo(Position position) {
		return (!isOccupied(position));
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
		for(HayStack s: stacks){
			if(s.getPosition().equals(position))
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
		for(HayStack s: stacks){
			if(s.getPosition().equals(position))
				return s;
		}
		return null;
	}
	
	@Override
	public String toString(){
		MapVisualizer mv = new MapVisualizer();
		this.S=Integer.MAX_VALUE;this.W=Integer.MAX_VALUE;this.E=Integer.MIN_VALUE;this.N=Integer.MIN_VALUE;
		bound();
		return mv.dump(this, new Position (S,W), new Position (N,E));
	}
	
}

