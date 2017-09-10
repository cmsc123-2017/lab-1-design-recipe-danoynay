import junit.framework.TestCase;

public class ItemTest extends TestCase {

  // Constructor: Item(double price, double sale)
  
  public void ItemTestCreated() {
    Item t = new Item(1000.0, 0.10);
    
    assertEquals(1000.0, t.price);
    assertEquals(0.10, t.sale);

  }
  
  public void testSalePrice1000() {
    Item t1 = new Item(999.0, 0.10);
    Item t2 = new Item(999.5, 0.10);
    Item t3 = new Item(1000.0, 0.10);
    Item t4 = new Item(1000.1, 0.10);
    Item t5 = new Item(1010.0, 0.10);

    assertEquals(999.0, t1.salePrice1000()); 
    assertEquals(999.5, t2.salePrice1000());
    assertEquals(1000.0, t3.salePrice1000());
    assertEquals(900.09, t4.salePrice1000()); 
    assertEquals(909.0, t5.salePrice1000());
  }
  
  public void testComputeSalePrice() {
    Item s1 = new Item(1001.0, 0.10);
    Item s2 = new Item(1100.0, 0.10);
    Item s3 = new Item(1500.5, 0.10);
    
    assertEquals(900.9, s1.computeSalePrice());
    assertEquals(990.0, s2.computeSalePrice());
    assertEquals(1350.45, s3.computeSalePrice());
                 
  }

}