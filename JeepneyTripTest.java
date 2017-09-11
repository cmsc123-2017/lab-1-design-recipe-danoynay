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
    //without discount
    JeepneyTrip t1 = new JeepneyTrip(4.5, 1, 0);
    JeepneyTrip t2 = new JeepneyTrip(4.5, 1, 1);
    JeepneyTrip t3 = new JeepneyTrip(5, 2, 1);
    //with discount
    JeepneyTrip t7 = new JeepneyTrip(5.5, 1, 0);
    JeepneyTrip t8 = new JeepneyTrip(5.5, 1, 1);
    JeepneyTrip t9 = new JeepneyTrip(5.5, 2, 1);
    
    //without discount
    assertEquals(3.0, t1.fareChange(10));
    assertEquals(4.0, t2.fareChange(10));
    assertEquals(7.0, t3.fareChange(20));
    //with discount
    assertEquals(2.75, t7.fareChange(10));
    assertEquals(3.75, t8.fareChange(10));
    assertEquals(6.5, t9.fareChange(20));
  }
  
  public void testTotalFare() {
    JeepneyTrip t1 = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t2 = new JeepneyTrip(7, 2, 1);
  
    assertEquals(6.0, t1.totalFare());
    assertEquals(15.0, t2.totalFare());
  }
  
  public void testComputeFare() {
    JeepneyTrip t1 = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t2 = new JeepneyTrip(7, 2, 1);
  
    assertEquals(7.0, t1.computeFare(1, 7.0));
    assertEquals(16.0, t2.computeFare(2, 7.0));
  }
  
  public void testExcessDistance() {
    JeepneyTrip t1 = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t2 = new JeepneyTrip(7, 2, 1);
  
    assertEquals(0.0, t1.excessDistance(5));
    assertEquals(2.0, t2.excessDistance(7));
  
   }
}
