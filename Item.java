class Item{
  double price;
  double sale;
  
  // constants
  final double SALE_LIMIT = 1000.0;
  
  
  Item(double price, double sale) {
    this.price = price;
    this.sale = sale;
  }
  
  // -> double
  // Returns the price of an item, reduced by the given sale percentage
  double computeSalePrice() {
    return price - (sale * price);
  }
  
  // -> double
  // Given the item price and sale percentage, apply the
  // sale to the item price if price exceeds 1000, otherwise
  // return the original price
  double salePrice1000(){
    if (price > SALE_LIMIT) {
      return computeSalePrice();
    } else {
      return price;
    }
  }
  
}