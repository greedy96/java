package agh.cs.lab2;

public class CarSystem {

	public static void main(String[] args) {
		Position position1 = new Position(1,2);
		System.out.println(position1);
		Position position2 = new Position(-2,1);
		System.out.println(position2);
		System.out.println(position1.smaller(position2));
		System.out.println(position1.larger(position2));
		System.out.println(position1.add(position2));
		Position position3 = new Position (1,2);
		System.out.println(position1.equals(position2));
		System.out.println(position1.equals(position3));
		
		System.out.println(MapDirection.South.toString());
		
		MapDirection kierunek = MapDirection.North;
		System.out.println(kierunek.previous());
		
		Position p1 = new Position (3,4);
	      Position p2 = new Position (6,1);
	      Position p3 = new Position (9,5);
	      
	      System.out.println(p1.add(p2).equals(p3));
	}

}
