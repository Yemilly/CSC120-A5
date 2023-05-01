
import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> carsAttached;

    /** creates new train
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.carsAttached = new ArrayList<Car>(nCars);
        for( int i =0; i < nCars; i++){
            Car car = new Car(passengerCapacity);
            this.carsAttached.add(car);

        }
    }


/** engine getter
 * @return
 */
public Engine getEngine(){
    return this.engine;

}

/** car getter
 * @param i
 * @return
 */
public Car getCar(int i){
    return this.carsAttached.get(i);

}

/** max capacity getter
 * @return total capacity
 */
public int getMaxCapacity(){
    int totalCapacity = 0;
    for (int i=0; i< carsAttached.size(); i++){
        totalCapacity += carsAttached.get(i).getCapacity();

    }
    return totalCapacity;
}

/** seats remaining in cars 
 * @return number of  total seats remaining 
 */
public int seatsRemaining(){
    int totalRemaining = 0;
    for(int i = 0; i < carsAttached.size(); i++){
        totalRemaining += carsAttached.get(i).seatsRemaining();

    }
    return totalRemaining;

}

/** prints the list of passengers on the train
 */
public void printManifest(){
    for(int i = 0; i < carsAttached.size(); i++){
        carsAttached.get(i).printManifest();

    }
}

public static void main(String[] args) {
    Train myTrain= new Train(FuelType.STEAM, 100, 10, 50);
    Passenger p4Passenger= new Passenger("Soto");
    p4Passenger.boardCar(myTrain.getCar(5));
    myTrain.getCar(5);
    myTrain.getEngine();
    System.out.println(myTrain.getMaxCapacity());
    System.out.println(myTrain.seatsRemaining());
    myTrain.printManifest();

}

}
