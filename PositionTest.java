package agh.cs.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {

   @Test
   public void testSmaller1() {
      assertTrue (new Position(1,2).smaller(new Position (1,1)));
   }
   
   @Test
   public void testLarger1 (){
      assertFalse (new Position(1,2).larger(new Position (1,1)));
   }
   
   @Test
   public void testToString1 () {
      Position p1 = new Position (5,10);
      assertEquals (p1.toString(), "(5,10)");
   }
   
   @Test
   public void testToString2 () {
      Position p0 = new Position (-6,0);
      assertEquals (p0.toString(), "(-6,0)");
   }
   
   @Test
   public void testAdd (){
      Position p1 = new Position (3,4);
      Position p2 = new Position (6,1);
      Position p3 = new Position (9,5);
            
      assertEquals(p1.add(p2), p3);
      
   }
   

      
   
}