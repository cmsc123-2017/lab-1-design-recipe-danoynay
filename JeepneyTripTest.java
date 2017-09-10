import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class JeepneyTripTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  
  // Constructor: JeepneyTrip(double distance, int totalPassengers, int discountPassengers)
  
  public void testTripCreated() {
    JeepneyTrip t = new JeepneyTrip(5, 5, 3);
    
    assertEquals(5.0, t.distance);
    assertEquals(5, t.totalPassengers);
    assertEquals(3, t.discountPassengers);
  }
  
  public void testFareChange() {
    JeepneyTrip t1 = new JeepneyTrip(4.5, 1, 0);
    JeepneyTrip t2 = new JeepneyTrip(4.5, 1, 1);
    JeepneyTrip t3 = new JeepneyTrip(4.5, 2, 1);
    JeepneyTrip t4 = new JeepneyTrip(5, 1, 0);
    JeepneyTrip t5 = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t6 = new JeepneyTrip(5, 2, 1);
    JeepneyTrip t7 = new JeepneyTrip(5.5, 1, 0);
    JeepneyTrip t8 = new JeepneyTrip(5.5, 1, 1);
    JeepneyTrip t9 = new JeepneyTrip(5.5, 2, 1);
    
    assertEquals(3.0, t1.fareChange(10));
    assertEquals(4.0, t2.fareChange(10));
    assertEquals(7.0, t3.fareChange(20));
    assertEquals(3.0, t4.fareChange(10));
    assertEquals(4.0, t5.fareChange(10));
    assertEquals(7.0, t6.fareChange(20));
    assertEquals(2.75, t7.fareChange(10));
    assertEquals(3.75, t8.fareChange(10));
    assertEquals(6.5, t9.fareChange(20));
  }
  
}
