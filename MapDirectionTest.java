package agh.cs.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MapDirectionTest {

   //North
   @Test
   public void testNorthNext() {
      assertEquals (MapDirection.North.next(), MapDirection.East);
   }
   
   @Test
   public void testNorthPrev () {
      assertEquals (MapDirection.North.previous(), MapDirection.West);
   }
   
   //South
   @Test
   public void testSouthNext() {
      assertEquals (MapDirection.South.next(), MapDirection.West);
   }
   
   @Test
   public void testSouthPrev () {
      assertEquals (MapDirection.South.previous(), MapDirection.East);
   }
   
   ///East
   @Test
   public void testEastNext() {
      assertEquals (MapDirection.East.next(), MapDirection.South);
   }
   
   @Test
   public void testEastPrev () {
      assertEquals (MapDirection.East.previous(), MapDirection.North);
   }
   
   //West
   @Test
   public void testWestNext() {
      assertEquals (MapDirection.West.next(), MapDirection.North);
   }
   
   @Test
   public void testWestPrev () {
      assertEquals (MapDirection.West.previous(), MapDirection.South);
   }
   
   
   
   

}