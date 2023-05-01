import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger>passengerOnboard;
    private int maxCapacity;

    /** car constructer 
     * 
     * @param max
     */
    public Car( int max){
        this.maxCapacity= max;
        this.passengerOnboard= new ArrayList<Passenger>();

    }
/** mac capacity getter
 * 
 * @return
 */
    public int getCapacity(){
        return this.maxCapacity;

    }
/** seat remaining in the car
 * @return
 */
    public int seatsRemaining(){
        return this.maxCapacity - this.passengerOnboard.size();

    }
/** seats available in the car
 * @return
 */
    public boolean seatAvailable(){
        return this.maxCapacity > this.passengerOnboard.size();

    }

    /** Adds passenger to car
     * @param p passanger 
     */
    public void addPassenger(Passenger p){
        if (seatAvailable()){
            this.passengerOnboard.add(p);

        }else{
            throw new RuntimeException("Sorry, no seats available");

        }
    }

    /** removes passanger
     * 
     * @param p passanger
     */
     public void removePassenger(Passenger p){
        if(this.passengerOnboard.contains(p)){
                this.passengerOnboard.remove(p);
            
        } else{
            throw new RuntimeException("Passenger is not onboard");

            }

        }

    
    public void printManifest(){
        if (this.passengerOnboard.size() > 0){
            for(Passenger p: passengerOnboard){
                    System.out.println(p.getName());

                }
         } else{
                System.out.println("This car is EMPTY");
            }

        }

        public static void main(String[] args) {
            Car myCar= new Car(10);
            Passenger p1Passenger=new Passenger("Yemilly");
            myCar.getCapacity();
            myCar.addPassenger(p1Passenger);
            myCar.printManifest();
        }
    }


    





