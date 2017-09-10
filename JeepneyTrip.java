class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final double BASE_FARE = 7.0;
  final double BASE_DISCOUNT = 6.0;
  final double EXCESS_FARE = 0.5;
  
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  // double -> double
  // Returns a value if there is an exccess distance or more than the 
  // base distance which is 5 kilometers. Returns zero if there is non.
  double excessDistance(double distance) {
    if (distance <= BASE_KM) {
      return 0;
    } else {
      return distance - BASE_KM;
    }
  } 
  
  // int, double, int -> double 
  // returns the computed fare of passengers considering 
  //its type (regular or discounted passengers).  
  double computeFare(int passengers, double fare) {
  return passengers * (fare + (excessDistance(distance) * EXCESS_FARE)) ;
  }
  
  // -> double 
  // Returns the total fare, given the total payment of passengers 
  // including the discounted passengers.
  double totalFare() {
  return computeFare(totalPassengers - discountPassengers, BASE_FARE)
    + computeFare(discountPassengers, BASE_DISCOUNT);
  }
  
  // double -> double
  // Returns the change, given the payment fare, total number of passengers,
  // number of passengers with discount, and the trip distance.
  double fareChange(double payment) {
    return payment - totalFare();
  }
  
}
